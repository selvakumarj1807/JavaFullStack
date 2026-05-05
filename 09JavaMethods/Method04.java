// 4. Method With Parameters and Return Value

class Shop {

    int calculateBill(int price, int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Shop obj = new Shop();
        int total = obj.calculateBill(100, 3);
        System.out.println("Total Bill: " + total);
    }
}