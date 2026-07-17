import java.util.Scanner;

public class NameInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your name? ");
        String name = input.nextLine();
        //nextline read the whole line that the user input

        //Showing the answer

        System.out.println("The student name is " + name);




        input.close();
    }
}
