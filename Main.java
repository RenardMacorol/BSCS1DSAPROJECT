import java.util.*;

public class Main{
    public static void main(String[] args) {
        //Uncomment this for publication then ccomment the test
        /* Scanner s = new Scanner(System.in);
        System.out.println("Enter the Input");
        String input =s.nextLine();
        ExpressionTree et = new ExpressionTree(input);
        et.Interface(); */
        Testset();
        //SAMPLETESTNOTFOOD
       
        
    }
    public static void Testset(){
        //eto muna goal natin magawa sa postfix yung output
        //"((a^b^(c/d/e-f)^(x*y-m*n)))" eto yung gumana
        //Normal test set at change variable test set "(A+B*C/D)""
        //evaluate test set "(3+4*5/1)"
        //testing "unli wings"
        
        String[] arr={"((5^2^(8/12/8-2)^(3*6-9*1)))"};
        for(int i=0;i<arr.length;i++){
            String input=arr[i];
            ExpressionTree et = new ExpressionTree(input);
            et.Interface();
            System.out.println();
            
            
        }
        
        //Ano 'to, syntax to enter new user input-pia
        //Uncomment this, then comment the above syntax-pia
        
        /*UserInterface();
        while(1!=0){
        	System.out.println();
            System.out.println("Would you like to enter new input (yes or no): ");
            String update =s.nextLine();
            System.out.println();
          
            if(update.equalsIgnoreCase("yes")) {
                UserInterface();
                }
            if(update.equalsIgnoreCase("no")){
                System.out.println("System terminated.");
        	    }
            }
        }
    public static void UserInterface() {
    	Scanner s = new Scanner(System.in);
        System.out.println("Enter the Input: ");
        String input =s.nextLine();
        ExpressionTree et = new ExpressionTree(input);
        et.Interface();
        }*/
  
    }
    
    
}
