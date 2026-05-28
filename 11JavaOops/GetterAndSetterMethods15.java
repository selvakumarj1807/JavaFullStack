class Employee {

    // Private Variables
    private int empId;
    private String empName;
    private double salary;

    // Getter for Employee ID
    public int getEmpId() {
        return empId;
    }

    // Setter for Employee ID
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Getter for Employee Name
    public String getEmpName() {
        return empName;
    }

    // Setter for Employee Name
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // Getter for Salary
    public double getSalary() {
        return salary;
    }

    // Setter for Salary with Validation
    public void setSalary(double salary) {

        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary");
        }
    }
}

public class GetterAndSetterMethods15 {

    public static void main(String[] args) {

        Employee emp = new Employee();

        // Setting Values
        emp.setEmpId(101);
        emp.setEmpName("Selva Kumar");
        emp.setSalary(85000);

        // Getting Values
        System.out.println("Employee ID   : " + emp.getEmpId());
        System.out.println("Employee Name : " + emp.getEmpName());
        System.out.println("Salary        : " + emp.getSalary());
    }
}


