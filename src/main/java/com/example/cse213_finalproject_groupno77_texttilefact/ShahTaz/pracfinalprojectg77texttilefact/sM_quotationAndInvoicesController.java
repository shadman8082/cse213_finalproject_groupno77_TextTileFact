package com.example.pracfinalprojectg77texttilefact;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;

public class sM_quotationAndInvoicesController
{
    @javafx.fxml.FXML
    private TextField clientIDTextfield;
    @javafx.fxml.FXML
    private TableColumn discountTableColumn;
    @javafx.fxml.FXML
    private TableColumn itemTablecolumn;
    @javafx.fxml.FXML
    private TableColumn priceTaleColumn;
    @javafx.fxml.FXML
    private TableColumn taxTableColumn;
    @javafx.fxml.FXML
    private Label clientIdlebel;
    @javafx.fxml.FXML
    private Label itemsLebel;
    @javafx.fxml.FXML
    private TextField itemstextfield;

    @javafx.fxml.FXML
    public void initialize() {
    } itemTablecolumn.setCellValueFactory( data.getValue().itemNameProperty());
        priceTaleColumn.setCellValueFactory(data.getValue().priceProperty());
        taxTableColumn.setCellValueFactory(data.getValue().taxProperty());
        discountTableColumn.setCellValueFactory(data.getValue().discountProperty());



    @javafx.fxml.FXML
    public void sendemailbuttonOnatin(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generatebuttonONaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void confirmbuttonOnaction(ActionEvent actionEvent) {
    }
}