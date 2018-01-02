public class Main {

    public static void main(String args[]){

        Account newAccount = new Account(123, 500.00);
        newAccount.setAnnualInterestRate(4.5);
        newAccount.withdraw(200);
        newAccount.deposit(50);
        newAccount.getMonthlyInterest();
        newAccount.getdateCreated();
    }
}
