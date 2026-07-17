import java.util.Scanner;

public class MovieTicketBookingAndDiscountCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----Movie Ticket Booking & Discount Calculator----");

        System.out.print("Input Movie Ticket Price: ");
        double ticketPrice = input.nextDouble();

        System.out.print("Input Ticket Count: ");
        int ticketCount = input.nextInt();

        input.nextLine();

        System.out.print("Are you a Student/Senior? (Yes/No): ");
        String discountChoice = input.nextLine();

        double totalCost = 0;


        if ( discountChoice.equalsIgnoreCase("yes") ) {
           
            double regularTotal = ticketPrice * ticketCount;
            double discountAmount = regularTotal * 0.20;
            totalCost = regularTotal - discountAmount;

        } else if ( discountChoice.equalsIgnoreCase("no") ) {

            totalCost = ticketPrice * ticketCount;

        }

        System.out.println("\nThe total cost is: ₱" + totalCost);



        input.close();
    }
}
