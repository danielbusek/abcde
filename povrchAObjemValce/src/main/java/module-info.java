module com.example.povrchaobjemvalce {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.povrchaobjemvalce to javafx.fxml;
    exports com.example.povrchaobjemvalce;
}