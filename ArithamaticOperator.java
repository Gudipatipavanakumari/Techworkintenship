import java.util.*;
class ArithmaticOperator
  {
    public static void main(String a [])
    {
      Scanner s= new Scanner(System.in);
      System.out.println("Enter any two numbers to perform arithimetic operation");
      int num1 = s.nextInt();
      int num2 = s.nextInt();
      System.out.println(addition(num1,num2));
      System.out.println(subtraction());
      multiplication(num1,num2);
      division();
    }
    static int addition(int num1,int num2)
    {
      return num1+num2;
      
    }
    static int subtraction()
    {
      int a=20;
      int b=10;
      return a-b;
    }
    static void multiplication (int num1,int num2)
    {
      int c = num1*num2;
    }
    System.out.println(c);
  }
static void division()
  {
  double d=10.0;
  double e=5.0;
  double f=d/e;
  System.out.println(f);
  }
}
