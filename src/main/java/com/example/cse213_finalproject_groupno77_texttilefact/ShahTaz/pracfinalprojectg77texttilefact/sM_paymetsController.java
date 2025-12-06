package com.example.pracfinalprojectg77texttilefact;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;

public class sM_paymetsController
{
    @javafx.fxml.FXML
    private TableColumn paidammountTablecoumn;
    @javafx.fxml.FXML
    private ComboBox selectClintComboBox;
    @javafx.fxml.FXML
    private TableColumn invoicesTablecolumn;

    @javafx.fxml.FXML
    public void initialize() {
    } invoicesTablecolumn.setCellValueFactory( data.getValue().invoiceProperty());
        paidammountTablecoumn.setCellValueFactory( data.getValue().paidAmountProperty());

        tableView.setItems(paymentsList);

    @javafx.fxml.FXML
    public void generatebuttonOnaction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateButtonOnaction(ActionEvent actionEvent) {
    }
}