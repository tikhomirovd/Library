package library.main.library;

import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ViewBook implements Initializable {


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }


    public static void changeScene(String S) throws IOException {

        Stage stage = new Stage();
        String author = S.split(";")[0];
        String title = S.split(";")[1];
        String publisher = S.split(";")[2];
        String isbn = S.split(";")[3];

        TextFlow textFlow = new TextFlow();
        textFlow.setLayoutX(20);
        textFlow.setLayoutY(20);

        Text Author = new Text(10, 20, "Author: " + author + "\n\n");
        Text Title = new Text(10, 20, "Title: " + title + "\n\n");
        Text Publisher = new Text(10, 20, "Publisher: " + publisher + "\n\n");
        Text Isbn = new Text(10, 20, "ISBN: " + isbn + "\n\n");

        textFlow.getChildren().addAll(Author, Title, Publisher, Isbn);

        Group group = new Group(textFlow);
        Scene scene = new Scene(group, 300, 200, Color.WHITE);
        stage.setTitle("Book Info");
        stage.setScene(scene);
        stage.show();

        stage.setScene(scene);
        stage.show();


    }
}
