package com.example.cse213_finalproject_groupno77_texttilefactory.EmployeeManager;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.BufferedReader;
import java.io.FileReader;

import static com.example.cse213_finalproject_groupno77_texttilefactory.SceneSwitcher.switchTo;

public class searchEmployeebyIDController {

    @FXML private TextField idField;
    @FXML private TextArea resultArea;

    @FXML
    public void handleSearch() {
        String searchId = idField.getText().trim();
        resultArea.clear();

        if (searchId.isEmpty()) {
            resultArea.setText("Enter Employee ID.");
            return;
        }

        try (BufferedReader br = new BufferedReader(new FileReader("employees.txt"))) {
            String line;
            boolean found = false;

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(searchId)) {
                    resultArea.setText("Employee Found:\nID: " + parts[0] + "\nName: " + parts[1] + "\nRole: " + parts[2]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                resultArea.setText("No employee found with ID: " + searchId);
            }

        } catch (Exception e) {
            resultArea.setText("Error: " + e.getMessage());
        }
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) throws Exception {
        switchTo("/cse213_finalproject_groupno77_texttilefactory/addNewEmployee.fxml", actionEvent);
    }
}
