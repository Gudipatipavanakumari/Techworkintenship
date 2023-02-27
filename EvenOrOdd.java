import java.util.*;
class EvenOrOdd
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n;
System.out.print("Enter the Number ");
n = sc.nextInt();
if (n % 2 ==0)
System.out.print(n + " Number is Even ");
else
System.out.print(n + "Number is odd");
}
}