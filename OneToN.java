import java.util.Scanner;

class oneton
{
	public static void main(String[] args)
	{
		int i =1;
		Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the value n : ");
		int n = Sc.nextInt();
    System.out.println("Numbers are : ");

		while(i<=n)
		{
			System.out.println(i);
			i++;
		}
	}
}