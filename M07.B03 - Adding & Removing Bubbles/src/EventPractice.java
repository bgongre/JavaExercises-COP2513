import javafx.application.Application;
import javafx.scene.input.MouseButton;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.Node;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class EventPractice extends Application {
    @Override
    public void start(Stage primaryStage) {
        //create new pane
        Pane pane = new Pane();

        //create new handle for mouse click
        pane.setOnMouseClicked(e -> {
            //create circle constructor and circle properties on mouse left click
            Circle circle = new Circle(e.getX(), e.getY(), 5);
            circle.setFill(Color.WHITE);
            circle.setStroke(Color.BLACK);
            if (e.getButton() == MouseButton.PRIMARY) {
                pane.getChildren().add(circle);
            }
            //clear circle on mouse right click
            else if (e.getButton() == MouseButton.SECONDARY) {
                ObservableList<Node> list = pane.getChildren();
                for (int i = 0; i < list.size(); i++) {
                    Circle c = (Circle)list.get(i);
                    if (circle.contains(c.getCenterX(), c.getCenterY())) {
                        list.remove(i);
                    }
                }
            }
        });

        //create a new scene and display stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Adding and Removing Bubbles");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}