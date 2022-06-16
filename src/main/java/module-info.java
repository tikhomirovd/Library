module library.main.librarymanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    opens library.main.library to javafx.fxml;
    exports library.main.library;
    exports library.main.library.application;
    opens library.main.library.application to javafx.fxml;
}