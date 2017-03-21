import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static HashMap<Integer, Integer> map;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] steps = {1, 2, 3};
        map = new HashMap<Integer, Integer>();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
           // System.out.println(canClimb(n));
            System.out.println(dfs(n, steps));
        }
    }

    private static int dfs(int n, int[] steps) {
        int count = 0;
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        for (int i=0; i<steps.length; i++) {
            if (map.get(n-steps[i]) != null) {
                count += map.get(n-steps[i]);
            } else {
                count += dfs(n-steps[i], steps);
            }
        }
        map.put(n, count);
        return count;
    }

    private static int canClimb(int steps){
      return canClimb(steps, 1) +
	canClimb(steps, 2) +
        canClimb(steps, 3);
    }

    private static int canClimb(int steps, int gap){
      if((steps - gap) == 0) return 1;
      if((steps - gap) < 0) return 0;
      return canClimb(steps - gap, 1) +
	canClimb(steps - gap, 2) +
        canClimb(steps - gap, 3);
    }
}
