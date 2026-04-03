public class Employee {
    // Attributes
    private String firstName;
    private String lastName;
    private double salary;

    // Constructor
    public Employee(String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSalary(double salary){
        this.salary = (salary < 0) ? 0.0 : salary; // Using a ternary operator
    }

    // Getters
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public double getSalary(){
        return this.salary;
    }
}

