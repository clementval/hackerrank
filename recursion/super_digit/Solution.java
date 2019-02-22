package recursion.super_digit;

import java.util.Scanner;

public class Solution {

  static int superDigit(String n, int k) {
    n = n.chars().mapToLong(Character::getNumericValue).sum() * k  + "";
    return (n.length() > 1) ? superDigit(n, 1) :
        Character.getNumericValue(n.charAt(0));
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
