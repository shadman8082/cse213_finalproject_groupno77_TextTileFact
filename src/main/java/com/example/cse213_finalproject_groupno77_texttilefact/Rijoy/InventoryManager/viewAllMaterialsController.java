package com.example.cse213_finalproject_groupno77_texttilefactory.InventoryManager;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.event.*;

public class viewAllMaterialsController {

    @FXML private TableView<Material> materialsTable;
    @FXML private TableColumn<Material, String> colName;
    @FXML private TableColumn<Material, Integer> colQty;
    @FXML private TableColumn<Material, Double> colPrice;

    @FXML
    public void initialize() {
        // PropertyValueFactory must match model getters: name, quantity, price
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colQty.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        refresh();
    }

    public void refresh() {
        ObservableList<Material> obs = FXCollections.observableArrayList(MaterialDataStore.materialList);
        materialsTable.setItems(obs);
    }

    @FXML
    public void handleRefresh() {
        refresh();
        materialsTable.refresh();
    }

    @FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
    }
}
