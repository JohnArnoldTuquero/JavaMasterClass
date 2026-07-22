import java.util.Scanner;

public class FuelTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fuelEfficiency = 12.0;

        System.out.println("---Fuel Tracker---");

        System.out.print("Enter Initial Fuel: ");
        double initialFuel = sc.nextDouble();

        sc.nextLine();
        System.out.print("\nDid you refuel today? ");
        String refuelChoice = sc.nextLine();

        if ( refuelChoice.equalsIgnoreCase("yes")) {
            System.out.print("How much Litre did you add? ");
            double litreRefuel = sc.nextDouble();

            initialFuel +=litreRefuel;
            sc.nextLine();
            
        } else if ( refuelChoice.equalsIgnoreCase("no")) {
            System.out.println("Ok please continue...");
        } else {
            System.out.println("Invalid!!!");
        }

        sc.nextLine();
        System.out.print("\nDid you drive today? ");
        String driveTodayChoice = sc.nextLine();

        if ( driveTodayChoice.equalsIgnoreCase("yes")) {
            System.out.print("How long did you drive today? ");
            double kmRide = sc.nextDouble();

            double fuelUsed = kmRide / fuelEfficiency;

            initialFuel -= fuelUsed;
            
        } else if ( driveTodayChoice.equalsIgnoreCase("no")) {
            System.out.println("Ok please continue...");
        } else {
            System.out.println("Invalid!!!");
        }

        System.out.println("Your remaining fuel is " + initialFuel);
            



        sc.close();
    }
}
