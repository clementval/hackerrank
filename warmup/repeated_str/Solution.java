package warmup.repeated_str;

import java.util.Scanner;

public class Solution {

  // Complete the repeatedString function below.
  static long repeatedString(String s, long n) {
    // aba 10

    long occurenceInOne = count(s);

    long rep = n / s.length();
    long rest = n % s.length();

    return occurenceInOne * rep + count(s.substring(0, (int)rest));
  }

  private static long count(String s) {
    int count = 0;
    for(int i = 0; i < s.length(); ++i) {
      if(s.charAt(i) == 'a') {
        ++count;
      }
    }
    return count;
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String s = scanner.nextLine();

    long n = scanner.nextLong();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    long result = repeatedString(s, n);

    System.out.println(result);

    scanner.close();
  }

}
