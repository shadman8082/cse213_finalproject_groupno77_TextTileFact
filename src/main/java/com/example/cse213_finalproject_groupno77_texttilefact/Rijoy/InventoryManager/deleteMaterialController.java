package com.example.cse213_finalproject_groupno77_texttilefactory.InventoryManager;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.event.*;

public class deleteMaterialController {

    @FXML private TextField materialNameField;
    @FXML private TextArea statusArea;

    @FXML
    public void handleDelete() {
        String name = materialNameField.getText().trim().toLowerCase();
        statusArea.clear();
        if (name.isEmpty()) { statusArea.setText("Enter material name."); return; }

        Material found = null;
        for (Material m : MaterialDataStore.materialList) {
            if (m.getName().equalsIgnoreCase(name)) { found = m; break; }
        }
        if (found == null) { statusArea.setText("Material not found: " + name); return; }

        MaterialDataStore.materialList.remove(found);
        statusArea.setText("Material deleted: " + found.getName());
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }
}
