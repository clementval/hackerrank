import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue <> ();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((x,y) -> y-x);
       
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            int val = in.nextInt();

            if(minHeap.size() > 0 && val > minHeap.peek()){
                minHeap.offer(val);
            } else {
                maxHeap.offer(val);
            }

            if(minHeap.size() < maxHeap.size()){
                minHeap.offer(maxHeap.poll());
            } else if(minHeap.size() > maxHeap.size() + 1){
                maxHeap.offer(minHeap.poll());
            } 

            if(minHeap.size() == maxHeap.size()){
              System.out.println((double)(minHeap.peek() + maxHeap.peek()) / 2.0);
            } else {
              System.out.println((double)minHeap.peek());
            }
        }
    }
}

