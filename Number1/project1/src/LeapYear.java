package Number1.project1.src;


public class LeapYear {

	
		public static void Leap(int year) {
			
 	      if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
 	         System.out.print(year + " is a Leap Year");
 	      else
 	         System.out.print(year + " is not a Leap Year");
		System.out.println();
 	   }
   	  }
			/*Algorithm
			    Step 1: Start
			    Step 1: Declare a variable: year
				Step 1: Initialize year to an integer value.
				Step 2: Take integer value of year from users input.
				Step 3: Check conditions
				Step 4: If the condition satisfies print year is a Leap Year else 
						print year is Not a Leap Year
				Step 5: Display the result
				Step 6: End of the program
   		
   		Explanation of the program
   			A leap year has 366 days, which comes once in every 4 year.
   			Also, a leap year is exactly divisible by 4 except for century years (years ending with 00).
   			But Century years are leap years only if they are divisible by 400
   				Conditions: Using Logical Operators
   				 1. The year is be divisible by 4 and not divisible by 100
   				 2. The year is be divisible by 400
  
		*/
	