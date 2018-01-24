/* * * * * * * * * * * * *  
 * #Singularity          * 
 * mad props to the      * 
 * @creator: Tony Demyan *
 * ** credit to          *
 * @#1: Morgan &&        *          
 * @#1a: Chainsaw D      *    
 * @created: 02018/01/2  *
 * @course: csc205       *
 * @url: demyans.com     *
 * * * * * * * * * * * * * 
 */

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.text.*;


public class Singularity
{	
	static final String FNAME = "Tony";
	static final String LNAME = "Demyan";
	static final String LN6 = "creator";
	static final String LN7 = "generated";
		
	public static void main (String[] args)
	{	
	    @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
	    System.out.println("Enter any number: ");
	    String str = s.toString();
	    Calendar now = Calendar.getInstance();
		Date date = now.getTime();
	    SimpleDateFormat ft = new SimpleDateFormat ("yyyyy.MM.dd");
	      
	    String str1 = ("/*\n" + " " + "* This Java application prints the phrase \"hello, world\"\n"
	    		        + " " + "* to the standard output stream.\n" + " " + "*\n"
	    		        + " " + "*" + " " + "@" + LN6 + " " + FNAME + " " + LNAME + "\n"
	    		        + " " + "*" + " " + "@" + LN7 + " " + ft.format(date) + "\n" + " " + "*/\n"
	    		        );
	    String str2 = ("public class HelloWorld\n" 
	                     + "{\n" + " " + " " + "public static void main(String[] args)\n" 
	                     + " " + " " + "{\n"
                         + " " + " " + " " + " " + "System" + "." + "out" + "." + "print" 
	                     + "(" + "\"" + "\\" + "\"hello" + "," + " " + "world" + "\\" + "\"" +  " " + "from" + " " 
	                     + FNAME + " " + LNAME + "\\"  + "n" + "\"" + ")" + ";\n"      
	                     + " " + " " + "}\n"
	                     + "} \n"
	                     );
	      
	      System.out.print(str1);
	      System.out.print("\n");
	      System.out.print(str2);
	}
}