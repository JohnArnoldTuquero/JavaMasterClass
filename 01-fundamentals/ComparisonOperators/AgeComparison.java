import java.util.Scanner;

public class AgeComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("---Age Comparison---");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You " + name + " are an adult");
        } else {
            System.out.println("You " + name + " are a minor"); // automatic dito pupunta pag hindi mahanap sa unang if
        }




        sc.close();
    }
}
