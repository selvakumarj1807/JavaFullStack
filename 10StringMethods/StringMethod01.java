class StringExample {
    public static void main(String[] args) {

        // Student login name
        String username = "Selva Kumar";

        // length()
        System.out.println("Length : " + username.length());

        // toUpperCase()
        System.out.println("Uppercase : " + username.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase : " + username.toLowerCase());

        // charAt()
        System.out.println("First Character : " + username.charAt(0));

        // contains()
        System.out.println("Contains Kumar? : " + username.contains("Kumar"));

        // substring()
        System.out.println("Substring : " + username.substring(0, 5));

        // equals()
        System.out.println("Equals Selva Kumar? : "
                + username.equals("Selva Kumar"));
    }
}