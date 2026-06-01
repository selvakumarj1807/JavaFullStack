class ArrayExceptionDemo {

    public static void main(String[] args) {

        try {

            int[] cartItems = {101, 102, 103};

            System.out.println(cartItems[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Invalid cart item index.");
            System.out.println(e);

        }
    }
}