package Number1.project1.src;


public class Series {
    /*1.) Start.
      2.) Create a new Scanner object called sc to read user input.
      3.) Prompt the user to enter the limit for the series and store the value in x.
      4.) Close the Scanner object sc.
      5.) Loop through each number i from 1 to x:
         Call the function recursive(i) and print the return value followed by a space.
          Function fibonacci(x):
            a.) If x is 1 or 2, return 1.
            b.) Otherwise, return the sum of fibonacci(x - 1) and fibonacci(x - 2). 
      6.) End.
      */
   public static void createSeries(int input){
        for (int i = 1; i <= input; i++) {
            System.out.print(recursive(i) + " ");

        }
    }
    static int recursive(int x){
        if (x == 1 || x == 2) {
            return 1;
        } else {
            return recursive(x - 1) + recursive(x - 2);
        }
    
    }
}
    

