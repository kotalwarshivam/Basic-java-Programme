import java.util.Scanner;
public class factorial 
{
    public static void main(String[] args)
 {
   Scanner sc =new Scanner(System.in);
   System.out.println("enter the factoral number:");
   int number=sc.nextInt();  
   int fact =1;// we dont use zero it not make sense zero is zero always in math
     
     for (int i=1;i<=number;i++)
     {
         fact=fact*i;
         
     }
     
     System.out.println("factorial of number :"+ fact);
}
    
}
