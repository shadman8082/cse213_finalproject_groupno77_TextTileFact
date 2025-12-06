package com.example.pracfinalprojectg77texttilefact;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class qC_batchApprovalControllar
{
    @javafx.fxml.FXML
    private TableColumn photosTableColumn;
    @javafx.fxml.FXML
    private Label batchApprovalLabel;
    @javafx.fxml.FXML
    private TextArea remarksTextArea;
    @javafx.fxml.FXML
    private TableView batchaPProvalTableview;
    @javafx.fxml.FXML
    private TableColumn batchTablecolumn;
    @javafx.fxml.FXML
    private TableColumn resultTablecolumn;

    @javafx.fxml.FXML
    public void initialize() {
    } batchTablecolumn.setCellValueFactory(new PropertyValueFactory<String>("batch"));
        resultTablecolumn.setCellValueFactory(new PropertyValueFactory<String>("result"));
        photosTableColumn.setCellValueFactory(new PropertyValueFactory<String>("photos"));

        batchList.addAll(
                new QualityControlOfficer.BatchItem("Batch-01", "Pass", "3 Photos"),
                new QualityControlOfficer.BatchItem("Batch-02", "Fail", "5 Photos")
                );

    @javafx.fxml.FXML
    public void rejectButtonOnaction(ActionEvent actionEvent) {
    } showMsg("Batch rejected.");
}

    @javafx.fxml.FXML
    public void confirmButtonOnaction(ActionEvent actionEvent) {
    }showMsg("Batch confirmed.");

    @javafx.fxml.FXML
    public void approvalButtonOnaction(ActionEvent actionEvent) {
    } showMsg("Remarks submitted.");
}
}