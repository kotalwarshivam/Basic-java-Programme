
import java.util.Scanner;
public class sumofdigit {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the digit");
        int number=scan.nextInt();
        int sum=0;

        while(number!=0)
        {
          int digit=number%10;
           sum+=digit;//we are adding in sum variable each digit 
           number =number/10;
        }
        System.out.println(""+sum);// printing sum user entered digit
}
}
