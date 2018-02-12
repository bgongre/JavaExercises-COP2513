import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import java.util.ArrayList;

public class TestingPickFourCards extends Application {
    @Override
    public void start(Stage primaryStage) {
        //create new vbox
        VBox vBox = new VBox();
        vBox.setAlignment(Pos.CENTER);
        vBox.setPadding(new Insets(5, 5, 5, 5));

        //create new hbox
        HBox hBox = new HBox(5);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(5, 5, 5, 5));
        getRandomCards(hBox);

        //create refresh button
        Button btRefresh = new Button("Refresh");

        //when refresh button is clicked, get new cards
        btRefresh.setOnAction(e -> getRandomCards(hBox));

        //add hbox content and refresh button to vbox
        vBox.getChildren().addAll(hBox, btRefresh);

        //create new scene and display stage
        Scene scene = new Scene(vBox);
        primaryStage.setTitle("Picking Four Cards");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void getRandomCards(HBox pane) {
        pane.getChildren().clear();
        //create an array list that holds cards
        ArrayList<Integer> cards = new ArrayList<>();
        for (int i = 0; i < 52; i++) {
            cards.add(i + 1);
        }

        //shuffle cards
        java.util.Collections.shuffle(cards);

        //get 4 cards and place the card images in pane
        for (int i = 0; i < 4; i++) {
            pane.getChildren().add(new ImageView(new Image("image/card/" +
                    cards.get(i) + ".png")));
        }
    }
}