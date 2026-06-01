class NullPointerDemo {

    public static void main(String[] args) {

        try {

            String employeeName = null;

            System.out.println(employeeName.length());

        } catch (NullPointerException e) {

            System.out.println("Employee name is missing.");
            System.out.println(e);

        }
    }
}