package com.example.cse213_finalproject_groupno77_texttilefact.Shadman;

import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import jdk.internal.icu.text.UnicodeSet;

import java.awt.event.ActionEvent;

public class StaffPerformanceController
{
    @javafx.fxml.FXML
    private TableColumn<Employee, Integer> colStaffCompleted;
    @javafx.fxml.FXML
    private Label lblRatingValue;
    @javafx.fxml.FXML
    private Label lblUpdateStatus;
    @javafx.fxml.FXML
    private TableView<Employee> staffTable;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> colStaffRole;
    @javafx.fxml.FXML
    private Button btnUpdateRating;
    @javafx.fxml.FXML
    private TableColumn<Employee, String> colStaffRating;
    @javafx.fxml.FXML
    private CheckBox CheackBoxBad;
    @javafx.fxml.FXML
    private TextArea txtSummary;
    @javafx.fxml.FXML
    private ComboBox<String> comboStaff;
    @javafx.fxml.FXML
    private Button btnGenerateSummary;
    @javafx.fxml.FXML
    private TableColumn<Employee,String> colStaffName;
    @javafx.fxml.FXML
    private CheckBox CheckBoxGood;
    @javafx.fxml.FXML
    private CheckBox CheackBoxBest;



    @javafx.fxml.FXML
    public void initialize() {


        colStaffName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colStaffRole.setCellValueFactory(new PropertyValueFactory<>("role"));
        colStaffCompleted.setCellValueFactory(new PropertyValueFactory<>("completedTasks"));
        colStaffRating.setCellValueFactory(new PropertyValueFactory<>("rating"));

        Employee[] employeeList;
        for (Employee emp : employeeList) {
            comboStaff.getItems().add(emp.getName());
        }

        // Add checkbox listeners
        CheackBoxBad.selectedProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal) {
                CheckBoxGood.setSelected(false);
                CheackBoxBest.setSelected(false);
                lblRatingValue.setText("Rating: 1 (BAD)");
            }
    });
        CheckBoxGood.selectedProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal) {
                CheackBoxBad.setSelected(false);
                CheackBoxBest.setSelected(false);
                lblRatingValue.setText("Rating: 2 (GOOD)");
            }
        });
        CheackBoxBest.selectedProperty().addListener((obs, oldVal, newVal) -> {
            if (newVal) {
                CheackBoxBad.setSelected(false);
                CheckBoxGood.setSelected(false);
                lblRatingValue.setText("Rating: 3 (BEST)");
            }
        });


    @javafx.fxml.FXML
    public void handleGenerateSummary(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void handleUpdateRating(ActionEvent actionEvent) {


    }
}
    private String getSelectedRating() {
        if (CheackBoxBad.isSelected()) return "BAD";
        if (CheckBoxGood.isSelected()) return "GOOD";
        if (CheackBoxBest.isSelected()) return "BEST";
        return null;
    }
    private void clearRatingSelection() {
        CheackBoxBad.setSelected(false);
        CheckBoxGood.setSelected(false);
        CheackBoxBest.setSelected(false);
        lblRatingValue.setText("Rating: 3");
    }
    private void loadSampleData() {
        Employee employeeList;
        employeeList.add(new Employee("John Driver", "Driver", 45, "GOOD"));
        employeeList.add(new Employee("Mike Assistant", "Warehouse Staff", 38, "BEST"));
        employeeList.add(new Employee("Sarah Coordinator", "Logistics", 52, "BEST"));
        employeeList.add(new Employee("David Driver", "Driver", 32, "BAD"));
    }
    private void showAlert(Alert.AlertType type, String title, String message) {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

