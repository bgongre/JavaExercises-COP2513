import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import java.util.*;

public class ListOfNumbers extends Application {
    private TextField textField = new TextField();
    private TextArea textArea = new TextArea();
    private LinkedList<Integer> list = new LinkedList<>();

    @Override
    public void start(Stage stage) {

        //creating short, shuffle, reverse buttons
        Button btSort = new Button("Sort");
        Button btShuffle = new Button("Shuffle");
        Button btReverse = new Button("Reverse");

        //creating pane for textfield
        HBox paneForText = new HBox(10);
        paneForText.getChildren().addAll(
                new Label("Enter a number:"), textField);
        paneForText.setAlignment(Pos.CENTER);

        //creating a pane to hold buttons
        HBox paneForButtons = new HBox(5);
        paneForButtons.getChildren().addAll(
                btSort, btShuffle, btReverse);
        paneForButtons.setAlignment(Pos.CENTER);

        //set text area to be editable and added text wrap
        textArea.setEditable(false);
        textArea.setWrapText(true);

        //creating borderpane
        BorderPane pane = new BorderPane();
        pane.setTop(paneForText);
        pane.setCenter(textArea);
        pane.setBottom(paneForButtons);

        //creating handle
        textField.setOnAction(e -> add());

        //sorting number list
        btSort.setOnAction(e -> {
            Collections.sort(list);
            displayText();
        });

        //shuffle number list
        btShuffle.setOnAction(e -> {
            Collections.shuffle(list);
            displayText();
        });

        //reverse number list
        btReverse.setOnAction(e -> {
            Collections.sort(list, Collections.reverseOrder());
            displayText();
        });

        //creating scene to be placed on stage
        Scene scene = new Scene(pane, 400, 150);
        stage.setTitle("List of Numbers GUI");
        stage.setScene(scene);
        stage.show();
    }

    //adds an integer to the end of the list and displays it
    private void add() {
        list.addLast(Integer.parseInt(textField.getText()));
        displayText();
    }

    //displays list elements in the text area
    private void displayText() {
        String output = "";
        for (Integer e: list)
            output += e + " ";

        textArea.setText(output);
        textField.setText("");
    }
}
