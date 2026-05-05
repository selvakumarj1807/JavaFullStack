// 2. Method Without Parameters but With Return Value

class Employee {

    int getSalary() {
        return 25000;
    }

    public static void main(String[] args) {
        Employee obj = new Employee();
        int salary = obj.getSalary();
        System.out.println("Salary: " + salary);
    }
}