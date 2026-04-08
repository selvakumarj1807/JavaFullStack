class DemoWithoutStatic {
    void show() {
        System.out.println("Non-static method");
    }

    public static void main(String[] args) {
        DemoWithoutStatic d = new DemoWithoutStatic();
        d.show();   
    }
}