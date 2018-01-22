/*
 * This Java application prints the source code needed to create 
 * a program that prints "hello, world" from <insert name>,
 * to the standard output stream.
 *
 * @creator Tony Demyan
 * @created 02018.01.20
 */
import java.util.*;
import java.text.*;

public class MakeHelloWorld
{	
	static final String FNAME = "Tony";
	static final String LNAME = "Demyan";
	static final String LN6 = "creator";
	static final String LN7 = "generated";
		
	public static void main (String[] args)
	{	
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
