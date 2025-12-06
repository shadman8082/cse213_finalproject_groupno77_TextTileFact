package com.example.cse213_finalproject_groupno77_texttilefact.Shadman;

import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.ActionEvent;

public class TrackShipementsFxmlController
{
    @javafx.fxml.FXML
    private TableColumn<Order,String> DueDateShipementsTableViewColBox;
    @javafx.fxml.FXML
    private TableColumn<Order,String> ClientShipementsTableViewColBox;
    @javafx.fxml.FXML
    private TableColumn<Order, String> ActionsShipementsTableViewColBox;
    @javafx.fxml.FXML
    private TextField searchField;
    @javafx.fxml.FXML
    private Button AddNewShipementsOnAction;
    @javafx.fxml.FXML
    private TableColumn<Order, String> StatusShipementsTableViewColBox;
    @javafx.fxml.FXML
    private Button SearchButtonOnActionButton;
    @javafx.fxml.FXML
    private Button ViewDetailOnActionButton;
    @javafx.fxml.FXML
    private TableView<Order> shipmentsTable;
    @javafx.fxml.FXML
    private TableColumn<Order,Integer> IdShipementsTableViewColBox;

    private ObservableList<Order> shipmentList = new observableArrayList();
    @javafx.fxml.FXML
    private Button SearchButtonOnActionButton1;


    @javafx.fxml.FXML
    public void initialize() {

        IdShipementsTableViewColBox.setCellValueFactory(new PropertyValueFactory<>(""));
        ClientShipementsTableViewColBox.setCellValueFactory(new PropertyValueFactory<>(""));
        StatusShipementsTableViewColBox.setCellValueFactory(new PropertyValueFactory<>(""));
        DueDateShipementsTableViewColBox.setCellValueFactory(new PropertyValueFactory<>(""));

        loadSampleShipments();
        shipmentsTable.setItems(shipmentList);
    }

    @javafx.fxml.FXML
    public void UpdateStatusOnActionButton(ActionEvent actionEvent) {
        Order selected = shipmentsTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            showAlert(Alert.AlertType.INFORMATION, "Update Status",
                    "Updating status for shipment ID: " + selected.getShipmentId());
        } else {
            showAlert(Alert.AlertType.WARNING, "No Selection", "Please select a shipment first.");
        }

    }

    @javafx.fxml.FXML
    public void ExportButtonOnActionButton(ActionEvent actionEvent) {
        showAlert(Alert.AlertType.INFORMATION, "Export", "Export feature coming soon!");
    }

    @javafx.fxml.FXML
    public void AddNewShipementsOnAction(ActionEvent actionEvent) {
        showAlert(Alert.AlertType.INFORMATION, "Add New", "Add New Shipment feature coming soon!");
    }

    @javafx.fxml.FXML
    public void SearchButtonOnActionButton(ActionEvent actionEvent) {
        public void SearchButtonOnActionButton(ActionEvent actionEvent) {
            String searchText = searchField.getText().toLowerCase();
            if (searchText.isEmpty()) {
                shipmentsTable.setItems(shipmentList);
            } else {
                ObservableList<Order> filteredList = FXCollections.observableArrayList();
                for (Order shipment : shipmentList) {
                    if (shipment.getClientName().toLowerCase().contains(searchText) ||
                            String.valueOf(shipment.getShipmentId()).contains(searchText)) {
                        filteredList.add(shipment);
                    }
                }
                shipmentsTable.setItems(filteredList);
            }
        }

    }

    @javafx.fxml.FXML
    public void ViewDetailOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void BackButtonOnActionButton(ActionEvent actionEvent) {

    }
}