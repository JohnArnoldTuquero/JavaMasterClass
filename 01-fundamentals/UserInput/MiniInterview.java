import java.util.Scanner;

public class MiniInterview {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----Mini Interview----");

        System.out.print("To start, could you please state your full name? ");
        String name = input.nextLine();

        System.out.print("How old are you? ");
        int age = input.nextInt();

        input.nextLine();

        System.out.print("What is a hobby or activity you enjoy doing in your free time? ");
        String hobby = input.nextLine();

        System.out.print("Among the languages you have used, what is your favorite programming language and why? ");
        String languangeCode = input.nextLine();

        System.out.print("Looking ahead, what is your dream career or ultimate professional goal? ");
        String goal = input.nextLine();


        System.out.println("\n=================================");
        System.out.println("        INTERVIEW SUMMARY        ");
        System.out.println("=================================");
        System.out.println("Full Name:    " + name);
        System.out.println("Age:          " + age + " years old");
        System.out.println("Hobby:        " + hobby);
        System.out.println("Fav Language: " + languangeCode);
        System.out.println("Dream Career: " + goal);
        System.out.println("=================================");


        input.close();
    }
}
