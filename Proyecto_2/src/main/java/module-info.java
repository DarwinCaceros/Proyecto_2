module project2.proyecto_2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens project2.proyecto_2 to javafx.fxml;
    exports project2.proyecto_2;
}