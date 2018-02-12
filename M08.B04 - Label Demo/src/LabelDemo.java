import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ContentDisplay;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Pos;

public class LabelDemo extends Application {

    //create a combobox
    protected ComboBox<String> cbox = new ComboBox<>();

    @Override
    public void start(Stage primaryStage) {

        //set the properties for the combobox
        cbox.getItems().addAll("TOP", "BOTTOM", "LEFT", "RIGHT");
        cbox.setStyle("-fx-color: green");
        cbox.setValue("LEFT");

        //creating text gap
        TextField textGap = new TextField("0");
        textGap.setPrefColumnCount(3);

        //create hbox to hold text, labels, and combo box
        HBox contents = new HBox(10);
        contents.setAlignment(Pos.CENTER);
        contents.getChildren().addAll(new Label("contentDisplay:"),
                cbox, new Label("graphicTextGap:"), textGap);

        //create new imageView
        ImageView image = new ImageView(new Image("image/grapes.gif"));

        //image label
        Label grapes = new Label("Grapes", image);
        grapes.setGraphicTextGap(0);

        //image and label in stackpane
        StackPane imagePane = new StackPane(grapes);

        //set image
        cbox.setOnAction(e -> {
            grapes.setContentDisplay(setDisplay());
        });

        textGap.setOnAction(e -> {
            grapes.setGraphicTextGap(Integer.parseInt(textGap.getText()));
        });

        //place nodes in borderpane
        BorderPane pane = new BorderPane();
        pane.setTop(contents);
        pane.setCenter(imagePane);

        //create scene, show stage
        Scene scene = new Scene(pane, 400, 200);
        primaryStage.setTitle("Label Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //returns content to be displayed
    private ContentDisplay setDisplay() {
        if (cbox.getValue().equals("TOP"))
            return ContentDisplay.TOP;
        else if (cbox.getValue().equals("BOTTOM"))
            return ContentDisplay.BOTTOM;
        else if (cbox.getValue().equals("LEFT"))
            return ContentDisplay.LEFT;
        else
            return ContentDisplay.RIGHT;
    }
}