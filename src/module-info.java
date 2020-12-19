module JavaFxApplication {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    requires java.sql;

    exports application to javafx.fxml, javafx.graphics, javafx.controls;
    exports model.entities to javafx.base;
    opens application.gui;
    opens application.gui.util;
    opens model.entities to javafx.base;
}