package com.example.cse213_finalproject_groupno77_texttilefactory.EmployeeManager;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.*;

public class deleteEmployeeRecordController {

    @FXML private TextField idField;
    @FXML private TextArea resultArea;
    @FXML
    private Button deleteBtn;

    @FXML
    public void handleDeleteEmployee() {
        String id = idField.getText().trim();
        resultArea.clear();
        if (id.isEmpty()) {
            resultArea.setText("Enter Employee ID.");
            return;
        }

        Employee found = null;
        for (Employee e : EmployeeDataStore.employeeList) {
            if (e.getEmployeeID().equals(id)) { found = e; break; }
        }
        if (found == null) {
            resultArea.setText("No employee found with ID: " + id);
            return;
        }
        EmployeeDataStore.employeeList.remove(found);
        resultArea.setText("Employee deleted.\nName: " + found.getName() + "\nID: " + found.getEmployeeID());
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }
}
