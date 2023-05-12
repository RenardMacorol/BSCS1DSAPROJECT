import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Input");
        String input =s.nextLine();
        ExpressionTree et = new ExpressionTree(input);
        et.Interface();
    }
}
