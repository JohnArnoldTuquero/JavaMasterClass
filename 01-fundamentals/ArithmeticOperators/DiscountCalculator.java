import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----Discount Calculator----");
        System.out.print("Input Original Price: ");
        double orginalPrice = input.nextDouble();

        System.out.print("Input Discount Percentage: ");
        double discountPercent = input.nextDouble();

        double discountAmount = orginalPrice * (discountPercent / 100);
        double finalPrice = orginalPrice - discountAmount;

        System.out.printf("Discount Amount: %.2f\n", discountAmount);
        System.out.printf("Final Price: $%.2f\n", finalPrice);


        

        input.close();
    }
}
