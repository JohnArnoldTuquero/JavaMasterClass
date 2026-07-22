import java.util.Scanner;

public class InventoryCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soldItems = 0;
        int newDelivery = 0;
        int damageItem = 0;


        System.out.println("---Inventory Counter---");

        System.out.print("Enter Current Stock: ");
        int currentStock = sc.nextInt();

        sc.nextLine();
        System.out.print("\nIs there new delivery today? ");
        String deliveryChoice = sc.nextLine();

        if ( deliveryChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter New deliveries: ");
            newDelivery = sc.nextInt();

            currentStock += newDelivery;

        } else if (deliveryChoice.equalsIgnoreCase("no")) {
            System.out.println("Ok continue...");
            
        } else {
            System.out.println("Invalid!!!");
        }

        System.out.println("Updated Number of Stocks " + currentStock);

        sc.nextLine();
        System.out.print("\nIs there sold items today? ");
        String soldChoice = sc.nextLine();

        if ( soldChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter how much is Sold items: ");
            soldItems = sc.nextInt();

            currentStock -= soldItems;

        } else if (soldChoice.equalsIgnoreCase("no")) {
            System.out.println("Ok continue...");
            
        } else {
            System.out.println("Invalid!!!");
        }

        System.out.println("Updated Number of Stocks " + currentStock);

        sc.nextLine();
        System.out.print("\nIs there damaged items today? ");
        String damageChoice = sc.nextLine();

        if ( damageChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter how much is damaged items: ");
            damageItem = sc.nextInt();

            currentStock -= damageItem;

        } else if (damageChoice.equalsIgnoreCase("no")) {
            System.out.println("Ok continue...");
            
        } else {
            System.out.println("Invalid!!!");
        }


        System.out.println("The remaining stock is " + currentStock);








        sc.close();
    }
}
