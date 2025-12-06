package com.example.cse213_finalproject_groupno77_texttilefactory.EmployeeManager;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.FileWriter;

import static com.example.cse213_finalproject_groupno77_texttilefactory.SceneSwitcher.switchTo;

public class addNewEmployeeController {

    @FXML
    private Label statusLabel;

    @FXML
    private TextField employeeIdField;

    @FXML
    private TextField employeeNameField;

    @FXML
    private TextField employeeRoleField;

    @FXML
    public void handleAddEmployee(ActionEvent actionEvent) {

        String idText = employeeIdField.getText().trim();
        String name = employeeNameField.getText().trim();
        String role = employeeRoleField.getText().trim();

        if (idText.isEmpty() || name.isEmpty() || role.isEmpty()) {
            statusLabel.setText("All fields are required.");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(idText);
        } catch (Exception e) {
            statusLabel.setText("Employee ID must be numeric.");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        addEmployee(id, name, role);

        statusLabel.setText("Employee added successfully!");
        statusLabel.setStyle("-fx-text-fill: green;");

        employeeIdField.clear();
        employeeNameField.clear();
        employeeRoleField.clear();
    }

    // YOUR FILE HANDLING METHOD
    public void addEmployee(int id, String name, String role) {
        try {
            FileWriter fw = new FileWriter("employees.txt", true); // append mode
            fw.write(id + "," + name + "," + role + "\n");
            fw.close();
            System.out.println("Employee saved to file!");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    @FXML
    public void backButtonOnAction(ActionEvent event) throws Exception {
        switchTo("/cse213_finalproject_groupno77_texttilefactory/countTotalEmployees.fxml", event);
    }
}
