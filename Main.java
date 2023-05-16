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
        
        String[] arr={"(3+4*5/1)"};
        for(int i=0;i<arr.length;i++){
            String input=arr[i];
            ExpressionTree et = new ExpressionTree(input);
            et.Interface();
            System.out.println();
            
            
        }
       
    }
    
    
}
