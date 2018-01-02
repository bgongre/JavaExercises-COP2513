import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.Stage;

public class TestingInvestmentCalculator extends Application {

    //create text fields for input
    private TextField investmentAmount = new TextField();
    private TextField numberOfYears = new TextField();
    private TextField annualInterestRate = new TextField();
    private TextField futureValue = new TextField();

    //create button to calculate future investment
    private Button btCalculate = new Button("Calculate");

    @Override
    public void start(Stage primaryStage) {
        //create gridpane, add labels for text fields
        GridPane pane = new GridPane();
        pane.setVgap(5);
        pane.setHgap(5);
        pane.add(new Label("Investment Amount:"), 0, 0);
        pane.add(investmentAmount, 1, 0);
        pane.add(new Label("Number Of Years:"), 0, 1);
        pane.add(numberOfYears, 1, 1);
        pane.add(new Label("Annual Interest Rate:"), 0, 2);
        pane.add(annualInterestRate, 1, 2);
        pane.add(new Label("Future value:"), 0, 3);
        pane.add(futureValue, 1, 3);
        pane.add(btCalculate, 1, 4);

        //set field alignment in pane
        pane.setAlignment(Pos.CENTER);
        investmentAmount.setAlignment(Pos.BOTTOM_RIGHT);
        numberOfYears.setAlignment(Pos.BOTTOM_RIGHT);
        annualInterestRate.setAlignment(Pos.BOTTOM_RIGHT);
        futureValue.setAlignment(Pos.BOTTOM_RIGHT);
        futureValue.setEditable(false);
        pane.setHalignment(btCalculate, HPos.RIGHT);
        pane.setPadding(new Insets(10, 10, 10, 10));

        //once calculate button is clicked, point to futureValue() for calculation
        btCalculate.setOnAction(e -> futureValue());

        //create a new scene, show stage
        Scene scene = new Scene(pane);
        primaryStage.setTitle("Investment Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //calculate what the future investment will be based off input in text fields
    private void futureValue() {
        double investAmount = Double.parseDouble(investmentAmount.getText());
        int years = Integer.parseInt(numberOfYears.getText());
        double monthlyInterestRate =
                Double.parseDouble(annualInterestRate.getText()) / 1200;
        futureValue.setText(String.format("$%.2f",
                (investAmount * Math.pow(1 + monthlyInterestRate, years * 12))));
    }
}
