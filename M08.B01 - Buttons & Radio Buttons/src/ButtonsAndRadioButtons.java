import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;

public class ButtonsAndRadioButtons extends Application {

    //create text message for box
    protected Text text = new Text(50, 50, "This text is used for testing color");

    @Override
    public void start(Stage primaryStage) {

        //create hbox, buttons to move text
        HBox buttons = new HBox(20);
        Button left = new Button("<-");
        Button right = new Button("->");
        buttons.getChildren().addAll(left, right);
        buttons.setAlignment(Pos.CENTER);
        BorderPane pane = new BorderPane();
        pane.setBottom(buttons);

        //create hbox, radio buttons for color
        HBox radioButtons = new HBox(20);
        RadioButton red = new RadioButton("Red");
        RadioButton yellow = new RadioButton("Yellow");
        RadioButton black = new RadioButton("Black");
        RadioButton orange = new RadioButton("Orange");
        RadioButton green = new RadioButton("Green");
       radioButtons.getChildren().addAll(red, yellow,
                black, orange, green);

        //toggle between radio buttons
        ToggleGroup group = new ToggleGroup();
        red.setToggleGroup(group);
        yellow.setToggleGroup(group);
        black.setToggleGroup(group);
        orange.setToggleGroup(group);
        green.setToggleGroup(group);

        //add text to pane, set radio buttons top
        Pane textPane = new Pane();
        textPane.setStyle("-fx-border-color: black");
        textPane.getChildren().add(text);
        pane.setCenter(textPane);
        pane.setTop(radioButtons);

        //move text +-10 depending on if right or left button is selected
        left.setOnAction(e -> text.setX(text.getX() - 10));
        right.setOnAction(e -> text.setX(text.getX() + 10));

        //actions to set proper colors to text on radio button click
        red.setOnAction(e -> {
            if (red.isSelected()) {
                text.setFill(Color.RED);
            }
        });

        yellow.setOnAction(e -> {
            if (yellow.isSelected()) {
                text.setFill(Color.YELLOW);
            }
        });

        black.setOnAction(e -> {
            if (black.isSelected()) {
                text.setFill(Color.BLACK);
            }
        });

        orange.setOnAction(e -> {
            if (orange.isSelected()) {
                text.setFill(Color.ORANGE);
            }
        });

        green.setOnAction(e -> {
            if (green.isSelected()) {
                text.setFill(Color.GREEN);
            }
        });

        //create scene, show stage
        Scene scene = new Scene(pane, 450, 150);
        primaryStage.setTitle("Buttons & Radio Buttons");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
