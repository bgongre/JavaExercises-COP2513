public class Stock {

    //variables
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    //constructor
    public Stock(String symbol, String name, double previousClosingPrice, double currentPrice){
        this.symbol = symbol;
        this.name = name;
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public void setCurrentPrice(double currentPrice){
        this.currentPrice = currentPrice;
    }

    //getChangePercent() Method
    public double getChangePercent(double previousClosingPrice, double currentPrice){
        double difference = (previousClosingPrice - currentPrice) / ((previousClosingPrice + currentPrice) / 2) * 100;
        return difference;
    }
}
