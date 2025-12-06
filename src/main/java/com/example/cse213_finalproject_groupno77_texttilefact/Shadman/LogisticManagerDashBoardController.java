package com.example.cse213_finalproject_groupno77_texttilefact.Shadman;

import com.example.cse213_finalproject_groupno77_texttilefact.SceneSwitcher;
import javafx.event.ActionEvent;

import java.io.IOException;

public class LogisticManagerDashBoardController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void TrackShipementsOnActionButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("Shadman/TrackShipementsFxml.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void VehicleRecordsOnActionButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Shadman/VehicleRecordFxml.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void CommuniacationOnActionButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Shadman/CommuniacationFxml.fxml", actionEvent); {
        }

    }

    @javafx.fxml.FXML
    public void ManageSchedulesOnActionButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Shadman/ManageSchedulesFxml.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void InventoryTransferOnActionButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Shadman/nventoryTransferFxml.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void StuffPerformanceOnActionButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Shadman/StuffPerformanceFxml.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void LogOutOnActionButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Shadman/LogOutOnActionFxml.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void GenarateReportsOnActionButton(ActionEvent actionEvent) throws IOException{
        SceneSwitcher.switchTo("Shadman/GenarateReportsFxml.fxml", actionEvent); {
        }
    }

    @javafx.fxml.FXML
    public void OptimizeroutesOnActionButton(ActionEvent actionEvent)throws IOException {
        SceneSwitcher.switchTo("Shadman/OptimizeroutesFxml.fxml", actionEvent); {
        }
    }
}