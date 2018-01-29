/* * * * * * * * * * * * *
 * #HarshadNudeZuckerman  * 
 * mad props to the       * 
 * @creator: Tony Demyan  *
 * @created: 02018/01/28/ *
 * @course: csc205        *
 * @url: demyans.com      *
 * * * * * * * * * * * * * 
 */

public class HarshadNudeZuckerman
{
	final static String de = "Nude";
	final static String ad = "Harshad";
	final static String an = "Zuckerman";
		
	public static void main (String[] args)
    { 	
		for(int xx=1; xx <= 25 ; xx++)
		{	
			boolean nude = calcNude(xx);
			boolean harshad = calcHarshad(xx);
			boolean zuckerman = calcZuckerman(xx);
			
			if(nude && harshad && zuckerman == true)
			{
				System.out.print(xx + ",");
			}		  
		}
	}
	
	public static boolean calcNude(int xx) 
	{
		int a = 0,b,n;
		boolean aa=false;
		n=xx; //s.nextInt();
		b=n;
    while(n>0)
    {
        a = n % 10;
        n=n/10;
    }
    if(b%a==0) 
    {
    	aa=true;
    }
    return aa;
	}
	
	public static boolean calcHarshad(int xx) 
	{
	    int c,d,e = 0, sum = 0;
	    boolean bb=false;
	    c = xx;
        d = c;
        
        {
        do
        {   	
            e = c % 10;
            sum = sum + e;
            c = c / 10;
        }
        while( c > 0);
	    }
        int q = d%sum;       
        if(q==0) 
	    {
	    	bb=true;
	    }
        return bb;
        }
     
	
	public static boolean calcZuckerman(int xx)
	{
        int u,w,t=0,pro=1;
        boolean cc = false;
        u = xx;
        w = u;

        while(u>0)
        {
            pro *=(u%10); //find digit using u=u%10 
            u/=10;
        }           
        	t = pro%w;
        
        if(t==0) 
	    {
        	cc=true;
	    }
        return cc;
    }
	
	/*public static boolean displayTitle(int xx)
	{
		String str1 = (de+" "+ad+" "+"and"+" "+an+" Numbers\n");
		System.out.print(str1);
		for(int l=2; l <= str1.length(); l++)
		{
			System.out.print("=");			
		}
		System.out.println();
	}*/


    }
	   
