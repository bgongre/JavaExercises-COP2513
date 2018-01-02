import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Game extends Application {
    @Override
    public void start(Stage primaryStage) {
        //create new pane and set panes height and width
        Pane pane = new Pane();
        double width = 200;
        double height = 200;

        //construct new circle with random properties
        Circle circle = new Circle(10);
        randomCircleProperties(circle, width, height);
        pane.getChildren().add(circle);

        // Create and register the handle
        circle.setOnMouseClicked(e -> {
            pane.getChildren().clear();
            randomCircleProperties(circle, width, height);
            pane.getChildren().add(circle);
        });

        //crate a new scene and show stage
        Scene scene = new Scene(pane, width, height);
        primaryStage.setTitle("Eye-Hand Coordination Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //set newly created circle to random color and random location within the pane
    private void randomCircleProperties(Circle c, double width, double height) {
        c.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        c.setCenterX(c.getRadius() + Math.random() *
                (width - c.getRadius() * 2));
        c.setCenterY(c.getRadius() + Math.random() *
                (height - c.getRadius() * 2));
    }
}