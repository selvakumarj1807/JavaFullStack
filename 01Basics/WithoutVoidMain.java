public class WithoutVoidMain {

    int add() {
        int a = 10, b = 20;
        return a + b;
    }

    public static void main(String[] args) {
        WithoutVoidMain d = new WithoutVoidMain();        // create object
        int result = d.add();       // call method
        System.out.println(result); // print result
    }
} 
