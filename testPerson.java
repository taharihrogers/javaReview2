public class testPerson {
    public static void main(String[] args)
    {
        Person per = new Person("John Smith", "123 Road Blvd", "1234567890", "jsmith@email.com");
        Person student = new Student("Jane Doe", "45 Beach Rd", "0987654321", "jdoe@email.com", "Freshman");
        Person employ = new Employee("Annie May", "46 Beach Rd", "0987664321", "amay@email.com", "201 Main", "45000", new MyDate(561555550000L));
        Person faculty = new Faculty("Jonathan Vaness", "46 Coldspring Rd", "1987664321", "jvaness@email.com", "207 Main", "60000", new MyDate(561555550005L), "1 to 6 MWF", "Professor");
        Person staff = new Staff("Henry Haywood", "48 Beach Rd", "6107664321", "hhaywood@email.com", "201 Main", "50000", new MyDate(561555550010L), "SomeTitle");

        System.out.println(per.toString());
        System.out.println(student.toString());
        System.out.println(employ.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
