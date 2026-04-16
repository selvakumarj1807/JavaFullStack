class UnaryDemo {
    public static void main(String[] args) {
        int a = 10;
        boolean flag = true;

        System.out.println("Original value of a: " + a);

        // Unary plus
        System.out.println("Unary +a: " + (+a));

        // Unary minus
        System.out.println("Unary -a: " + (-a));

        // Pre-increment
        System.out.println("Pre-increment ++a: " + (++a));

        // Post-increment
        System.out.println("Post-increment a++: " + (a++));
        System.out.println("After post-increment, a: " + a);

        // Pre-decrement
        System.out.println("Pre-decrement --a: " + (--a));

        // Post-decrement
        System.out.println("Post-decrement a--: " + (a--));
        System.out.println("After post-decrement, a: " + a);

        // Logical NOT
        System.out.println("Original flag: " + flag);
        System.out.println("After !flag: " + (!flag));
    }
}