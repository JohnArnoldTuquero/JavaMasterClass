import java.util.Scanner;


public class PersonalInformation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Types your Personal Information:\n");

        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("How old are you? ");
        int age = input.nextInt();

        input.nextLine(); // <-- linisin ang Enter na naiwan, basta kapa nag lagay ng user input and hindi nextline need mag ganto after

        System.out.print("Where do you current lived? ");
        String place = input.nextLine();

        System.out.print("What is your course?");
        String course = input.nextLine();

        System.out.print("What is your career choice?");
        String career = input.nextLine();

        System.out.print("Why this career? ");
        String whyThisCareer = input.nextLine();

        System.out.println("Where do you see yourself in 10 years? ");
        String future = input.nextLine();


        System.out.println("\n----------Student Information----------\n");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Current Place:" + place);
        System.out.println("Course:" + course);
        System.out.println("Career Choice:" + career);
        System.out.println(" His Reason 'Why this Career?' "+ whyThisCareer);
        System.out.println("This person will be a succesfull person in 10 years!!!");





        input.close();
    }
}
