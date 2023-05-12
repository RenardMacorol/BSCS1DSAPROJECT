import java.util.Scanner;
import java.util.Stack;
class Node{
    char character;
    Node left=null;
    Node right=null;
    int number=0;
    public Node(char character){
        this.character=character;
        left=right=null;
    }
   
}
/*TODO reffeer on this message chariz hahaha
 * 1.Gumagwa ng Postfix and Infix changer(Juls and aira)
 * 2.Expression changer(Pia Thoby tonny toby)
 */

public class ExpressionTree {
    
    String input;
    int decision=0;
    char data;
    String storeinput;
    Node temp,temp1,temp2;
   
    ExpressionTree(String input){
        //contructor need to refactorize this
        this.input=input;
    }
    //check if is operator
    boolean isOperator(char op){
        if(op=='^'||op=='*'||op=='/'||op=='+'||op=='-' ){
            return true;
        }else
        return false; 
      
    }
    //check the if the char is operator
    int pemdas(char op){
        if(op=='-'|| op=='+'){
            return 1;
        }
        else if (op=='*'||op=='/'){
            return 2;
        }
        else if (op=='^'){
            return 3;
        }
        return 0;
    }
    void traverse(Node root){
        if(root==null){
            return;
        }
        traverse(root.left);
        System.out.print(root.character);
        traverse(root.right);
    }
    Node tree(){
        
        Stack<Node> operand = new Stack<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='('&&input.charAt(i)==')'){
                temp=null;
           
            }
            if(!isOperator(input.charAt(i))){
                temp=new Node(input.charAt(i));
                operand.push(temp);
            }
            else{
                //operator push 
                temp= new Node(input.charAt(i));

                temp1=operand.pop();
                temp2=operand.pop();

                temp.left=temp2;
                temp.right=temp1;

                operand.push(temp);
            }

        }
        temp=operand.pop();
        return temp;
    }
    
    public  void Interface() {
        Scanner s = new Scanner(System.in);
        System.out.println("Expression Tree has been created");
        Node fix = tree();
        traverse(fix);
        System.out.println("Double check lang");
       
           
    }
}
