import java.util.Scanner;

public class ProductPriceComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Product Price Comparison---");

        System.out.print("Enter price of first product: ");
        double firstProduct = sc.nextDouble();

        System.out.print("Enter price of second product: ");
        double secondProduct = sc.nextDouble();

        if ( firstProduct > secondProduct ) {
            System.out.println("The first product is more expensive.");
        } else  if ( firstProduct < secondProduct ) {
            System.out.println("The second product is more expensive.");
        } else if ( firstProduct == secondProduct ) {
            System.out.println("They have the same price.");
        } else {
            System.out.println("Invalid");
        }

        sc.close();
    }
}
