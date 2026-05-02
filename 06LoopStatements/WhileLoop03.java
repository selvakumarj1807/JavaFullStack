public class WhileLoop03 {
    public static void main(String[] args) {

        boolean isRaining = true;
        int i = 0; // Move outside the loop

        while(isRaining){
            System.out.println("It's raining. Take an umbrella!");

            i++;

            if(i > 5){
                isRaining = false; // Stop the loop
            }
        }

        System.out.println("Rain stopped.");
    }
}