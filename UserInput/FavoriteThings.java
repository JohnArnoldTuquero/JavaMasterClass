import java.util.Scanner;

public class FavoriteThings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Favorite Things Survey:");

        System.out.print("What is your favorite color? ");
        String color = input.nextLine();

        System.out.print("What is your favorite food? ");
        String food = input.nextLine();


        System.out.print("What is your hobby? ");
        String hobby = input.nextLine();


        System.out.println("His/Her Favorite color is " + color);
        System.out.println("His/Her Favorite food is " + food);
        System.out.println("His/Her hobby is " + hobby);

        







        input.close();
    }
    
}
