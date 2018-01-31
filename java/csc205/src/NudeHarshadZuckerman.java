/* x x x x x x x x x x x x x x x x x x x x x x x 
 x #NudeHarshadZuckerman                       x
 x mad props to the                            x
 x @creator: Tony Demyan                       x
 x @created: 02018.01.28/                      x
 x @course: csc205                             x
 x @url: demyans.com                           x
 x This is a program that evaluates numbers    x
 x Short.[MIN - MAX Value] and prints numbers  x 
 x that fall within the Nude, Harshad,         x            
 x and Zuckerman number sets.                  x
 x x x x x x x x x x x x x x x x x x x x x x x x
 */

public class NudeHarshadZuckerman {
	
  public static void main(String[] args) {
	  
	  final int NUMBERS_PER_LINE = 8;
	  int i = 0;
	  displayTitle();
	  
	  for (int x = 1; x <= Short.MAX_VALUE; x++) {
	    boolean nude = calcNude(x);
	    boolean harshad = calcHarshad(x);
		boolean zuckerman = calcZuckerman(x);

		if (nude && harshad && zuckerman) {
		  System.out.print(x + ",");
	        i++;

		  if (i % NUMBERS_PER_LINE == 0) {
		    System.out.print("\n");
			i = 0;
		  }
		}
	   }
	}

	public static boolean calcNude(int x) {
		
	  int digit = 0, dummy, number;
	  boolean answer = false;
	  number = x;
	  dummy = number;
	  
	  outerloop: 
	  while (number > 0) {
	    digit = number % 10;
		number = number / 10;
		
		if (digit == 0) {
		  answer = false;
		  number = -1;
		}
		
		while (digit != 0) {
		  if (dummy % digit != 0) {
		    answer = false;
			number = -1;
			break outerloop;
		  } else {
		    answer = true;
			break outerloop;
			}
		  }
	   }
		return answer;
	 }

	public static boolean calcHarshad(int x) {
		
		int number, dummy, digit = 0, sum = 0;
		boolean answer = false;
		number = x;
		dummy = number;

		{
		do {
		  digit = number % 10;
		  sum = sum + digit;
		  number = number / 10;
		  
		} while (number > 0);
		}
		
		int check = dummy % sum;
		if (check == 0) {
			answer = true;
		}
		return answer;
	}

	public static boolean calcZuckerman(int x) {
		
	  int number, dummy, remainder = 0, pro = 1, ten = 10;
	  boolean answer = false;
	  number = x;
	  dummy = number;

	  while (number > 0) {
	    pro *= (number % ten); //find digit using u=u%10
		number /= ten;
	  }
	  if (pro != 0) {
		remainder = dummy % pro;
	  } else {
		return answer;
		}
	  
	  if (remainder == 0) {
			answer = true;
		}
	  return answer;
	}

	public static void displayTitle() {
		
		String de = "Nude";
		String ad = "Harshad";
		String an = "Zuckerman";
		String title = (de + " " + ad + " and " + an + " Numbers\n");
		
		System.out.print(title);
		
		for (int i = 2, len = title.length(); i <= len; i++) {
			System.out.print("=");
		}
		System.out.println();
	}
}
