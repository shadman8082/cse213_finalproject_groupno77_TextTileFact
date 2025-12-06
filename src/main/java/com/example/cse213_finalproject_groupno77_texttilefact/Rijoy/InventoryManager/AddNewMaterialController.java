package com.example.cse213_finalproject_groupno77_texttilefactory.InventoryManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class AddNewMaterialController {

    @FXML private TextField materialNameField;
    @FXML private TextField quantityField;
    @FXML private TextField priceField;
    @FXML private Label statusLabel;

    @FXML
    private void handleAddMaterial() {
        String name = materialNameField.getText().trim();
        String qtyText = quantityField.getText().trim();
        String priceText = priceField.getText().trim();

        if (name.isEmpty() || qtyText.isEmpty() || priceText.isEmpty()) {
            statusLabel.setText("All fields are required.");
            statusLabel.setStyle("-fx-text-fill: red;");
            return;
        }

        try {
            int qty = Integer.parseInt(qtyText);
            double price = Double.parseDouble(priceText);
            Material m = new Material(name, qty, price);
            MaterialDataStore.materialList.add(m);
            statusLabel.setText("Material added.");
            statusLabel.setStyle("-fx-text-fill: green;");
            materialNameField.clear(); quantityField.clear(); priceField.clear();
        } catch (NumberFormatException ex) {
            statusLabel.setText("Quantity must be integer and price numeric.");
            statusLabel.setStyle("-fx-text-fill: red;");
        }
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }
}
