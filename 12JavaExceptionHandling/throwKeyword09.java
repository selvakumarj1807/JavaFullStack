// Manually throw an exception.

class ThrowDemo {

    public static void main(String[] args) {

        int withdrawAmount = 60000;

        try {

            if (withdrawAmount > 50000) {

                throw new Exception("Withdrawal limit exceeded");

            }

            System.out.println("Transaction Success");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
}