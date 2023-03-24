package za.ac.cput.domain;

public class Employee {
    private String employeeId;
    private String name;
    private String email;

    public Employee(String employeeId, String name, String email) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public static class EmployeeBuilder{
        private String employeeId;
        private String name;
        private String email;

        public EmployeeBuilder setEmployeeId(String employeeId){
            this.employeeId = employeeId;
            return this;
        }

        public EmployeeBuilder setName(String name){
            this.name = name;
            return this;
        }

        public EmployeeBuilder setEmail(String email){
            this.email = email;
            return this;
        }

        public Employee build(){
            return new Employee(employeeId,name,email);
        }

    }
}
