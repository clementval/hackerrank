import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        rotate_array(a, n, k);
        print_array(a);
    }

    private static void rotate_array(int[] a, int n, int k) {
        if(k > n) {
          k = k % n;
        }
        // Rotate left
        reverse_array(a, 0, n-1);
        reverse_array(a, 0, (n-k)-1);
        reverse_array(a, n-k, n-1);
        // Rotate right
        //reverse_array(a, 0, n-1);
        //reverse_array(a, 0, k-1);
        //reverse_array(a, k, n-1);
    }

    private static void reverse_array(int[] a, int left, int right) {
        while (left < right) {
            int temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
    }
 
    private static void print_array(int[] a){
        for(int i : a){
            System.out.print(i+" ");
        }
        System.out.println("");
    }

}

