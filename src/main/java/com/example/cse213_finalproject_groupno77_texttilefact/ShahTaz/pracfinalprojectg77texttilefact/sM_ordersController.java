package com.example.pracfinalprojectg77texttilefact;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class sM_ordersController
{
    @javafx.fxml.FXML
    private TableColumn statusTableColumn;
    @javafx.fxml.FXML
    private TextField statusTxtfield;
    @javafx.fxml.FXML
    private TableColumn orderIdTableColumn;
    @javafx.fxml.FXML
    private Label ordersLabel1;
    @javafx.fxml.FXML
    private TableColumn clientNameTablecolumn;
    @javafx.fxml.FXML
    private TableColumn slTablecolumn;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn orderProductsTablecolumn;
    @javafx.fxml.FXML
    private TableColumn currentStatusTablecolmn;
    @javafx.fxml.FXML
    private Label ordersLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }slTablecolumn.setCellValueFactory( data.getValue().slProperty());
        clientNameTablecolumn.setCellValueFactory( data.getValue().clientNameProperty());
        orderIdTableColumn.setCellValueFactory( data.getValue().orderIdProperty());
        statusTableColumn.setCellValueFactory(data.getValue().statusProperty());


    @javafx.fxml.FXML
    public void saveButtonOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateButtonOnaction(ActionEvent actionEvent) {
    }
}