module com.example.sudoku {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.sandip.sudoku to javafx.fxml;
    exports com.sandip.sudoku;
}