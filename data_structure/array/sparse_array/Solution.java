import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        HashMap<String, Integer> occurences = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i < n; ++i){
            String input = sc.next();
            if(occurences.containsKey(input)){
                int crt = occurences.get(input);
                occurences.remove(input);
                occurences.put(input, crt + 1);
            } else {
                occurences.put(input, 1);
            }
        }
        
        int q = sc.nextInt();
        for(int i = 0; i < q; ++i){
            String input = sc.next();  
            if(occurences.containsKey(input)){              
                System.out.println(occurences.get(input));
            } else {
                System.out.println("0");
            }
        }
        
    }
}
