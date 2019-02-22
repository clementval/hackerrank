package warmup.counting_valleys;

import java.util.Scanner;

public class Solution {

  // Complete the countingValleys function below.
  private static int countingValleys(int n, String s) {
    int crtLevel = 0;
    int numberOfValley = 0;

    for(int i = 0; i < s.length(); ++i) {
      if(s.charAt(i) == 'U') {
        ++crtLevel;
        if(crtLevel == 0) {
          ++numberOfValley;
        }
      } else if (s.charAt(i) == 'D') {
        --crtLevel;
      }
    }
    return numberOfValley;
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    String s = scanner.nextLine();
    int result = countingValleys(n, s);
    System.out.println(result);
    scanner.close();
  }

}
