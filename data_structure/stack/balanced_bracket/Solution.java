import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static boolean isBalanced(String value){
        Stack<Character> stack = new Stack<>();
        for(char c:value.toCharArray()){
            if(c=='('){
                stack.push(')');
            } else if(c=='{') {
                stack.push('}');
            } else if(c=='['){
                stack.push(']');
            } else if(stack.isEmpty()||stack.pop()!=c) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            if(isBalanced(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

