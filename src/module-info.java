module JavaFxApplication {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;

    exports application to javafx.fxml, javafx.graphics, javafx.controls;
    exports application.model.entities to javafx.base;
    opens application.gui;
    opens application.gui.util;
    opens application.model.entities;
}