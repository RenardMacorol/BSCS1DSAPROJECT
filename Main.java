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
        
        String[] arr={"ABC*D/+","123*4/+"};
        for(int i=0;i<arr.length;i++){
            String input=arr[i];
            ExpressionTree et = new ExpressionTree(input);
            
            et.Interface();
            System.out.println();
        }
       
    }
}
