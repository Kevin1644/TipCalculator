module org.openjfx {
    requires javafx.controls;
    requires javafx.fxml;

    opens kevin.sun to javafx.fxml;
    exports kevin.sun;
}
