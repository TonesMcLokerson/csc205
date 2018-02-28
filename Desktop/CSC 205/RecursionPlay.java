/*
 *@creator tmd
 *@created 02018/02/28
  This Java application demonstrates recursion through various methods.
 */
public class RecursionPlay {
  public static void main(String[] argv) {
    countdown(10);
    int[] x = { 8, 16, 128, 2048, Short.MAX_VALUE, Integer.MAX_VALUE };
    for (int i = 0; i < x.length; i++) {
      System.out.print(x[i] + " reversed: ");
      reverse_digits(x[i]);
      System.out.println();
    }
    System.out.println(sum(x, 0, 0));

  }

  /*
   * TBI (To Be Implemented)...
   *
   * Starting with parameter n, print n...n-1...n-2...
   * and print BLAST OFF! when n hits zero.
   *
   * Example:  countdown(5)
   *  output:  5...4...3...2...1...BLAST OFF!
   *
   * @param n  an int to countdown from
   *
   * implementation note:  countdown(int) cannot
   * contain any repetition control statements
   */
  private static void countdown(int n) {
    if (n == 0) {
      System.out.print("BLAST OFF!\n");
    } else {
      System.out.print(n + "...");
      countdown(n - 1);
    }
  }

  /*
   * TBI (To Be Implemented)...
   *
   * Print the digits of parameter n reversed.
   *
   * Example:  reverse_digits(321)
   *  output:  123
   *
   * @param n  the int to reverse
   *
   * implementation note:  reverse_digits(int) cannot
   * contain any repetition control statements
   *
   * implementation note:  parameter n cannot be converted
   * into any type of an object
   */
  private static void reverse_digits(int n) {
    System.out.print(n % 10);
    if (n / 10 == 0) {
      return;
    }
    reverse_digits(n / 10);
    return;
  }

  /*
   * TBI (To Be Implemented)...
   *
   * Recursive method that calculates the sum
   * of the elements of an int[].
   *
   * @param x      an array-of-int
   * @param x_i    current index into x
   * @param total  current sum of x up to x[x_i]
   * @return the sum of the elements in an int[]
   *
   * implementation note:  The number of parameters
   * and/or their types can be changed, but doing so
   * may require changing the main() method.
   */
   private static long sum(int[] x, int x_i, long total) {
     int len = x.length;
     while(x_i < len) {
       total = x[x_i];
        x_i++;
   }
       return total;
    }
}
