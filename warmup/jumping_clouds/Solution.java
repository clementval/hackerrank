package warmup.jumping_clouds;

import java.util.Scanner;

public class Solution {

  private static int jumpingOnClouds(int[] c) {

    int count = 0;

    int index = 0;

    while (index < c.length) {
      if(index + 2 < c.length && c[index+2] == 0) { // make a 2-steps jump
        index += 2;
      } else { // single step jump
        ++index;
      }
      if(index < c.length) {
        ++count;
      }
    }
    return count;

  }

  public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] c = new int[n];

    String[] cItems = scanner.nextLine().split(" ");

    for (int i = 0; i < n; i++) {
      int cItem = Integer.parseInt(cItems[i]);
      c[i] = cItem;
    }

    int result = jumpingOnClouds(c);

    System.out.println(result);

    scanner.close();
  }

}
