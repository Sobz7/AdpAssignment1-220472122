package za.ac.cput.domain;

public class Employee {
    private String EmployeeId;
    private String Name;
    private String Email;

    private Employee(){

    }

    public String getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(String employeeId) {
        EmployeeId = employeeId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmployeeId='" + EmployeeId + '\'' +
                ", Name='" + Name + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
