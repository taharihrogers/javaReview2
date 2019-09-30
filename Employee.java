public class Employee extends Person {
    //variables
    String office;
    String salary;
    MyDate dateHired;

    //constructor
    public Employee(String inName, String inAddress, String inPhone, String inEmail, String inOffice, String inSalary, MyDate inDate) {
        super(inName, inAddress, inPhone, inEmail);
        office = inOffice;
        salary = inSalary;
        dateHired = inDate;
    }

    //methods
    @Override
    public String toString()
    {
        return "Name: " + name + " Address: " + address + " Phone: " + phone + " Email: " + email + " Office: " + office + " Salary: $" + salary + " Date hired: " + dateHired;
    }
}
