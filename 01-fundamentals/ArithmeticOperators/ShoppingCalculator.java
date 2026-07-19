import java.util.Scanner;

public class ShoppingCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----Better Shopping Calculator----");

        System.out.print("How many items do you have: ");
        int itemCount = input.nextInt();

        double totalPrice = 0.0;

        for ( int i = 1; i <= itemCount; i++ ) {
        
            System.out.print("Enter Price of Item: ");
            double itemPrice = input.nextDouble();

            totalPrice += itemPrice;

        }

        System.out.println("Total Price: $" + totalPrice);



        input.close();
    }
}
