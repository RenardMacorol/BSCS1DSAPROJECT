package Number2;
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
 

public class ExpressionTree {
    
    String input;
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

    public double evaluate(Node root) {
        if (root == null) {
            return 0;
        }
        
        // If the node is a leaf node (operand), return its value as a double
        if (root.left == null && root.right == null) {
            return Double.parseDouble(Character.toString(root.character));
        }
        
        // Recursively evaluate the left and right subtrees
        double leftValue = evaluate(root.left);
        double rightValue = evaluate(root.right);
        
        // Perform the corresponding arithmetic operation based on the operator
        switch (root.character) {
            case '+':
                return leftValue + rightValue;
            case '-':
                return leftValue - rightValue;
            case '*':
                return leftValue * rightValue;
            case '/':
                return leftValue / rightValue;
            case '^':
                return Math.pow(leftValue, rightValue);
            default:
                return 0;
        }
    }

   

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
        changeVariable();
        Node newTree = buildTree();
        traverse(newTree);
        System.out.println();
        System.out.print("Prefix: ");
        prefix(newTree);
        System.out.println();
        System.out.print("Postfix: ");
        postfix(newTree);
        System.out.println();
        System.out.print("Tree Value: ");
        System.out.println(evaluate(newTree));

        
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

    public void changeVariable(){
        Scanner s = new Scanner(System.in);
       
        for(int i=0;i<input.length();i++){
            if(Character.isDigit(input.charAt(i))||Character.isAlphabetic(input.charAt(i))){
                char newchar;
                System.out.println("Enter the new Variable for "+input.charAt(i)+"x");
                newchar=s.next().charAt(0);
                input=input.substring(0, i)+ newchar+ input.substring(i+1);
            }
        }
        
    }
    



}

   


