import java.util.*;
public class Solution {
       
     static void partition(int[] ar) {
         List<Integer> left = new ArrayList<>();
         List<Integer> right = new ArrayList<>();         
         List<Integer> equal = new ArrayList<>();
         
         int pivot = ar[0];
         equal.add(pivot);
         for(int i = 1; i < ar.length; ++i){
             if(ar[i] < pivot){
                 left.add(ar[i]);
             } else if(ar[i] > pivot){
                 right.add(ar[i]);
             } else {
                 equal.add(ar[i]);
             }
         }
         
         for(int i : left){
             System.out.print(i+" ");
         }
         for(int i : equal){
             System.out.print(i+" ");
         }
         for(int i : right){
             System.out.print(i+" ");
         }
	 System.out.println("");
     }   

       
     public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar);
       }    
   }


