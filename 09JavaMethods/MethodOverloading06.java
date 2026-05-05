// 6. Method Overloading (Same Name, Different Parameters)

class Area {

    int calculate(int side) {
        return side * side; // Square
    }

    int calculate(int length, int breadth) {
        return length * breadth; // Rectangle
    }

    public static void main(String[] args) {
        Area obj = new Area();

        System.out.println("Square Area: " + obj.calculate(5));
        System.out.println("Rectangle Area: " + obj.calculate(4, 6));
    }
}