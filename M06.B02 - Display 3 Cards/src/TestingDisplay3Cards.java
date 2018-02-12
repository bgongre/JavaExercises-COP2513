import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.ArrayList;

public class TestingDisplay3Cards extends Application {

    @Override
    public void start(Stage primageyStage) {

        //create array for cards at start of program
        ArrayList<Integer> cards = getCards();

        //create HBox
        HBox hbox = new HBox(5);
        hbox.setPadding(new Insets(5,5,5,5));

        //get card images to show
        for (int i = 0; i < 3; i++){
            hbox.getChildren().add(new ImageView(new Image("image/card/" + cards.get(i) + ".png")));
        }

        //create scene to place in primaryStage
        Scene scene = new Scene(hbox);
        primageyStage.setTitle("Display 3 Cards");
        primageyStage.setScene(scene);
        primageyStage.show();

    }

    //creates array with 52 cards shuffled
    private ArrayList<Integer> getCards(){
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < 52; i++){
            cards.add(i +1);
        }
        java.util.Collections.shuffle(cards);
        return cards;
    }

}
