import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> seqList = new ArrayList<>(n);
        for(int i = 0; i < n; ++i){
            seqList.add(new ArrayList<Integer>());
        }
        
        int lastAns = 0;
        for(int i = 0; i < q; ++ i){
            int action = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int pos = ((x^lastAns)%n);            
            if(action == 1){
                seqList.get(pos).add(y);
            } else if (action == 2){
                int p2 = y % seqList.get(pos).size();
                lastAns = seqList.get(pos).get(p2);
                System.out.println(lastAns);
            }
        }
    }
}
