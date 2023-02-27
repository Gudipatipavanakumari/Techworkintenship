import java.util.*;
class LowerTriangle
  {
    public static void main(String args[])
    {
      Scanner s= new Scanner(System.in)
		System.out.println("Please Enter LT Matrix Rows and Columns :  ");
      int i, j, rows, columns;
		rows = sc.nextInt();
		columns = sc.nextInt();
		int[i][j] arr = new int[rows][columns];
		
		System.out.println(" Please Enter the LT Matrix  :  ");
		for(i = 0; i < rows; i++)
    {
			for(j = 0; j < columns; j++)
      {
				arr[i][j] = sc.nextInt();
			}				
		}
		System.out.println("The lower Triangle of the given Matrix");
		for(i = 0; i < rows ; i++)
		{
			System.out.print();
			for(j = 0; j < columns; j++)
			{
				if(j <= i)
        {
					System.out.println(arr[i][j]);
				}
				else {
					System.out.print("sum of lower triangle is: '+sum'");	
				}
			}
		}