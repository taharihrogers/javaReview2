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
}
