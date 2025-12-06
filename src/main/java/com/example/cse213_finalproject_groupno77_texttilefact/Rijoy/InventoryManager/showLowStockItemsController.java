package com.example.cse213_finalproject_groupno77_texttilefactory.InventoryManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.event.*;

public class showLowStockItemsController {

    @FXML private TableView<Material> lowStockTable;
    @FXML private TableColumn<Material, String> colName;
    @FXML private TableColumn<Material, Integer> colQty;
    @FXML private TableColumn<Material, Integer> colThreshold; // if model doesn't have threshold, column left empty
    @FXML
    private Button btnShowLowStock;

    @FXML
    public void initialize() {
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colQty.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        // We don't have lowStockThreshold in your Material model. colThreshold left blank or can show computed value.
    }

    @FXML
    public void showLowStock() {
        ObservableList<Material> low = FXCollections.observableArrayList();
        // A low-stock condition: consider threshold = 10 by default
        int defaultThreshold = 10;
        for (Material m : MaterialDataStore.materialList) {
            if (m.getQuantity() < defaultThreshold) low.add(m);
        }
        lowStockTable.setItems(low);
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }
}
