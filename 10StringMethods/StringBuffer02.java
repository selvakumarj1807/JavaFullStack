class StringBufferExample {
    public static void main(String[] args) {

        StringBuffer message = new StringBuffer("Hello");

        // append()
        message.append(" Student");

        System.out.println("Message : " + message);

        // insert()
        message.insert(5, " Java");

        System.out.println("Message after insertion : " + message);

        // replace()
        message.replace(0, 5, "Hi");

        System.out.println("Message after replacement : " + message);

        // delete()
        message.delete(2, 7);

        System.out.println("Message after deletion : " + message);

        // reverse()
        message.reverse();

        System.out.println("Final Message : " + message);
    }
}