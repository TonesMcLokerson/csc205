import java.util.*;

/*
 * This program checks if an array is sorted.
 * An unsorted array is sorted in ascending order.
 * An array in ascending order is left unchanged.
 * An array in descending order is reversed.
 *
 * @creator td
 * @created 02018.01.31
 * @assignment  implement the checkIfSorted() 
 *              and reverseArray() methods
 */

public class ArrayPlay {

   // checkIfSorted() return values...
   private static final int UNSORTED = 0;
   private static final int ASCENDING = 1;
   private static final int DESCENDING = 2;

   public static void main(String[] argv) {
      int[][] data = { 
         { 7, 7, 3, 9, 0, 5, 6 },
         { 9, 8, 8, 5, 3, 0 },
         { 1, 5, 6, 6, 6, 7, 9 },
         { 1, 9, 3, 5, 2, 7, 3, 5 },
         { 0 },
         { 1, 2 },
         { 3, 2, 1 },
         { 5, 5, 5, 5, 5 },
      };
      for (int i = 0; i < data.length; i++) {
         printArray(data[i], false);
         switch (checkIfSorted(data[i])) {
            case ArrayPlay.UNSORTED:
               System.out.print(" (not sorted) ");
               Arrays.sort(data[i]);
               printArray(data[i], true);
               break;
            case ArrayPlay.DESCENDING:
               System.out.print(" (descending sorted order) ");
               reverseArray(data[i]);
               printArray(data[i], true);
               break;
            case ArrayPlay.ASCENDING:
               System.out.println(" (ascending sorted order)");
               break;
         }
      }
   }

private static int checkIfSorted(int[] data) {
	      
    // clear out equal entries from the beginning
    int i = 1;
    while (i < data.length && data[i - 1] == data[i]) {
        i++;
    }

    // if there are no entries left, then it is nonincreasing and nondecreasing
    //if (i>= data.length) {
    //    return;
    //}

    int previous = data[i - 1];
    if (i < data.length && previous > data[i]) {
        for (; i < data.length; i++) {
            if (previous < data[i]) {
                return UNSORTED;
            }

            previous = data[i];
        }

        return DESCENDING;
    }

    for (; i < data.length; i++) {
        if (previous > data[i]) {
            return UNSORTED;
        }

        previous = data[i];
    }

    return ASCENDING;
}


private static void printArray(int[] x, boolean nl) {
      System.out.print("[");
      for (int i = 0, j = x.length - 1; i < j; i++)
         System.out.print(x[i] + ",");
      System.out.print(x[x.length - 1] + "]");
      if (nl) System.out.println();
   }

   /*
    * TBI (To Be Implemented)...
    *
    * Reverse the contents of the int[] parameter.
    *
    * @param  data  an array of integers
    */
   private static void reverseArray(int[] data) {
	   
      for(int i=0; i<data.length/2; i++){ 
	     int temp = data[i]; 
	     data[i] = data[data.length -i -1]; 
	     data[data.length -i -1] = temp; 
		 }
   }

   /*
    * TBI (To Be Implemented)...
    *
    * Checks if the contents of the int[] parameter is sorted.
    *
    * @param  data  an array of integers
    * @return UNSORTED or ASCENDING or DESCENDING
    */
   private ArrayPlay(int[] data) {
	   return;
   }

}