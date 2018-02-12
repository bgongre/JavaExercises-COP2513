import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class TicTacToe extends Application {

    @Override
            public void start(Stage primaryStage) {

        //create popup box
        GridPane gridpane = new GridPane();

        //add images to popup box
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int n = (int)(Math.random() * 3);
                if (n == 0)
                    gridpane.add(new ImageView(new Image("image/x.gif")), j, i);
                else if (n == 1)
                    gridpane.add(new ImageView(new Image("image/o.gif")), j, i);
                else
                    continue;
            }
        }

        //create scene for popup box
        Scene scene = new Scene(gridpane, 150, 200);
        primaryStage.setTitle("Tic-Tac-Toe");
        primaryStage.setScene(scene);
        primaryStage.show();



    }

}
