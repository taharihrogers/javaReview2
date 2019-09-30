/**
 * Taharih Rogers
 * Java Review 2
 * test.java
 * 9/30/2019
 */
public class test {
    public static void main(String[] args)
    {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        System.out.println("For date1: day: " + date1.getDay() + " month: " + date1.getMonth() + " year: " + date1.getYear());
        System.out.println("For date2: day: " + date2.getDay() + " month: " + date2.getMonth() + " year: " + date2.getYear());
    }
}
