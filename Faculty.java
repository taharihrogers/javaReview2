public class Faculty extends Employee {
    //variables
    String officeHours;
    String rank;

    //constructors
    public Faculty(String inName, String inAddress, String inPhone, String inEmail, String inOffice, String inSalary, MyDate inDate, String inHours, String inRank) {
        super(inName, inAddress, inPhone, inEmail, inOffice, inSalary, inDate);
        officeHours = inHours;
        rank = inRank;
    }

    //methods
    @Override
    public String toString()
    {
        return "Name: " + name + " Address: " + address + " Phone: " + phone + " Email: " + email + " Office: " + office + "Office hours: " + officeHours + " Salary: $" + salary + " Date hired: " + dateHired + " Rank: " + rank;
    }
}
