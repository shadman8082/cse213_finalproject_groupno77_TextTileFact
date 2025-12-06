package com.example.cse213_finalproject_groupno77_texttilefact;

import com.example.cse213_finalproject_groupno77_texttilefact.Shadman.Transport;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.awt.event.ActionEvent;
import java.time.LocalDate;

public class ManageSchedulesFxmlController
{
    @javafx.fxml.FXML
    private TableColumn<Transport, String> DriverTableViewUpcomingColBox;
    @javafx.fxml.FXML
    private TableView<String> UpcomingSchedulesTableView;
    @javafx.fxml.FXML
    private TableColumn<Transport, LocalDate> DateTableViewUpcomingColBox;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> StatusTableViewUpcomingColBox;
    @javafx.fxml.FXML
    private TextField DestinationTextFiled;
    @javafx.fxml.FXML
    private DatePicker DeliveryDateDatePicker;
    @javafx.fxml.FXML
    private TextField ClientNameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> SelectDriverComboBox;
    @javafx.fxml.FXML
    private TableColumn<Transport, String> ClientTableViewUpcomingColBox;

    private ObservableList<Transport> scheduleList = FXCollections.observableArrayList();

    @javafx.fxml.FXML
    public void initialize() {
        SelectDriverComboBox.getItems().addAll("Driver 1", "Driver 2", "Driver 3", "Driver 4");
        DateTableViewUpcomingColBox.setCellValueFactory(new PropertyValueFactory<>(""));
        DriverTableViewUpcomingColBox.setCellValueFactory(new PropertyValueFactory<>(""));
        StatusTableViewUpcomingColBox.setCellValueFactory(new PropertyValueFactory<>(""));






    }

    @javafx.fxml.FXML
    public void CancelOnActionButton(ActionEvent actionEvent) {
        Schedule selected = UpcomingSchedulesTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Cancelled");
            UpcomingSchedulesTableView.refresh();
            showAlert("Cancelled", "Schedule has been cancelled.");
        } else {
            showAlert("No Selection", "Please select a schedule to cancel.");
        }
    }

    private boolean validateScheduleInput() {
        if (ClientNameTextField.getText().isEmpty()) {
            showAlert("Validation Error", "Please enter client name.");
            return false;
        }
        if (DeliveryDateDatePicker.getValue() == null) {
            showAlert("Validation Error", "Please select delivery date.");
            return false;
        }
        if (DeliveryDateDatePicker.getValue().isBefore(LocalDate.now())) {
            showAlert("Validation Error", "Delivery date cannot be in the past.");
            return false;
        }
        if (DestinationTextFiled.getText().isEmpty()) {
            showAlert("Validation Error", "Please enter destination.");
            return false;
        }
        if (SelectDriverComboBox.getValue() == null) {
            showAlert("Validation Error", "Please select a driver.");
            return false;
        }
        return true;
    }

    private void clearScheduleForm() {
        ClientNameTextField.clear();
        DeliveryDateDatePicker.setValue(null);
        DestinationTextFiled.clear();
        SelectDriverComboBox.setValue(null);
    }

    private void loadSampleSchedules() {
        scheduleList.add(new Transport("ABC Textiles", LocalDate.now().plusDays(2),
                "Dhaka", "Driver 1", "Scheduled"));
        scheduleList.add(new Transport("XYZ Fabrics", LocalDate.now().plusDays(3),
                "Chittagong", "Driver 2", "Scheduled"));
        scheduleList.add(new Transport("Fashion House", LocalDate.now().plusDays(1),
                "Khulna", "Driver 3", "In Transit"));
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
    }

    }

    @javafx.fxml.FXML
    public void EditOnActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CreateScheduleonActionButton(ActionEvent actionEvent) {
        if (validateScheduleInput()) {
            java.awt.Label ClientNameTextField;
            Transport newSchedule = new Transport(
                    ClientNameTextField.getText(),
                    DeliveryDateDatePicker.getValue(),
                    DestinationTextFiled.getText(),
                    SelectDriverComboBox.getValue(),
                    "Scheduled"
            );
            scheduleList.add(newSchedule);
            clearScheduleForm();
            showAlert("Success", "Schedule created successfully!");

    }
}

    private boolean validateScheduleInput() {
    }