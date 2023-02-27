import java.util.Scanner;
class threenumbers
  {
    public static void main(String args[])
    {
      int a,b,c;
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter value for a,b,c:");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      if(a>b && a>c)
        System.out.println("a is maximum number");
      else if(b>a && b>c)
        System.out.println("b is maximum number");
      else
        System.out.println("c is maximum number");
    }
  }
 