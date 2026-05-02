class IfElseStatements02 {
    public static void main(String[] args) {
        int num = 3;

        if (num > 5) {
            System.out.println("The number is greater than 5.");
        } else {
            System.out.println("The number is not greater than 5.");
        }

        if (num % 2 == 0) {
            System.out.println("The number is even."); // 
        } else {
            System.out.println("The " + num +" is odd."); // The 3 is Odd number.
        }
    }
}