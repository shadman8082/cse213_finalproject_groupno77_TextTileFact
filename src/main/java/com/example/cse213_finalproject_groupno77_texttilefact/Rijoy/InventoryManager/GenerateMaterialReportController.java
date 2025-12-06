package com.example.cse213_finalproject_groupno77_texttilefactory.InventoryManager;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

import java.io.FileWriter;
import java.io.IOException;

public class GenerateMaterialReportController {

    @FXML
    private TableView<Material> materialTable;
    @FXML
    private TableColumn<Material, String> nameColumn;
    @FXML
    private TableColumn<Material, Integer> quantityColumn;
    @FXML
    private TableColumn<Material, Double> priceColumn;

    @FXML
    private TextArea reportArea;

    @FXML
    private Button generateButton;
    @FXML
    private Button exportButton;
    @FXML
    private Button backButton;

    @FXML
    public void initialize() {
        nameColumn.setCellValueFactory(cell -> new javafx.beans.property.SimpleStringProperty(cell.getValue().getName()));
        quantityColumn.setCellValueFactory(cell -> new javafx.beans.property.SimpleIntegerProperty(cell.getValue().getQuantity()).asObject());
        priceColumn.setCellValueFactory(cell -> new javafx.beans.property.SimpleDoubleProperty(cell.getValue().getPrice()).asObject());

        materialTable.getItems().addAll(MaterialDataStore.materialList);
    }

    // Generate summary report
    @FXML
    private void handleGenerateReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Material Report\n");
        sb.append("====================================\n");

        for (Material m : MaterialDataStore.materialList) {
            sb.append("Name: ").append(m.getName()).append("\n");
            sb.append("Quantity: ").append(m.getQuantity()).append("\n");
            sb.append("Price: ").append(m.getPrice()).append("\n");
            sb.append("------------------------------------\n");
        }

        reportArea.setText(sb.toString());
    }

    // Export report to .txt
    @FXML
    private void handleExportReport() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save Material Report");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));

        try {
            FileWriter writer = new FileWriter(fileChooser.showSaveDialog(null));
            writer.write(reportArea.getText());
            writer.close();
        } catch (IOException | NullPointerException e) {
            System.out.println("Save cancelled.");
        }
    }

    // Go back
    @FXML
    private void handleBack() {
        System.out.println("Go back to dashboard...");
    }
}
