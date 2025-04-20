public class swap {

    public static void main(String args[])
    {
        int a=10,b=30;
        //swapiing value without temp variable
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the swap of value is "+a);
        System.out.println("the swap of value is "+b);
    }
    
}
