package recursion.super_digit;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

  static int superDigit(String n, int k) {
    BigInteger v = new BigInteger(n);
    v = v.multiply(new BigInteger("" + k));
    v = v.mod(new BigInteger("9"));
    return v.intValue();
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] nk = scanner.nextLine().split(" ");
    String n = nk[0];
    int k = Integer.parseInt(nk[1]);
    int result = superDigit(n, k);
    System.out.println(result);
    scanner.close();
  }

}
