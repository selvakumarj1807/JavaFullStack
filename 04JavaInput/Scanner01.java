import java.util.Scanner;

class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your Birth Year:");
        String birthYearInput = sc.next();

        int birthYear = Integer.parseInt(birthYearInput);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Birth Year: " + birthYear);
    }
}