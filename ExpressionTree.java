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
 * 1.Gumagwa ng Postfix and Infix changer//Done na ata to
 * eto nlang
 
 * 2.Expression changer 
 * 3. Evaulate the binary 1+2+3=5 ganyan
 * */

public class ExpressionTree {
    
    String input;
    int decision=0;
    char data;
    Node temp,right,left;
    Stack<Node> iN = new Stack<>();
    Stack<Character> ch = new Stack<>();
    int[] pemdas = new int[100];
       
    
   
    ExpressionTree(String input){
        //contructor need to refactorize this
        this.input=input;
       
        
    }
    void pemdas(){
        pemdas['+'] = pemdas['-'] = 1;
        pemdas['/'] = pemdas['*'] = 2;
        pemdas['^'] = 3;
        pemdas[')'] = 0;
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

    public Object evaluate(Node root) {
        if (root == null) {
            return null;
        }

        if (root.left == null && root.right == null) {
            return Character.toString(root.character); 
        }

        Object leftVal = evaluate(root.left);
        Object rightVal = evaluate(root.right);

        if (leftVal instanceof Integer && rightVal instanceof Integer) {
            int leftIntVal = (int) leftVal;
            int rightIntVal = (int) rightVal;

            switch (root.character) {
                case '+':
                    return leftIntVal + rightIntVal;
                case '-':
                    return leftIntVal - rightIntVal;
                case '*':
                    return leftIntVal * rightIntVal;
                case '/':
                    return leftIntVal / rightIntVal;
                case '^':
                    return (int) Math.pow(leftIntVal, rightIntVal);
                default:
                    return null;
            }
        } else {
            String leftStrVal = leftVal.toString();
            String rightStrVal = rightVal.toString();
            return leftStrVal + root.character + rightStrVal;
        }
    }


    /*Node Expression(){
        
        Stack<Node> operand = new Stack<>();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='('|| input.charAt(i)==')'){
                //temp=null;
           
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
    */

    public  void Interface() {
        Scanner s = new Scanner(System.in);
        Node fix = buildTree();  
        System.out.println("Expression Tree: ");
        traverse(fix);
        //modefiedTravers(fix);// ano to yung want ni aira kaso di ko magawa hahah
        System.out.println();
        System.out.print("Prefix: ");
        prefix(fix);
        System.out.println();
        System.out.print("Postfix: ");
        postfix(fix);
        System.out.println();
        System.out.println("Tree Value+ "+evaluate(fix,fix.character));
        
        
    }

    public Node buildTree(){
        pemdas();
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='('){
               ch.add(input.charAt(i));
            }
            else if(Character.isAlphabetic(input.charAt(i))||Character.isDigit(input.charAt(i))){
                temp= new Node(input.charAt(i));
                iN.add(temp);
            }
            else if(pemdas[input.charAt(i)]>0){
                while(check(i)){
                    temp = new Node(ch.peek());
                    ch.pop();
     
                    
                    right = iN.peek();
                    iN.pop();
     
                    
                    left = iN.peek();
                    iN.pop();
     
                   
                    temp.left = left;
                    temp.right = right;
     
                  
                    iN.add(temp);
                }
              ch.push(input.charAt(i));
            }
            else if(input.charAt(i) == ')'){
                while (!ch.isEmpty() && ch.peek() != '(')
                {
                    temp = new Node(ch.peek());
                    ch.pop();

                    right = iN.peek();
                    iN.pop();
                    left = iN.peek();
                    iN.pop();

                    temp.left = left;
                    temp.right = right;

                    iN.add(temp);
                }
            ch.pop();
            }
        }
        temp = iN.peek();
        return temp;

    }
    public boolean check(int i){
        if(!ch.isEmpty()&&ch.peek()!='('){
            if((input.charAt(i) != '^' && pemdas[ch.peek()] 
            >= pemdas[input.charAt(i)])|| 
            (input.charAt(i) == '^'&& pemdas[ch.peek()] > pemdas[input.charAt(i)])){
                return true;
            }
           
        }
        return false;
    }
    



}

   


