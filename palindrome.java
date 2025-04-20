
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter the palindrome number");
        int number=scan.nextInt();
        int original_number=number; // store original number for show to the user
        int reverse=0;
      
      while(number!=0)
        {
            int digit =number %10; // it get an reminder
            reverse=reverse *10 + digit;// store reverse number
            number =number/10;        //removing floating using int datatype;
        }
     if (original_number==reverse)
    {

    System.out.println("this number is palindrome:"+reverse);
     }
    else
    {
    System.out.println("this is not palindrome:"+original_number);
    }      
            }
        }
