module JavaFxApplication {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;

    exports application to javafx.fxml, javafx.graphics, javafx.controls;
    opens application.gui;
}