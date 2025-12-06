package com.example.cse213_finalproject_groupno77_texttilefact.Shadman;

import com.example.cse213_finalproject_groupno77_texttilefact.SceneSwitcher;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class SupplierDashboardController
{
    @javafx.fxml.FXML
    private Button btnViewHistory;
    @javafx.fxml.FXML
    private Button btnMarkDelivery;
    @javafx.fxml.FXML
    private Button btnLogout;
    @javafx.fxml.FXML
    private Button btnConfirmOrders;
    @javafx.fxml.FXML
    private Button btnUpdateProfile;
    @javafx.fxml.FXML
    private Label lblWelcome;
    @javafx.fxml.FXML
    private Button btnViewOrders;
    @javafx.fxml.FXML
    private Button btnDispatchMaterials;
    @javafx.fxml.FXML
    private Button btnCheckPayment;
    @javafx.fxml.FXML
    private Button btnUploadInvoice;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void handleViewHistory(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("Shadman/SupplierViewHistory.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void handleMarkDelivery(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Shadman/SupplierMarkDelivery.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void handleUpdateProfile(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Shadman/SupplierUpdateProfile.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void handleUploadInvoice(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Shadman/SupplierUploadInvoice.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void handleCheckPayment(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Shadman/SupplierCheckPayment.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void handleViewOrders(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Shadman/SupplierViewHistory.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void handleConfirmOrders(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Shadman/SupplierConfirmOrders.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void handleLogout(ActionEvent actionEvent) {

    }


    @javafx.fxml.FXML
    public void handleDispatchMaterials(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Shadman/SupplierDispatchMaterials.fxml", actionEvent); {
        }
    }
}