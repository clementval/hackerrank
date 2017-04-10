import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private static void printArray(long[] arr){
        for(int i = 0; i < arr.length; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        
        long[] a = new long[N+1];
        for(int i = 0; i < K; ++i){
            int p = sc.nextInt();
            int q = sc.nextInt();
            long sum = sc.nextLong();
            a[p] += sum;
            if((q+1)<=N) a[q+1] -= sum;
        }
        
        long x = 0, max = 0;
        for(int i = 1; i <= N; ++i){
            x = x + a[i];
            if(max < x) max = x;
        }
        
        System.out.println(max);
    }
}
