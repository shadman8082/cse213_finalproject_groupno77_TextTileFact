package com.example.pracfinalprojectg77texttilefact;

import javafx.event.ActionEvent;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextArea;

public class sM_productAndDelivaryController
{
    @javafx.fxml.FXML
    private TableColumn orderIdTablecolumn;
    @javafx.fxml.FXML
    private TextArea tpeTextArea;
    @javafx.fxml.FXML
    private DatePicker delidatedatepicker;
    @javafx.fxml.FXML
    private TableColumn productsTableColumn;
    @javafx.fxml.FXML
    private Label delivaryDatelabel;
    @javafx.fxml.FXML
    private TableColumn completationTableColumn;
    @javafx.fxml.FXML
    private Label productionLabel;
    @javafx.fxml.FXML
    private TableColumn productionstageTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }
    orderIdTablecolumn.setCellValueFactory( data.getValue().orderIdProperty());
        productsTableColumn.setCellValueFactory( data.getValue().productProperty());
        completationTableColumn.setCellValueFactory( data.getValue().completionProperty());
        productionstageTableColumn.setCellValueFactory(data.getValue().productionStageProperty());

        tableView.setItems(ordersList);

    @javafx.fxml.FXML
    public void shareButtonOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateButtonOnaction(ActionEvent actionEvent) {
    }
}