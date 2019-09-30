/**
 * Taharih Rogers
 * Java Review 2
 * MyDate.java
 * 9/30/2019
 */

public class MyDate {
    //variables
    int year;
    int day;
    int month;
    long elapsedTime;

    //constructors
    public MyDate(){
        year = 2019;
        day = 30;
        month = 8;
    }
    //constuctor based on the value of an elapsed time
    public MyDate(long inElapsedTime)
    {
        //put in logic here
        elapsedTime = inElapsedTime;
        this.setDate(elapsedTime);
    }
    //constructor based on inputting values
    public MyDate(int inYear, int inDay, int inMonth)
    {
        year = inYear;
        day = inDay;
        month = inMonth;
    }

    //get methods
    public int getYear()
    {
        return year;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }

    //additional methods
    public void setDate(long elapsedTime)
    {
        //variables
        int seconds;
        int minutes;
        int hours;
        int days;
        int years;
        int remainingDays;
        int months;
        int daysFinal;

        //math
        seconds = (int) (elapsedTime / 1000);
        minutes = seconds / 60;
        hours = minutes / 60;
        days = hours / 24;
        years = days / 365;
        remainingDays = days % 365;
        months = remainingDays / 30;
        daysFinal = remainingDays % 30;

        //setting values
        year = years;
        day = days;
        month = months;
    }
}
