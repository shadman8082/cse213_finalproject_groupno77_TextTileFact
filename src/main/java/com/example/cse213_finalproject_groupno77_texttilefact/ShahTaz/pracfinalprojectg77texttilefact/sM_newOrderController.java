package com.example.pracfinalprojectg77texttilefact;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class sM_newOrderController
{
    @javafx.fxml.FXML
    private ComboBox quantityCombobox;
    @javafx.fxml.FXML
    private DatePicker delidatePicker;
    @javafx.fxml.FXML
    private Label pricelabel;
    @javafx.fxml.FXML
    private ComboBox chooseProductscombobox;
    @javafx.fxml.FXML
    private TextField numberTaxtfield;
    @javafx.fxml.FXML
    private TextField priceTextField;
    @javafx.fxml.FXML
    private Label delilabel;
    @javafx.fxml.FXML
    private Label numberLabel;
    @javafx.fxml.FXML
    private ComboBox fabricsComboBox;
    @javafx.fxml.FXML
    private Label nameLabel;
    @javafx.fxml.FXML
    private TextField nameTextfield;

    @javafx.fxml.FXML
    public void initialize() {
    } chooseProductscombobox.setItems("Shirt", "Pant", "Jacket"));
        fabricsComboBox.setItems("Cotton", "Silk", "Denim"));
        quantityCombobox.setItems("1", "2", "3", "5", "10"));
}

    @javafx.fxml.FXML
    public void confirmbuttonOnaction(ActionEvent actionEvent) {
    }
}