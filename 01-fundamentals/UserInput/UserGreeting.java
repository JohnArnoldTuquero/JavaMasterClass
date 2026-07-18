import java.util.Scanner;

public class UserGreeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----User Greeting----\n");

        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("What is your dream job? ");
        String job = input.nextLine();

        System.out.println("\nHello " + name + "! Good luck on becoming a " + job);

        input.close();
    }
}
