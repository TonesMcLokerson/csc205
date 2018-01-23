import java.util.Scanner;

public class NudeHarshadZuckerman
{
	static final String de = "Nude";
	static final String ad = "Harshad";
	static final String an = "Zuckerman";
	
	
	public static void main (String[] args)
	{
		int n, p, a = 0, sum = 0;
        	
		String str1 = (de+" "+ad+" "+"and"+" "+an+" Numbers\n");
		
		System.out.print(str1);
		
		for(int l=2; l <= str1.length(); l++)
		{
			System.out.print("=");			
		}
		
		System.out.println();
		      
        for(int i=1; i<=132; i++)
        {         	
        	n = i;
        do
        {   	
            a = n % 10;
            sum = sum + a;
            n = n / 10;
        }
        while( n > 0 );       
        int r = i%sum;
        
        if(r == 0) 
        {
        	System.out.print(i+",");
        	return;
        	       	
        }
        
        }

		}
	}		
