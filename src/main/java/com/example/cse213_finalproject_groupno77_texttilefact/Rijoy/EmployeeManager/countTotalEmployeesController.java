package com.example.cse213_finalproject_groupno77_texttilefactory.EmployeeManager;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.event.*;

public class countTotalEmployeesController {

    @FXML private TextField totalField;
    @FXML
    private Button countBtn;

    @FXML
    public void handleCountEmployees() {
        int total = EmployeeDataStore.employeeList.size();
        totalField.setText(String.valueOf(total));
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }
}
