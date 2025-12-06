package com.example.pracfinalprojectg77texttilefact;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class qC_addphototroller
{
    @javafx.fxml.FXML
    private Label defectTypeLabel;
    @javafx.fxml.FXML
    private Label attachedPhotoLabel;
    @javafx.fxml.FXML
    private TextArea comentAreaTextField;
    @javafx.fxml.FXML
    private Label addphotoLabel;
    @javafx.fxml.FXML
    private ComboBox <String>defectTypeCombobox;

    @javafx.fxml.FXML
    public void initialize() {
        defectTypeCombobox.getItems().addAll("Crack",
                "Broken Part",
                "Missing Part",
                "Color Fade"
        );
    }
    @javafx.fxml.FXML
    public void uploadButtonOnaction(ActionEvent actionEvent) {
    void showAlert("Photo uploaded successfully.");
}

    @javafx.fxml.FXML
    public void confirmButtonOnaction(ActionEvent actionEvent) {
    }
    showAlert("Photo added.");
}
}
}