import java.util.Scanner;
import java.util.Stack;
class Node{
    char character;
    Node left=null;
    Node right=null;
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
    Node temp,right,left;
   
    ExpressionTree(String input){
        //contructor need to refactorize this
        setInput(input);
    }
    public String getInput(){
        return input;
    }
    public void setInput(String input){
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
    void prefix(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.character);
        prefix(root.left);
        prefix(root.right);
    }
    void postfix(Node root){
        if(root==null){
            return;
        }
        
        postfix(root.left);
        postfix(root.right);
        System.out.print(root.character);
    }
    Node forPostfix(){
        
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

                right=operand.pop();
                left=operand.pop();

                temp.left=left;
                temp.right=right;

                operand.push(temp);
            }

        }
        temp=operand.pop();
        return temp;
    }
    
    
    public  void Interface() {
        Scanner s = new Scanner(System.in);
        Node fix = forPostfix();  
        traverse(fix);
        System.out.println();
        prefix(fix);
        System.out.println();
        postfix(fix);
        System.out.println();
    }

    
    

}
