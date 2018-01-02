import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ColorAndFont extends Application{

    @Override
    public void start(Stage primaryStage){

        //create HBOX
        HBox hbox = new HBox(10);
        hbox.setPadding(new Insets(5,5,5,5));
        hbox.setAlignment(Pos.CENTER);

        //Add text to the HBOX
        for(int i = 0; i < 5; i++){
            //Creating text for HBOX
            Text text = new Text("JavaFX");
            //setting font style and size
            text.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            //rotate text 90 degrees
            text.setRotate(90);

            //random text color and opacity
            text.setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
            hbox.getChildren().add(text);

        }

        Scene scene = new Scene(hbox, 500, 100);
        //stage title
        primaryStage.setTitle("Testing Color & Font");
        primaryStage.setScene(scene);
        //display ui
        primaryStage.show();

    }




}
