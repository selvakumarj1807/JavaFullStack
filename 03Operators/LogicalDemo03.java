class LogicalDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 20;

        System.out.println("Values: a = " + a + ", b = " + b + ", c = " + c);

        // AND Operator
        boolean andResult = (a > b && c > a);
        System.out.println("(a > b && c > a): " + andResult);

        // OR Operator
        boolean orResult = (a < b || c > a);
        System.out.println("(a < b || c > a): " + orResult);

        // NOT Operator
        boolean notResult = !(a > b);
        System.out.println("!(a > b): " + notResult);
    }
}