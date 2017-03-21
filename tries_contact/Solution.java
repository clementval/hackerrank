import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static HashMap<String, Integer> _directory; 
    
    public static void main(String[] args) {
        _directory = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")){
                addName(contact);
            } else if(op.equals("find")){
                System.out.println(findPartial(contact));
            } 
        }
    }
    
    private static int findPartial(String partial){
        if(_directory.containsKey(partial)){
            return _directory.get(partial);
        } else {
            return 0;
        }
    }
    
    private static void addName(String name){        
        for(int i = 1; i < name.length(); ++i){
            addOrIncreaseCount(name.substring(0, i));
        }
        addOrIncreaseCount(name);        
    }
    
    private static void addOrIncreaseCount(String value){
        if(_directory.containsKey(value)){
            int currentValue = _directory.get(value);
            _directory.put(value, new Integer(currentValue + 1));
        } else {
            _directory.put(value, new Integer(1));
        }
    }
}


