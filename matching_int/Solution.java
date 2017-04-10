import java.util.*;

public class Solution {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int sizeA = sc.nextInt();
    int[] a = readArray(sc, sizeA);

    int sizeB = sc.nextInt();
    int[] b = readArray(sc, sizeB);

    List<Integer> matches = findMatch(a, b);
    for(int i : matches) {
      System.out.println("" + i);
    }
   
  }

  private static int[] readArray(Scanner sc, int size){
    int[] array = new int[size];
    for(int i = 0; i < size; ++i){
      array[i] = sc.nextInt();
    }
    return array;
  }

  private static List<Integer> findMatch(int[] a, int[] b){
    List<Integer> matches = new ArrayList<>();

    int indexA = 0;
    int indexB = 0;
    
    while(indexA < a.length && indexB < b.length){
      if(a[indexA] == b[indexB]) {
        matches.add(a[indexA]);
        ++indexA;
        ++indexB;
      } else if (a[indexA] < b[indexB]){
        ++indexA;
      } else if(a[indexA] > b[indexB]){
        ++indexB;
      }
    }
    return matches;
  }

}
