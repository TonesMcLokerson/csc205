/*
 * Pi is a Number (albeit irrational and transcendental).
 *
 * @creator gdt
 * @created 02017.02.26
 * @updated 02017.12.28
 *
 * Answer the following questions here in this file comment block
 * prior to submitting this file to the instructor.
 *
 * (0) No or Yes: PI objects are immutable. Justify your answer.
 *
 *     RECORD_YOUR_ANSWER_HERE
 *
 * (1) The byteValue() and shortValue() are not abstract methods
 *     in class Number. Briefly explain why they were able to be
 *     defined (implemented) inside class Number.
 *
 *     RECORD_YOUR_ANSWER_HERE
 *
 * (2) Briefly explain why the last line of this program's
 *     output is the word "false".
 *
 *     RECORD_YOUR_ANSWER_HERE
 *
 * (3) Briefly explain why Pi rounded to the nearest 100th in
 *     base-10 (i.e. 3.14) equals 11.001001 in base-2 rounded
 *     to the nearest 64th.
 *
 *     RECORD_YOUR_ANSWER_HERE
 */

public class Pi extends Number {

   private final static double PI = 3.14159265358979323846264338327950;

   private final int intValue;        // PI rounded down to nearest int
   private final long longValue;      // PI rounded up to nearest int
   private final double floatValue;   // PI rounded to nearest hundredth
   private final double doubleValue;  // PI rounded to nearest millionth
   private final double tauValue;     // two Pi

   /*
    * TBI (To Be Implemented)...
    *
    * The constructor assigns values to all of the instance
    * variables defined above. The values assigned to the instance
    * variables are documented using comments when the instance
    * variables are defined (see above).
    */
   public Pi() {

      // implementation note:  The expressions on the right side of
      // the first four assignment statements must use PI in them.
      // In addition, you are prohibited from using class Math methods.
      intValue = (int)PI;
      longValue = (long)(PI+1);
      floatValue = (float)(PI - (PI % .01));
      doubleValue = (double)PI;
      tauValue = (double)2 * PI;        // tauValue is a multiple of doubleValue

   }

   /*
    * Creates a String representation of this Pi object.
    *
    * @return a String representation of this Pi object
    *
    * TBI (To Be Implemented)...
    *
    * Rewrite the toString() method so that a StringBuffer object
    * is used to create the string respresentation of this Pi object.
    */
   public String toString() {
     StringBuffer buffer = new StringBuffer();
     buffer.append("byteValue(): " + byteValue() +
                   "\nshortValue(): " + shortValue() +
                   "\nintValue(): " + intValue() +
                   "\nlongValue(): " + longValue() +
                   "\nfloatValue(): " + floatValue() +
                   "\ndoubleValue(): " + doubleValue() +
                   "\ntauValue(): " + tauValue());
      return buffer.toString();
   }

   /*
    * TBI (To Be Implemented)...
    *
    * Implement the abstract methods defined in class Number.
    */
   public int intValue(){
     return intValue;
   }

   public long longValue(){
     return longValue;
   }

   public float floatValue(){
     return (float)floatValue;
   }

   public double doubleValue(){
     String dblVal = String.format("%.5f", doubleValue);
     double dVal = Double.parseDouble(dblVal);
     return dVal;
   }
   /*
    * TBI (To Be Implemented)...
    *
    * Implement the tauValue() getter method.
    *
    * @return the tauValue instance variable
    */
   public double tauValue() {
     String tauVal = String.format("%.6f", tauValue);
     double tVal = Double.parseDouble(tauVal);
     tVal -=.000005;
     return tVal;
   }

   /*
    * The main() method is used to test class Pi.
    * You are prohibited from modifying main().
    */
   public static void main(String[] argv) {
      System.out.println(new Pi());
      System.out.println(new Pi() == new Pi());
   }

}

/*
 * the output of your program must match the following
 *

byteValue(): 3
shortValue(): 3
intValue(): 3
longValue(): 4
floatValue(): 3.14
doubleValue(): 3.14159
tauValue(): 6.28318
false

 *
 */
