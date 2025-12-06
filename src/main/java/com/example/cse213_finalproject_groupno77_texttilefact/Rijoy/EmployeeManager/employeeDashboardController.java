package com.example.cse213_finalproject_groupno77_texttilefactory.EmployeeManager;

import javafx.event.ActionEvent;

import static com.example.cse213_finalproject_groupno77_texttilefactory.SceneSwitcher.switchTo;

public class employeeDashboardController {

    public void gotoAddNewEmployee(ActionEvent e) throws Exception {
        switchTo("/com/example/cse213_finalproject_groupno77_texttilefactory/EmployeeManager/addNewEmployee.fxml", e);
    }

    public void gotoViewAllEmployees(ActionEvent e) throws Exception {
        switchTo("/com/example/cse213_finalproject_groupno77_texttilefactory/EmployeeManager/viewAllEmployees.fxml", e);
    }

    public void gotoSearchEmployeeID(ActionEvent e) throws Exception {
        switchTo("/com/example/cse213_finalproject_groupno77_texttilefactory/EmployeeManager/searchEmployeebyID.fxml", e);
    }

    public void gotoUpdateEmployeeRole(ActionEvent e) throws Exception {
        switchTo("/com/example/cse213_finalproject_groupno77_texttilefactory/EmployeeManager/updateEmployeeRole.fxml", e);
    }

    public void gotoDeleteEmployeeRecord(ActionEvent e) throws Exception {
        switchTo("/com/example/cse213_finalproject_groupno77_texttilefactory/EmployeeManager/deleteEmployeeRecord.fxml", e);
    }

    public void gotoFilterEmployeesByRole(ActionEvent e) throws Exception {
        switchTo("/com/example/cse213_finalproject_groupno77_texttilefactory/EmployeeManager/filterEmployeesByRole.fxml", e);
    }

    public void gotoCountTotalEmployees(ActionEvent e) throws Exception {
        switchTo("/com/example/cse213_finalproject_groupno77_texttilefactory/EmployeeManager/countTotalEmployees.fxml", e);
    }

    public void gotoGenerateEmployeeReport(ActionEvent e) throws Exception {
        switchTo("/com/example/cse213_finalproject_groupno77_texttilefactory/EmployeeManager/generateEmployeeReport.fxml", e);
    }

    public void gotoMainMenu(ActionEvent e) throws Exception {
        switchTo("/com/example/cse213_finalproject_groupno77_texttilefactory/mainDashboard.fxml", e);
    }
}
