package com.example.cse213_finalproject_groupno77_texttilefactory.InventoryManager;

import javafx.event.ActionEvent;
import static com.example.cse213_finalproject_groupno77_texttilefactory.SceneSwitcher.switchTo;

public class materialDashboardController {

    public void gotoAddNewMaterial(ActionEvent e) throws Exception {
        switchTo("/com/example/cse213_finalproject_groupno77_texttilefactory/InventoryManager/addNewMaterial.fxml", e);
    }

    public void gotoViewAllMaterials(ActionEvent e) throws Exception {
        switchTo("/com/example/cse213_finalproject_groupno77_texttilefactory/InventoryManager/viewAllMaterials.fxml", e);
    }

    public void gotoSearchMaterialByName(ActionEvent e) throws Exception {
        switchTo("/com/example/cse213_finalproject_groupno77_texttilefactory/InventoryManager/searchMaterialbyName.fxml", e);
    }

    public void gotoUpdateMaterialQuantity(ActionEvent e) throws Exception {
        switchTo("/com/example/cse213_finalproject_groupno77_texttilefactory/InventoryManager/updateMaterialQuantity.fxml", e);
    }

    public void gotoDeleteMaterial(ActionEvent e) throws Exception {
        switchTo("/com/example/cse213_finalproject_groupno77_texttilefactory/InventoryManager/deleteMaterial.fxml", e);
    }

    public void gotoShowLowStock(ActionEvent e) throws Exception {
        switchTo("/com/example/cse213_finalproject_groupno77_texttilefactory/InventoryManager/showLowStockItems.fxml", e);
    }

    public void gotoCalculateTotalStock(ActionEvent e) throws Exception {
        switchTo("/com/example/cse213_finalproject_groupno77_texttilefactory/InventoryManager/calculateTotalStockQuantity.fxml", e);
    }

    public void gotoGenerateMaterialReport(ActionEvent e) throws Exception {
        switchTo("/com/example/cse213_finalproject_groupno77_texttilefactory/InventoryManager/generateMaterialReport.fxml", e);
    }

    public void gotoMainMenu(ActionEvent e) throws Exception {
        switchTo("/com/example/cse213_finalproject_groupno77_texttilefactory/mainDashboard.fxml", e);
    }
}
