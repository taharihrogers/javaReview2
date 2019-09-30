public class Student extends Person {
    //variables
    final String classStatus;

    //constructor
    public Student(String inName, String inAddress, String inPhone, String inEmail, String inClass) {
        super(inName, inAddress, inPhone, inEmail);
        classStatus = inClass;
    }

    //methods
    @Override
    public String toString()
    {
        return "Name: " + name + " Address: " + address + " Phone: " + phone + " Email: " + email + " Class: " + classStatus;
    }
}
