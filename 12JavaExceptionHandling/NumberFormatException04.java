class NumberFormatDemo {

    public static void main(String[] args) {

        try {

            String amount = "10K";

            int value = Integer.parseInt(amount);

            System.out.println(value);

        } catch (NumberFormatException e) {

            System.out.println("Invalid numeric value.");
            System.out.println(e);

        }
    }
}