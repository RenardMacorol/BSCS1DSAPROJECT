package Number1.project1.src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        String userName, proceed;
	        
	        System.out.print("Enter your name: ");
	        userName = s.nextLine();
	        System.out.println("Hello, " + userName+ "!\n");
	        
	        while(true) {
	        System.out.println("--------------------------------------\n");//for aesthetic display only, nakakalito kasi LOL
	        //to terminate the program instead of exit option
	        System.out.print("Would you like to proceed [yer or no]: ");
	        proceed = s.nextLine();
	        System.out.println();
	        
	        if (proceed.equalsIgnoreCase("no")){
	        	System.out.println("System Terminated");
	        	break;
	        	}
	        if (proceed.equalsIgnoreCase("yes")){
	        	displayOptionMenu(s);
	        	}
	        }
	        s.close();
	    }
	        
	        public static void displayOptionMenu(Scanner s) {
		        int option = 0;
		        int input=0;
	        System.out.println("Tell me what to do. Here are your options:\n");
	        	
	  
	         System.out.println("[1] Determine if a year is a leap year or not");
	         System.out.println("[2] Height comparison of three persons");
	         System.out.println("[3] Display the series");
	         System.out.println("[4] Display a diamond of asterisk");
	         System.out.print("Enter your choice: ");
	         option = s.nextInt();
	            
	            switch (option) {
	                case 1:
	                    // leap year or notSystem.out.println("Leap Year or Not");
	                    System.out.print("Enter Year: ");
	                    input = s.nextInt();
	                    LeapYear.Leap(input);
	                    break;
	                case 2:
	                	// height comparison
	                    CompareHeight ch = new CompareHeight();
	                    break;
	                case 3:
	                	//fibonacci
	                    System.out.print("Enter the limit for the series: ");
	                    input= s.nextInt();
	                    Series.createSeries(input);
	                    System.out.println();
	                    break;
	                case 4:
	                	//diamond
	                    System.out.print("Enter the desired number of rows from the middle: ");
	                    input = s.nextInt();
	                    Diamond.createDiamond(input);
	                    break;
	                    
	                default: 
	                	//to display invalid input
	                	System.out.println("Invalid Option!");
	                	break;

	    }
	            s.nextLine();//will consume new line before line15
	            System.out.println();

        /*Scanner s = new Scanner(System.in);
        String user_Name;
        int options = 0;
        int input=0;

        System.out.println("Enter your name: ");
        user_Name = s.nextLine();
        System.out.println("Hello! " + user_Name);
        System.out.println("Tell me what to do. Here are your options");

        while (options != 5) {
            System.out.println("[1] Determine if a year is LeapYear or Not");
            System.out.println("[2] Height Comparison of 3 person");
            System.out.println("[3] Diplay the Series");
            System.out.println("[4] Display a diamond of asterisk");
            options = s.nextInt();
            switch (options) {
                case 1:
                    // leap year or notSystem.out.println("Leap Year or Not");
                    System.out.print("Enter Year: ");
                    input = s.nextInt();
                    LeapYear.Leap(input);
                    break;
                case 2:
                    // print and enter the height of the first person
		            System.out.println("Enter the height of the first person: ");
		            //assume that we will use centimeters or feet that's why we use int
		            int height1= s.nextInt();
		            //the second person
		            System.out.println("Enter the height of the second person: ");
		            int height2= s.nextInt();
                    System.out.println("Enter the height of the third person: ");
                    int height3= s.nextInt();
                    CompareHeight.compare(height1, height2, height3);
                    break;
                case 3:
                    System.out.print("Enter the limit for the series: ");
                    input= s.nextInt();
                    Series.createSeries(input);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Display input: ");
                    input = s.nextInt();
                    Diamond.createDiamond(input);
                    break;
                case 5:
                    System.out.println("Program Teminate");
                    break;

            }
        }*/

    }

}