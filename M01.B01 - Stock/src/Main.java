public class Main {

    public static void main(String args[]) {

        Stock stock = new Stock("ORCL", "Oracle Corporation", 34.5, 30.35);
        System.out.println("The difference in stock price is: " + stock.getChangePercent(34.5,30.35) + "%");

    }

}

