class ArithmeticException01 {

    public static void main(String[] args) {

        try {
            int loanAmount = 500000;
            int tenure = 0;

            int emi = loanAmount / tenure;

            System.out.println("EMI: " + emi);

        } catch (ArithmeticException e) {

            System.out.println("Invalid tenure.");
            System.out.println(e);

        }
    }
}