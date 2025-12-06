package com.example.cse213_finalproject_groupno77_texttilefactory.EmployeeManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.event.ActionEvent;

public class filterEmployeesByRoleController {

    @FXML private TextField roleField;
    @FXML private TableView<Employee> tblFiltered;
    @FXML private TableColumn<Employee, String> colID;
    @FXML private TableColumn<Employee, String> colName;
    @FXML private TableColumn<Employee, String> colRole;

    @FXML
    public void initialize() {
        colID.setCellValueFactory(new PropertyValueFactory<>("employeeID"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colRole.setCellValueFactory(new PropertyValueFactory<>("role"));
    }

    @FXML
    public void handleFilter() {
        String role = roleField.getText().trim().toLowerCase();

        ObservableList<Employee> result = FXCollections.observableArrayList();

        for (Employee e : EmployeeDataStore.employeeList) {
            if (e.getRole().toLowerCase().equals(role)) {
                result.add(e);
            }
        }

        tblFiltered.setItems(result);
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        // Implement navigation
    }
}
