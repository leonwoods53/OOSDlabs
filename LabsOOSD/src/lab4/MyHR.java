package lab4;

import java.util.Arrays;

public class MyHR {

//Variables

    private String Employees[];
    private int EmployeeNumber = 1000;
    private String[] Office;
    private String Address;
    private String EmployeeType;
    
//Constructors

    public MyHR(String[] employees, String[] office, String address, String employeeType) {
        Employees = employees;
        Office = office;
        Address = address;
        EmployeeType = employeeType;
    }
    
//Getters and Setters

    public String[] getEmployees() {
        return Employees;
    }
    public void setEmployees(String[] employees) {
        Employees = employees;
    }
    public String[] getOffice() {
        return Office;
    }
    public void setOffice(String[] office) {
        Office = office;
    }
    public String getAddress() {
        return Address;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public String getEmployeeType() {
        return EmployeeType;
    }
    public void setEmployeeType(String employeeType) {
        EmployeeType = employeeType;
    }
    
//toString

@Override
public String toString() {
    return "MyHR [Address=" + Address + ", EmployeeNumber=" + EmployeeNumber + ", EmployeeType=" + EmployeeType
            + ", Employees=" + Arrays.toString(Employees) + ", Office=" + Arrays.toString(Office) + "]";
}
    
    
//Misc
    public static void RoomNumber() {
        int RoomNumber = 100;
    }

}