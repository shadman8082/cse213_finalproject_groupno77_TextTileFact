package com.example.cse213_finalproject_groupno77_texttilefactory.EmployeeManager;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.*;

public class updateEmployeeRoleController {

    @FXML private TextField idField;
    @FXML private TextField newRoleField;
    @FXML private TextArea resultArea;
    @FXML
    private Button updateBtn;

    @FXML
    public void handleUpdateRole() {
        String id = idField.getText().trim();
        String newRole = newRoleField.getText().trim();
        resultArea.clear();

        if (id.isEmpty() || newRole.isEmpty()) {
            resultArea.setText("Please enter Employee ID and new role.");
            return;
        }

        for (Employee e : EmployeeDataStore.employeeList) {
            if (e.getEmployeeID().equals(id)) {
                // if Employee model lacks setter, create new Employee and replace entry
                int idx = EmployeeDataStore.employeeList.indexOf(e);
                Employee updated = new Employee(e.getEmployeeID(), e.getName(), newRole);
                EmployeeDataStore.employeeList.set(idx, updated);

                resultArea.setText("Role updated successfully.\nName: " + updated.getName() + "\nID: " + updated.getEmployeeID() + "\nRole: " + updated.getRole());
                return;
            }
        }
        resultArea.setText("No employee found with ID: " + id);
    }

    @FXML
     public void backButtonOnAction(ActionEvent actionEvent)

    {
    }
}
