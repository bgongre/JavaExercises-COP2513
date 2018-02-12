import java.util.Date;

public class Main {

    public static void main(String[] args){

        //create loan date
        Date loanDate = new Date();

        //testing exception
        Loan l1 = new Loan(2.5, 5,1000, loanDate);
        System.out.println("The monthly loan payment is " + l1.getMonthlyPayment());
        System.out.println("The total loan payment is: " + l1.getTotalPayment());
        System.out.println("The loan date is: " + l1.getLoanDate());

    }
}
