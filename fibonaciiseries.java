
import java.util.Scanner;
public class fibonaciiseries {
    public static void main(String[] args) {
  
     Scanner sc =new Scanner (System.in);
     System.out.println("enter the number");
     int number =sc.nextInt();
     
    int a=0,b=1;
    
    System.out.print("Fibonacci Series: " + a + ", " + b);
    for (int i=2;i<=number;i++)

    {
          int c =a+b;
          System.out.print(", " + c);
          a = b;
            b = c;
            
    }

    }

    
}
