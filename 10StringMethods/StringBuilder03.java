class StringBuilderMethodsExample {

    public static void main(String[] args) {

        // Creating StringBuilder object
        StringBuilder sb = new StringBuilder("Java");

        // append()
        sb.append(" Programming");
        System.out.println("append() : " + sb);

        // insert()
        sb.insert(5, "Full Stack ");
        System.out.println("insert() : " + sb);

        // replace()
        sb.replace(5, 15, "Backend ");
        System.out.println("replace() : " + sb);

        // delete()
        sb.delete(5, 13);
        System.out.println("delete() : " + sb);

        // reverse()
        StringBuilder reverseText = new StringBuilder(sb);
        reverseText.reverse();
        System.out.println("reverse() : " + reverseText);

        // length()
        System.out.println("length() : " + sb.length());

        // charAt()
        System.out.println("charAt() : " + sb.charAt(2));

        // setCharAt()
        sb.setCharAt(0, 'j');
        System.out.println("setCharAt() : " + sb);

        // substring()
        System.out.println("substring() : " + sb.substring(0, 4));

        // capacity()
        System.out.println("capacity() : " + sb.capacity());
        
    }
}