package string_manip;
import java.io.*;
import java.util.*;

public class Solution {

  // Complete the isValid function below.
  static String isValid(String s) {

    if(s.length() <= 2) {
      return "YES";
    }

    int[] array = new int[26];
    for(int i = 0; i < s.length(); ++i) {
      ++array[s.charAt(i)-'a'];
    }

    Arrays.sort(array);
    int minIndex = 0;
    for(int i = 0; i < 25; ++i) {
      if(array[i] != 0) {
        minIndex = i;
        break;
      }
    }
    int min = array[minIndex];
    int max = array[25];



    if(max - min > 1) {
      return "NO";
    }

    for(int i = minIndex; i < 26; ++i) {
      if(array[i] != min && array[i] != max) {
        return "NO";
      }
    }
    return "YES";
  }


  public static void main(String[] args) throws IOException {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();

    String result = isValid(s);

    System.out.println(result);
    scan.close();
  }
}
