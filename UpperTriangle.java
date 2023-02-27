import java.util.*;
class UpperTriangle
  {
    public static void main(String args[])
    {
      Scanner s= new Scanner(System.in);
      public static void main(String[] args)
        {
        int i, j, rows, columns;
		System.out.println("Please Enter UT Matrix Rows and Columns :  ");
		rows = sc.nextInt();
		columns = sc.nextInt();
		int[i][j] arr = new int[rows][columns];
		
		System.out.println(" Please Enter the UT Matrix  :  ");
		for(i = 0; i < rows; i++)
    {
			for(j = 0; j < columns; j++)
      {
				arr[i][j] = sc.nextInt();
			}				
		}
		System.out.println("The Upper Triangle of the given Matrix");
		for(i = 0; i < rows ; i++)
		{
			System.out.print();
			for(j = 0; j < columns; j++)
			{
				if(j >= i)
        {
					System.out.println(arr[i][j]);
				}
				else {
					System.out.print("sum of upper triangle is: '+sum'");	
				}
			}
		}