import java.util.Scanner;
import java.util.Arrays;
class uniqueElement 
{
 public static void main(String[] args) 
  {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size of the array:");
      int size = sc.nextInt();
      int[] array= new int[size];
      System.out.println("Enter the elements of the array:");
  
      for(int i=0; i<array.length; i++)
      {
         array[i] = sc.nextInt();
      }
    Arrays.sc(array);     
    for (int i=0;i<array.length;i++)
    System.out.println(array[i]);
    int i=0;
    System.out.println("Unique Elements in array:");
    while(i<array.length)
    {
        if(array[i]!=array[i+1])
        {
            System.out.println(array[i]);
        }
        i=i+2;
    }
}
}