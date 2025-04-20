public class smallestelementfind {
    public static void main(String[] args) 
    {
       
        int [] array={100,200,300,400,500};
         int smallest=array[0];

         for (int i=0; i<array.length;i++)
         {
            if(array[i]<smallest)
            {
                smallest=array[i];
            }
         }
             System.out.println("the smallest array element:"+smallest);

     
    
}
}
