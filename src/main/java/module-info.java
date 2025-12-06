module com.example.cse213_finalproject_groupno77_texttilefact {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.cse213_finalproject_groupno77_texttilefact to javafx.fxml;
    exports com.example.cse213_finalproject_groupno77_texttilefact;
    exports com.example.cse213_finalproject_groupno77_texttilefact.Shadman;
    opens com.example.cse213_finalproject_groupno77_texttilefact.Shadman to javafx.fxml;
}