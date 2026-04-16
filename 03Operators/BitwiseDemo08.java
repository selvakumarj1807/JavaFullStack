class BitwiseDemo {
    public static void main(String[] args) {
        int a = 10;  // 1010
        int b = 2;  // 0010

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);

        // Bitwise AND
        System.out.println("a & b: " + (a & b));

        // Bitwise OR
        System.out.println("a | b: " + (a | b));

        // Bitwise XOR
        System.out.println("a ^ b: " + (a ^ b));

        // Bitwise NOT
        System.out.println("~a: " + (~a));
    }
}