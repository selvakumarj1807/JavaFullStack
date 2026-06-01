
class InvalidSalaryException extends Exception {

    public InvalidSalaryException(String message) {

        super(message);

    }
}

public class CustomException11 {

    static void processSalary(int salary)
            throws InvalidSalaryException {

        if (salary < 10000) {

            throw new InvalidSalaryException(
                    "Salary below company standard"
            );
        } else if (salary > 50000) {

            throw new InvalidSalaryException(
                    "Salary above company standard"
            );
        } else {
            System.out.println("Salary is valid");
        }

        System.out.println("Salary Processed");
    }

    public static void main(String[] args) {

        try {

            processSalary(80000);

        } catch (InvalidSalaryException e) {

            System.out.println(e.getMessage());

        }
    }
}
