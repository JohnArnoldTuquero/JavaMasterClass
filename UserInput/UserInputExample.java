import java.util.Scanner;

public class UserInputExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // String
        System.out.print("Enter your full name: ");
        String name = input.nextLine();

        // int
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // double
        System.out.print("Enter your height (cm): ");
        double height = input.nextDouble();

        // float
        System.out.print("Enter your weight (kg): ");
        float weight = input.nextFloat();

        // char
        System.out.print("Enter your middle initial: ");
        char middleInitial = input.next().charAt(0);

        // boolean
        System.out.print("Are you a BSIT student? (true/false): ");
        boolean isStudent = input.nextBoolean();

        // long
        System.out.print("Enter your dream salary: ");
        long salary = input.nextLong();

        // short
        System.out.print("Enter your year level: ");
        short yearLevel = input.nextShort();

        // byte
        System.out.print("Enter your favorite number (1-100): ");
        byte favoriteNumber = input.nextByte();

        System.out.println("\n========== STUDENT PROFILE ==========");
        System.out.println("Name            : " + name);
        System.out.println("Age             : " + age);
        System.out.println("Height          : " + height + " cm");
        System.out.println("Weight          : " + weight + " kg");
        System.out.println("Middle Initial  : " + middleInitial);
        System.out.println("BSIT Student    : " + isStudent);
        System.out.println("Dream Salary    : " + salary);
        System.out.println("Year Level      : " + yearLevel);
        System.out.println("Favorite Number : " + favoriteNumber);
        System.out.println("=====================================");

        input.close();
    }
}