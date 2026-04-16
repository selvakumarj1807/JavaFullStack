class ConstantDemo {
    public static void main(String[] args) {
        
        // Constant variable
        final int MAX_VALUE = 100;

        System.out.println("Constant Value: " + MAX_VALUE);

        // Trying to change value (This will cause ERROR)
        // MAX_VALUE = 200; //  Not allowed

        int a = 50;

        // Using constant in calculation
        int result = a + MAX_VALUE;
        System.out.println("Result: " + result);
    }
}