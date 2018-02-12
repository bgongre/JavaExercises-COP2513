import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.geometry.Pos;

public class TrafficLight extends Application {

    @Override
    public void start(Stage primaryStage) {

        // Create a vbox
        VBox circlePane = new VBox(5);
        circlePane.setAlignment(Pos.CENTER);

        //create circles set c1 to fill red
        Circle c1 = getCircle();
        Circle c2 = getCircle();
        Circle c3 = getCircle();
        c1.setFill(Color.RED);

        //place circles in vbcx
        circlePane.getChildren().addAll(c1, c2, c3);

        //create rectangle to hold circles
        Rectangle rectangle = new Rectangle();
        rectangle.setFill(Color.WHITE);
        rectangle.setWidth(30);
        rectangle.setHeight(100);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(2);
        StackPane stopSign = new StackPane(rectangle, circlePane);

        //create hbox
        HBox radioButtons = new HBox(5);
        radioButtons.setAlignment(Pos.CENTER);

        //create radio buttons for traffic lights
        RadioButton red = new RadioButton("Red");
        RadioButton yellow = new RadioButton("Yellow");
        RadioButton green = new RadioButton("Green");

        //create groups to toggle radio buttons
        ToggleGroup group = new ToggleGroup();
        red.setToggleGroup(group);
        yellow.setToggleGroup(group);
        green.setToggleGroup(group);
        red.setSelected(true);
        radioButtons.getChildren().addAll(red, yellow, green);

        //create border pane
        BorderPane pane = new BorderPane();
        pane.setCenter(stopSign);
        pane.setBottom(radioButtons);

        //create actions based on radio button selected
        red.setOnAction(e -> {
            if (red.isSelected()) {
                c1.setFill(Color.RED);
                c2.setFill(Color.WHITE);
                c3.setFill(Color.WHITE);
            }
        });

        yellow.setOnAction(e -> {
            if (yellow.isSelected()) {
                c1.setFill(Color.WHITE);
                c2.setFill(Color.YELLOW);
                c3.setFill(Color.WHITE);
            }
        });

        green.setOnAction(e -> {
            if (green.isSelected()) {
                c1.setFill(Color.WHITE);
                c2.setFill(Color.WHITE);
                c3.setFill(Color.GREEN);
            }
        });

        //create scene, show stage
        Scene scene = new Scene(pane, 200, 150);
        primaryStage.setTitle("Traffic Light");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //default circle
    private Circle getCircle() {
        Circle c = new Circle(10);
        c.setFill(Color.WHITE);
        c.setStroke(Color.BLACK);
        return c;
    }
}
