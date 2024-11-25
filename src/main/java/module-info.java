module application.finalhibernate {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens application.finalhibernate to javafx.fxml;
    exports application.finalhibernate;
}