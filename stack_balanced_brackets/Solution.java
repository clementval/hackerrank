import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static boolean isBalanced(String expression) {
        Stack<Character> brackets = new Stack<>();
        for(int i = 0; i < expression.length(); ++i){
            switch (expression.charAt(i)){
		case '(':
                case '{':
                case '[':
                    brackets.push(expression.charAt(i));
                    break;
                case ')':
                    if(brackets.pop() != '(') return false;
                    break;
                case '}':
                    if(brackets.pop() != '{') return false;
                    break;
                case ']':
                    if(brackets.pop() != '[') return false;
                    break;
            }
        }           
        return true; 
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            boolean answer = isBalanced(expression);
            if(answer)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

