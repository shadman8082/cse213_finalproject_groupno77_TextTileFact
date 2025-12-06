package com.example.cse213_finalproject_groupno77_texttilefactory.InventoryManager;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.event.*;

public class calculateTotalStockQuantityController {

    @FXML private TextArea resultArea;

    @FXML
    public void handleCalculate() {
        if (MaterialDataStore.materialList.isEmpty()) {
            resultArea.setText("No materials in inventory.");
            return;
        }
        int total = 0;
        for (Material m : MaterialDataStore.materialList) total += m.getQuantity();
        resultArea.setText("Total stock quantity: " + total);
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }
}
