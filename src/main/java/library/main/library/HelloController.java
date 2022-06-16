package library.main.library;

import javafx.fxml.FXML;
import library.main.library.application.LibraryController;

import java.io.IOException;

public class HelloController {

    @FXML
    protected void onStartButtonClick() throws IOException {
        LibraryController.changeScene();
    }
}