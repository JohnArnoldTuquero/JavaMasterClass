import java.util.Scanner;

public class LogicalAND {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Logical AND---");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your grade: ");
        int grade = sc.nextInt();

        if ( age < 18 && grade <= 75 ) {
            System.out.println("You " + name + " is a minor and you failed the exam");
        } else {
            System.out.println("You " + name + " is an adult and you pass the exam");
        }


        sc.close();
    }
}
