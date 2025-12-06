package com.example.pracfinalprojectg77texttilefact;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class qC_checkListController
{
    @javafx.fxml.FXML
    private Label colourLabel;
    @javafx.fxml.FXML
    private TextField coloTextField;
    @javafx.fxml.FXML
    private TableColumn sltableColumn;
    @javafx.fxml.FXML
    private TableColumn existingCheckListTablecolumn;
    @javafx.fxml.FXML
    private Label stitchingLabel;
    @javafx.fxml.FXML
    private TextField stitchingTextfield;
    @javafx.fxml.FXML
    private TextField sizeTextfield;
    @javafx.fxml.FXML
    private TableColumn dateTablecolumn;
    @javafx.fxml.FXML
    private Label sizeLabe;
    @javafx.fxml.FXML
    private Label checkListLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }  dateTablecolumn.setCellValueFactory(new PropertyValueFactory<int>("date"));
        sltableColumn.setCellValueFactory(new PropertyValueFactory<int>("sl"));
        existingCheckListTablecolumn.setCellValueFactory(new PropertyValueFactory<String>("existing"));

        list.addAll(
                new QualityControlOfficer.CheckListItem("2024-11-01", 1, "Color Check"),
                new QualityControlOfficer.CheckListItem("2024-11-02", 2, "Stitching Check")
                );

        tableView.setItems(list);

    @javafx.fxml.FXML
    public void createButtonOnaction(ActionEvent actionEvent) {
    }msg("New checklist created.");

    @javafx.fxml.FXML
    public void editButtonOnaction(ActionEvent actionEvent) {
    }msg("Checklist updated.");

    @javafx.fxml.FXML
    public void applyButtonOnaction(ActionEvent actionEvent) {
    } msg("Checklist applied.");
}