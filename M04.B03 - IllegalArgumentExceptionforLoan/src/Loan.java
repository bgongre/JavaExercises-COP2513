import java.util.Date;

public class Loan {

    //variables
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    //construct loan with specified annual interest rate.
    public Loan(double annualInterestRate, int numberOfYears, double loanAmount, Date loanDate){
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = loanDate;

        //throw IllegalArgumentException if any of the given information is less than 0 or 0
       try {
           if (this.annualInterestRate <= 0 || this.numberOfYears <= 0 || this.loanAmount <= 0) {
               throw new IllegalArgumentException();
           }
       }catch(IllegalArgumentException e){
           System.out.println("One of your amounts has caused an Illegal Argument Exception. Please check the annual interest rate, number of years, and loan amount to make sure they are not 0 or less than 0.");
       }
    }

    //find monthly payment
    public double getMonthlyPayment(){
        if(annualInterestRate <= 0 || loanAmount <= 0 || numberOfYears <= 0){
            System.exit(0);
        }
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPay = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPay;
    }

    //find total payment
    public double getTotalPayment(){
        if(numberOfYears <= 0){
            System.exit(0);
        }
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return totalPayment;
    }

    //return loanDate
    public java.util.Date getLoanDate(){
        return loanDate;
    }
}
