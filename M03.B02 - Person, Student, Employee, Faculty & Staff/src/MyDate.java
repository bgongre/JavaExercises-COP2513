import java.util.GregorianCalendar;

public class MyDate {

    //variables
    int year;
    int month;
    int day;

    //default object
    public MyDate(){
        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }

    //MyDate with specified elapsed time
    MyDate(long elapsedTime){
        setDate(elapsedTime);
    }

    //specific constructor
    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    //getter year
    public int getYear() {
        return year;
    }

    //getter month
    public int getMonth() {
        return month;
    }

    //getter day
    public int getDay() {
        return day;
    }

    //setDate() sets new date for the object using elapsed time
    public void setDate(long elapsedTime){
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        year = calendar.get(GregorianCalendar.YEAR);
        month = calendar.get(GregorianCalendar.MONTH);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
