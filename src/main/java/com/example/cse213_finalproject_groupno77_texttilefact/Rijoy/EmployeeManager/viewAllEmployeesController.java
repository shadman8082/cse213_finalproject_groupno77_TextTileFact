package com.example.cse213_finalproject_groupno77_texttilefactory.EmployeeManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.BufferedReader;
import java.io.FileReader;

import static com.example.cse213_finalproject_groupno77_texttilefactory.SceneSwitcher.switchTo;

public class viewAllEmployeesController {

    @FXML private TableView<Employee> employeeTable;
    @FXML private TableColumn<Employee, String> colID;
    @FXML private TableColumn<Employee, String> colName;
    @FXML private TableColumn<Employee, String> colRole;

    @FXML
    public void initialize() {
        colID.setCellValueFactory(new PropertyValueFactory<>("employeeID"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colRole.setCellValueFactory(new PropertyValueFactory<>("role"));
        loadEmployeesFromFile();
    }

    private void loadEmployeesFromFile() {
        EmployeeDataStore.employeeList.clear();
        try (BufferedReader br = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    EmployeeDataStore.employeeList.add(new Employee(parts[0], parts[1], parts[2]));
                }
            }
        } catch (Exception e) {
            System.out.println("Error loading employees: " + e.getMessage());
        }

        ObservableList<Employee> obs = FXCollections.observableArrayList(EmployeeDataStore.employeeList);
        employeeTable.setItems(obs);
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) throws Exception {
        switchTo("/cse213_finalproject_groupno77_texttilefactory/addNewEmployee.fxml", actionEvent);
    }
}
