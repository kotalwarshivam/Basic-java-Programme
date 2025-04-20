import java .util.Scanner;
public class monthnumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a month number");
        int number=scan.nextInt();


        if (number<=0)
        {
           System.out.println("enter a valid month number");
        }
         switch(number)
         {
            case 1:
            System.out.println("jan");
            break;

            case 2:
            System.out.println("feb");
            break;

            case 3:
            System.out.println("march");
            break;

            case 4:
            System.out.println("april");
            break;

            case 5:
            System.out.println("may");
            break;

            case 6:
            System.out.println("june");
            break;

            case 7 :
            System.out.println("jully");
            break;

            case 8 :
            System.out.println("august");
            break;

            case 9 :
            System.out.println("sep");
            break;

            case 10 :
            System.out.println("october");
            break;

            case 11 :
            System.out.println("November");
            break;

            case 12 :
            System.out.println("december");
            break;

            default:
            


         }
        



    }
    
}
