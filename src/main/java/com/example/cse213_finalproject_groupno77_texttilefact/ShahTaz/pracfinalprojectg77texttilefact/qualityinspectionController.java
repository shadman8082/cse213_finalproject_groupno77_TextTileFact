package com.example.pracfinalprojectg77texttilefact;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class qualityinspectionController
{
    @javafx.fxml.FXML
    private Label qualityINSheadingLabel;
    @javafx.fxml.FXML
    private TableColumn machineLinetablecolumn;
    @javafx.fxml.FXML
    private ComboBox selectOneCombobox;
    @javafx.fxml.FXML
    private TableView qualityInspecTableView;
    @javafx.fxml.FXML
    private TableColumn fabricsTablecolumn;
    @javafx.fxml.FXML
    private TableColumn coloursTablecolumn;
    @javafx.fxml.FXML
    private Label insREsultLabel;
    @javafx.fxml.FXML
    private ComboBox chooseCombobox;
    @javafx.fxml.FXML
    private TableColumn finishTableColumn;
    @javafx.fxml.FXML
    private TableColumn serialTablecoulumn;
    @javafx.fxml.FXML
    private TableColumn Tablecoulumn;

    @javafx.fxml.FXML
    public void initialize() {
    }String productCode = proCodeTextfield.getText();
    String defectCount = defectCountTextfield.getText();
    String fabricWidth = fabricWidthTextfield.getText();
    String shadeVariation = shadeVertionTextfield.getText();
 if(productCode.isEmpty|| defectCount.isEmpty() || fabricWidth.isEmpty() || shadeVariation.isEmpty()){
    inspectionRecordLabel.setText("Fill all required fields!");
} else {
    inspectionRecordLabel.setText("Saved temporarily:)
}

    @javafx.fxml.FXML
    public void saveButtonONaction(ActionEvent actionEvent) {
    }
}