import java.util.Scanner;

public class nextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("I will try to make a user input using nextLine:");

        System.out.println("\n------------Example------------------\n");

        System.out.println("What is your name? ");
        String name = input.nextLine();
        //nextline read the whole line that the user input

        //Showing the answer

        System.out.println("The student name is " + name);


        input.close();
    }
}
