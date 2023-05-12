package Number1.project1.src;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String user_Name;
        int options = 0;

        System.out.println("Enter your name: ");
        user_Name = s.nextLine();
        System.out.println("Hello! " + user_Name);
        System.out.println("Tell me what to do. Here are your options");

        while (options != 5) {
            System.out.println("[1] Determine if a year is LeapYear or Not");
            System.out.println("[2] Height Comparison of 3 person");
            System.out.println("[3]Diplay the Series");
            System.out.println("[4]Display a diamond of asterisk");
            options = s.nextInt();
            switch (options) {
                case 1:
                    // leap year or notSystem.out.println("Leap Year or Not");
                    int year;
                    System.out.print("Enter Year: ");
                    year = s.nextInt();
                    LeapYear.Leap(year);
                    break;
                case 2:
                    CompareHeight ch = new CompareHeight();
                    // height comparison
                    break;
                case 3:
                    Series sr = new Series();
                    // Display Series
                    break;
                case 4:
                    Diamond diamond = new Diamond();
                    // Display the Diamond of asterisk
                    break;
                case 5:
                    System.out.println("Program Teminate");
                    break;

            }
        }

    }

}