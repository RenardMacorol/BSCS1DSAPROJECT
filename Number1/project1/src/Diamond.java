package Number1.project1.src;


public class Diamond{
    public static void createDiamond(int n){
        int a, b;
        
		for (a = 1; a <= n; a++) 
		{
            for (b = 1; b <= n - a; b++) 
            {
                System.out.print(" ");
            }
            for (b = 1; b <= a * 2 - 1; b++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (a = n - 1; a > 0; a--) 
        {
            for (b = 1; b <= n - a; b++) 
            {
                System.out.print(" ");
            }
            for (b = 1; b <= a * 2 - 1; b++) 
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*Algorithms and techniques used:
 
  Based on the given problem of displaying an output using asterisks,
  I used the for loop to create the pattern.Space is displayed in 
  the first inner loop until the condition is false, and "*" is displayed 
  in the second inner loop until the condition is false. Both of the outer 
  do while statements, the first and second, show half of the pattern.
  
 */

/*
 Pseudo
Step 1: Start
Step 2: Generate n as scanner for input
Step 3: Input n variable 
Step 4: Loop a to n to print the first half of the diamond
Step 5: Loop variable b to n - a and print spaces
Step 6: Loop variable b to n * 2 - 1 and print asterisk characters
Step:7: Deduct 1 from n and create another loop
Step 8: Repeat Steps 5 & 6
Step 9: End

*/

    

