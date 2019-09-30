/**
 * Taharih Rogers
 * Java Review 2
 * MyDate.java
 * 9/30/2019
 */
public class Person
{
    //variables
    String name;
    String address;
    String phone;
    String email;

    //constructor
    public Person()
    {
        name = "null";
        address= "null";
        phone= "null";
        email= "null";
    }
    public Person(String inName, String inAddress, String inPhone, String inEmail)
    {
        name = inName;
        address= inAddress;
        phone= inPhone;
        email= inEmail;
    }

    //methods
    public String toString()
    {

        return "Name: " + name + " Address: " + address + " Phone: " + phone + " Email: " + email;
    }
}
