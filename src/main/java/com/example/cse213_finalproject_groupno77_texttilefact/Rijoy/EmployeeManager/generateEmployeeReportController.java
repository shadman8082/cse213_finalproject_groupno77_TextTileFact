package com.example.cse213_finalproject_groupno77_texttilefactory.EmployeeManager;

import com.example.cse213_finalproject_groupno77_texttilefactory.SceneSwitcher;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class generateEmployeeReportController {

    @FXML private ComboBox<String> criteriaCombo;
    @FXML private TableView<Employee> reportTable;
    @FXML private TableColumn<Employee, String> colID;
    @FXML private TableColumn<Employee, String> colName;
    @FXML private TableColumn<Employee, String> colRole;

    @FXML
    public void initialize() {

        // Load dropdown values
        criteriaCombo.getItems().addAll("All Employees", "By Role");

        // Setup table columns
        colID.setCellValueFactory(new PropertyValueFactory<>("employeeID"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colRole.setCellValueFactory(new PropertyValueFactory<>("role"));
    }

    // ============================================
    // GENERATE BUTTON FUNCTION
    // ============================================
    @FXML
    public void btnGenerateOnAction(ActionEvent event) {

        String choice = criteriaCombo.getValue();

        if (choice == null) {
            showAlert("Please select a criteria.");
            return;
        }

        reportTable.getItems().clear();

        if (choice.equals("All Employees")) {
            reportTable.getItems().addAll(EmployeeDataStore.employeeList);
        }

        else if (choice.equals("By Role")) {
            TextInputDialog dialog = new TextInputDialog();
            dialog.setTitle("Enter Role");
            dialog.setHeaderText("Enter the role to filter:");
            dialog.setContentText("Role:");

            String roleInput = dialog.showAndWait().orElse("");

            if (roleInput.trim().isEmpty()) {
                showAlert("Role cannot be empty.");
                return;
            }

            for (Employee e : EmployeeDataStore.employeeList) {
                if (e.getRole().equalsIgnoreCase(roleInput)) {
                    reportTable.getItems().add(e);
                }
            }
        }
    }

    // ============================================
    // DOWNLOAD BUTTON FUNCTION
    // ============================================
    @FXML
    public void btnDownloadOnAction(ActionEvent event) {

        StringBuilder report = new StringBuilder();

        for (Employee e : reportTable.getItems()) {
            report.append("ID: ").append(e.getEmployeeID()).append("\n");
            report.append("Name: ").append(e.getName()).append("\n");
            report.append("Role: ").append(e.getRole()).append("\n");
            report.append("----------------------\n");
        }

        saveReport(report.toString());
        showAlert("Report saved to employee_report.txt");
    }

    // ============================================
    // SAVE REPORT METHOD (YOUR CODE)
    // ============================================
    public void saveReport(String reportText) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("employee_report.txt", true))) {
            writer.println(reportText);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // ============================================
    // BACK BUTTON
    // ============================================
    @FXML
    public void backButtonOnAction(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("EmployeeDashboard.fxml", event);
    }

    // ============================================
    // SHORT ALERT METHOD
    // ============================================
    private void showAlert(String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(msg);
        alert.show();
    }
}
