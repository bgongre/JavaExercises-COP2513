import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class ViewCalendar {

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        //prompt user to enter year
        System.out.println("Enter full year (e.g., 2012): ");
        int year = input.nextInt();

        //prompt user to enter month
        System.out.println("Enter month as a number between 1 and 12: ");
        int month = input.nextInt();

        //print calendar for the month of the year
        printCalendar(year, month);
    }

    public static void printCalendar(int year, int month){
        //new calendar
        java.util.Calendar calendar = new GregorianCalendar();
        calendar.clear();
        calendar.set(year, month -1,1);
        System.out.println(calendar.getDisplayName(java.util.Calendar.MONTH, java.util.Calendar.LONG, Locale.US) + " " + calendar.get(java.util.Calendar.YEAR));
        int startDay = calendar.get(java.util.Calendar.DAY_OF_WEEK);
        int total = calendar.getActualMaximum(java.util.Calendar.DAY_OF_MONTH);

        printMonthBody(total, startDay);
    }

    //print month body
    public static void printMonthBody(int total, int startDay){

        int day = 0;

        System.out.println("---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 1; i < startDay; i++) {
            System.out.print("    ");
            day++;
        }

        for (int i = 1; i <= total; i++){

            if(i < 10)
                System.out.print(i + " ");
            else
                System.out.print(i);
                day++;

            if (day == 7){
                day = 0;
                System.out.println();
            }
            else
                System.out.print("  ");
        }

        System.out.println();

    }

}
