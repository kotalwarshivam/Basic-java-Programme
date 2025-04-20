import java.util.Scanner;

public class checkleapyear{
    public static void main(String args[])
    {
      Scanner sc =new Scanner(System.in);
        System.out.println("enter a year");
        int year= sc.nextInt();
       
       // year is completlly divisible by 4 and 100 or 400 then it is leap year 
        if ((year %4==0 && year %100==0 )||(year %400==0))
        {
          System.out.println("This is leap year");
        }
        else{
            System.out.println(" This is not leap year");
        }
        System.out.println("Thank you");

    }

}
