public class EmployeeTest {
    public static void main(String[] args){
        Employee e1 = new Employee("Bob","Smith",5000.00);
        Employee e2 = new Employee("Shauna", "Harris",4000.00);

        System.out.println(e1.getFirstName() + "'s yearly salary is "+e1.getSalary());
        System.out.println(e2.getFirstName() + "'s yearly salary is "+e2.getSalary());

        e1.setSalary(e1.getSalary()*1.1);
        e2.setSalary(e2.getSalary()*1.1);

        System.out.println(e1.getFirstName() + "'s yearly salary is now "+e1.getSalary());
        System.out.println(e2.getFirstName() + "'s yearly salary is now "+e2.getSalary());
    }
}
