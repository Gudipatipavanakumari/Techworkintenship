import java.utill.Scanner;
class twodimentionalarray
  {
    public static void main (String arg[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter size of matrix:");
      int m = sc.nextInt();
      int n = sc.nextInt();
      int friut[][] = new int [m][n];
      for( int i = 0;i<m;i++)
        {
          for(int j = 0;j <n;j++){
            friut [i][j]=sc.nextInt();
          }
        }
    }
  }