package com.example.cse213_finalproject_groupno77_texttilefactory.InventoryManager;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.*;

public class searchMaterialbyNameController {

    @FXML private TextField searchField;
    @FXML private TextArea resultArea;

    @FXML
    public void handleSearch() {
        String key = searchField.getText().trim().toLowerCase();
        resultArea.clear();
        if (key.isEmpty()) { resultArea.setText("Enter material name."); return; }

        for (Material m : MaterialDataStore.materialList) {
            if (m.getName().equalsIgnoreCase(key)) {
                resultArea.setText("Material Found:\nName: " + m.getName() + "\nQuantity: " + m.getQuantity() + "\nPrice: " + m.getPrice());
                return;
            }
        }
        resultArea.setText("Material not found: " + key);
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }
}
