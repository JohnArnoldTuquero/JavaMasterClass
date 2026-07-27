import java.util.Scanner;

public class HeightComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Height Comparison---");


        System.out.println("Enter person A height (in cm): ");
        int heightA = sc.nextInt();

        System.out.println("Enter person B hght (in cm): ");
        int heightB = sc.nextInt();

        if ( heightA > heightB ) {
            System.out.println("Person A is taller than Person B");
        } else if ( heightA < heightB ) {
            System.out.println("Person B is taller than Person A");
        } else {
            System.out.println("Person A and Person B have the same height");
        }

        sc.close();
    }
}
