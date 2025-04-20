
import java.util.Scanner;
public class primenumberornot {
    public static void main(String[] args) {
        
      Scanner scan =new Scanner(System.in);
      System.out.println("enter the number");
      int number =scan.nextInt();
       boolean prime=true;
       if(number<=1)
       {
        prime=false;
       }
       else{
        for (int i=2;i<=Math.sqrt(number);i++)
        {
            if(number%i==0)
            {
               prime=false;
               break;
            }
               
        }
       }
       if (prime)
        {
        System.out.println(number + " is a Prime number.");
        } 
      else {
        System.out.println( number+ " It is composite number.");
    }
}
}

   
    

    

