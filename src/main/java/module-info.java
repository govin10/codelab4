module com.example.codelab_modul6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codelab_modul6 to javafx.fxml;
    exports com.example.codelab_modul6;
    exports com.main.codelab;
    opens com.main.codelab to javafx.fxml;
}