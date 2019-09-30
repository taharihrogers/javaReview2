public class Staff extends Employee {
    //variables
    String title;

    //constructor
    public Staff(String inName, String inAddress, String inPhone, String inEmail, String inOffice, String inSalary, MyDate inDate, String inTitle) {
        super(inName, inAddress, inPhone, inEmail, inOffice, inSalary, inDate);
        title = inTitle;
    }

    //methods
    @Override
    public String toString()
    {
        return "Name: " + name + " Address: " + address + " Phone: " + phone + " Email: " + email + " Office: " + office + " Salary: $" + salary + " Date hired: " + dateHired + " Title: " + title;
    }
}
