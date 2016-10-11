import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();

        Map<String, Integer> wordMap = new HashMap<>();
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            String word = in.next();
            if(wordMap.containsKey(word)){
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            String word = in.next();
            if(wordMap.containsKey(word)){
                wordMap.put(word, wordMap.get(word) - 1);
                if(wordMap.get(word) == 0){
                    wordMap.remove(word);
                }
            } else {
                System.out.println("No");
            }
        }
        System.out.println("Yes");
    }
}

