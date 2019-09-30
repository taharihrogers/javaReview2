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
        long seconds;
        long minutes;
        long hours;
        long days;
        long years;
        long remainingDays;
        long months;
        long daysFinal;

        //math
        seconds = elapsedTime / 1000;
        minutes = seconds / 60;
        hours = minutes / 60;
        days = hours / 24;
        years = days / 365;
        remainingDays = days % 365;
        months = remainingDays / 30;
        daysFinal = remainingDays % 30;

        //setting values
        year = (int) (years + 1970);
        day = (int) (remainingDays - (years * .25) - 1);
        if(day < 0)
        {
            //fixing the value of day
            year = year - 1;
            day += 365;
            day = day % 12;
        }
        month = (int) months;
    }
}
