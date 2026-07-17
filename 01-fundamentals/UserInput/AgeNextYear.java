import java.util.Scanner;

public class AgeNextYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Age Next Year\n");
        System.out.print("Age this year: ");
        int oldAge = input.nextInt();

        int newAge = 1 + oldAge;

        System.out.println("Your age next year is " + newAge);

        input.close();
    }
    
}
