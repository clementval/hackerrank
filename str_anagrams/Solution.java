import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int numberNeeded(String first, String second) {
        int needed = 0;

        Map<Character, Integer> charMap = new HashMap<>();

        for(int i = 0; i < first.length(); i++){
            char c = first.charAt(i);
            if(charMap.containsKey(c)){
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        for(int i = 0; i < second.length(); i++){
            char c = second.charAt(i);
            if(charMap.containsKey(c)){
                charMap.put(c, charMap.get(c) - 1);
                if(charMap.get(c) == 0){
                    charMap.remove(c);
                }
            } else {
                ++needed;
            }
        }

        Iterator it = charMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            needed = needed + (int)pair.getValue();
        }

        return needed;
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
