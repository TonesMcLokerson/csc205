import java.util.Scanner;

public class TwoBitMux {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int y=0;
      System.out.println("Enter a Select value");
      int s = sc.nextInt();
      System.out.println("Enter a A value");
      int a = sc.nextInt();
      System.out.println("Enter B Select value");
      int b = sc.nextInt();

      if (s == 0){
        if(b == 1)
          y = 1;
      }else if(s == 1){
         if(a == 1)
           y = 1;
      }else{
         y = 0;
      }
      System.out.println("The output is " + y);
      }
}
