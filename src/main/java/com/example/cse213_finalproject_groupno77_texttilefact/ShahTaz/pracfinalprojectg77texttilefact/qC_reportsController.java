package com.example.pracfinalprojectg77texttilefact;

import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;

public class qC_reportsController
{
    @javafx.fxml.FXML
    private TableColumn inspectorTableColumn;
    @javafx.fxml.FXML
    private Label reportLabel;
    @javafx.fxml.FXML
    private TableColumn productionTablecolumn;
    @javafx.fxml.FXML
    private DatePicker reportsDatepickr;
    @javafx.fxml.FXML
    private TableColumn dateTableColumn;
    @javafx.fxml.FXML
    private ComboBox selectCombobox;

    @javafx.fxml.FXML
    public void initialize() {
    }}dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        productionTablecolumn.setCellValueFactory(new PropertyValueFactory<>("production"));
        inspectorTableColumn.setCellValueFactory(new PropertyValueFactory<>("inspector"));
