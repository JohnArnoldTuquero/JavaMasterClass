import java.util.Scanner;

public class LogicalNOT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("---Logical NOT---");

        boolean noGF = true;  // sinasabi natin na no gf to kasi true
        boolean areSingle = true;  // same here, // sinasabi natin na no sinle to kasi true

        System.out.println("Do you have a girlfriend? " + noGF);
        System.out.println("Are you single? " + areSingle);
        // ilalqbas nito is yes no gf at yes single kasi alam ng system na true yun lahat

        System.out.println("----------------------------");

        boolean areABoy = !false;
        System.out.println("Are you a boy? " + areABoy); // lalabas is yes im a boy kasi kabaliktaran ng flase na may ! is true

        sc.close();
    }
}
