class MultipleCatchDemo {

    public static void main(String[] args) {

        try {

            String value = null;

            System.out.println(value.length());

            int result = 10 / 0;

        } catch (NullPointerException e) {

            System.out.println("Null Error");

        } catch (ArithmeticException e) {

            System.out.println("Math Error");

        } catch (Exception e) {

            System.out.println("General Exception");

        }
    }
}