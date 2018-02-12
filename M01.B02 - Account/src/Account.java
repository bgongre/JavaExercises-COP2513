import java.util.Date;
import java.text.DecimalFormat;

public class Account {

    private static DecimalFormat df1 = new DecimalFormat(".##");//This is to format decimal point in account monthly interest

    //private variables
    private int id = 0;
    private double balance;
    private double annualInterestRate = 0;
    private Date dateCreated = new Date();

    //defaultAccount constructor
    public Account() {
        this.id = id;
        this.balance = balance;
    }

    //createAccount constructor
    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    //getter for id
    public int getId(){
        return this.id;
    }

    //setter for id
    public void setId(int id){
        this.id = id;
    }

    //getter for balance
    public double getBalance(){
        return this.balance;
    }

    //setter for balance
    public void setBalance(double balance){
        this.balance = balance;
    }

    //getter for annualInterestRate
    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }

    //setter for annualInterestRate
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    //getter for dateCreated
    public Date getdateCreated() {
        System.out.println("Your account was created on: " + dateCreated.toString());
        return dateCreated;
    }

    //method for withdraw
    public double withdraw(double withdrawMoney) {
        balance = (getBalance() - withdrawMoney);
        System.out.println("After withdrawl your new account balance is $" + df1.format(balance));
        return (int) balance;
    }

    //method for deposit
    public double deposit(double depositMoney) {
        balance = (getBalance() + depositMoney);
        System.out.println("After deposit your new account balance is $" + df1.format(balance));
        return (int) balance;
    }

    //method for getMonthlyInterestRate() which is annualInterestRate / 12
    public double getMonthlyInterestRate() {
        annualInterestRate = (getAnnualInterestRate() / 12);
        System.out.println("Your monthly interest rate is " + getAnnualInterestRate() + "%");
        return annualInterestRate;
    }

    //method getMonthlyInterest()
    public double getMonthlyInterest() {
        double monthlyInterest = (balance * (getMonthlyInterestRate() * .01));
        System.out.println("Your accounts monthly interest is $" + df1.format(monthlyInterest) + ".");
        return monthlyInterest;
    }

}



