import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EnterTheMatrix extends Application {

    @Override
    public void start(Stage primaryStage){

      //creating grid pane for the numbers
        GridPane gridpane = new GridPane();
        gridpane.setPadding(new Insets(5,5,5,5));
        gridpane.setHgap(5);
        gridpane.setVgap(5);

        //Set random 0 and 1's in the grid pane
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                TextField numbers = new TextField();
                numbers.setPrefColumnCount(1);
                numbers.setText(String.valueOf((int)(Math.random() * 2)));
                gridpane.add(numbers, i, j);
                gridpane.setHalignment(numbers, HPos.CENTER);
                gridpane.setValignment(numbers, VPos.CENTER);
            }
        }

        Scene scene = new Scene(gridpane);
        primaryStage.setTitle("Enter the Matrix");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
