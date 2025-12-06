package com.example.cse213_finalproject_groupno77_texttilefactory.InventoryManager;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.*;

public class updateMaterialQuantityController {

    @FXML private TextField materialNameField;
    @FXML private TextField newQuantityField;
    @FXML private TextArea statusArea;

    @FXML
    public void handleUpdate() {
        String name = materialNameField.getText().trim().toLowerCase();
        String qtyText = newQuantityField.getText().trim();
        statusArea.clear();
        if (name.isEmpty() || qtyText.isEmpty()) {
            statusArea.setText("Enter material name and new quantity.");
            return;
        }
        int newQty;
        try { newQty = Integer.parseInt(qtyText); if (newQty < 0) { statusArea.setText("Quantity cannot be negative."); return; } }
        catch (NumberFormatException ex) { statusArea.setText("Quantity must be integer."); return; }

        for (Material m : MaterialDataStore.materialList) {
            if (m.getName().equalsIgnoreCase(name)) {
                m.setQuantity(newQty);
                statusArea.setText("Quantity updated.\nName: " + m.getName() + "\nQuantity: " + m.getQuantity());
                return;
            }
        }
        statusArea.setText("Material not found: " + name);
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }
}
