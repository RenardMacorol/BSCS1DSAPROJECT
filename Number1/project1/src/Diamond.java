package Number1.project1.src;


public class Diamond{
    public static void createDiamond(int input){
        int n=input;
        int col;
        int row = 1;
        
        do {
        	col = 1;

            do {
                System.out.print(" ");
            }

            while (++col <= n - row + 1);
 
            col = 1;
 
            do {
                System.out.print("*");
            }
 
            while (++col <= row * 2 - 1);
 
            System.out.println();

        }
 
        while (++row <= n);

        row = n - 1;
 
        do {
        	col = 1;

            do {
                System.out.print(" ");
            } while (++col <= n - row + 1);
            col = 1;
 
            do {
                System.out.print("*");
 
            } while (++col <= row * 2 - 1);
            System.out.println();

        }

        while (--row > 0);
    }
}

    

