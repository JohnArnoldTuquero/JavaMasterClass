import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("----Seconds Converter----");
        System.out.println("-Seconds to Minute and Hour-");
        System.out.print("Input Seconds: ");
        long sec =  input.nextLong();

        long  hour = sec / 3600;
        long  minute = (sec % 3600) / 60;
        long seconds = sec % 60;

        System.out.println(sec + " seconds is equal to " + hour + " hour(s)");
        System.out.println("Remaining: " + minute + " minute(s) and " + seconds + " second(s)");




        input.close();
    }
}
