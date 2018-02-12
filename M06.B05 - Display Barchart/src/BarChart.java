import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.geometry.Pos;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.geometry.Insets;

public class BarChart extends Application {

    @Override
    public void start(Stage primaryStage){

        //create hbox
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.BOTTOM_CENTER);

        //create array for graded items and array for grades
        String[] gradedItem = {"Project", "Quiz", "Midterm", "Final"};
        double[] grades = {20, 10, 30, 40};

        double max = getMax(grades);

        double height = 300;
        double width = 150;

        //create stackpane layout
        StackPane stackpane = new StackPane();
        stackpane.setPadding(new Insets(10,10,10,10));

        //create rectangles with colors to be used as bars in bar chart
        Rectangle r1 = new Rectangle(0,0,width, height * grades[0] / max);
        r1.setFill(Color.RED);
        Rectangle r2 = new Rectangle(0,0,width, height * grades[1] / max);
        r2.setFill(Color.BLUE);
        Rectangle r3 = new Rectangle(0,0,width, height * grades[2] / max);
        r3.setFill(Color.GREEN);
        Rectangle r4 = new Rectangle(0,0,width, height * grades[3] / max);
        r4.setFill(Color.ORANGE);

        //create text to be displayed, pull items from gradeditems array and grades array
        Text t1 = new Text(0,0, gradedItem[0] + " -- " + grades[0] + "%");
        Text t2 = new Text(0,0, gradedItem[1] + " -- " + grades[1] + "%");
        Text t3 = new Text(0,0, gradedItem[2] + " -- " + grades[2] + "%");
        Text t4 = new Text(0,0, gradedItem[3] + " -- " + grades[3] + "%");

        //adding vbox to hbox
        hbox.getChildren().addAll(getVbox(t1,r1), getVbox(t2,r2), getVbox(t3, r3), getVbox(t4, r4));
        stackpane.getChildren().add(hbox);

        //create scene
        Scene scene = new Scene(stackpane);
        primaryStage.setTitle("Display Barchart");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public double getMax(double[] l){
        double max = l[0];
        for (int i = 0; i < l.length; i++){
            if(l[i] > max)
                max = l[i];
        }

        return max;
    }

    //set text and rectangles using vbox
    public VBox getVbox(Text t, Rectangle r){
        VBox vbox = new VBox(5);
        vbox.setAlignment(Pos.BOTTOM_CENTER);
        vbox.getChildren().addAll(t, r);
        return vbox;
    }

public static void main(String args[]){
launch(args);
}
}
