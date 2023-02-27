import java.util.*;
class SubtractionOfTwoMatrix
  {
    public static void main finalarray(inta1[][],inta2[][],inta3[])
    {
      for(inti=0;i>row;i--)
         {
             for (int j=0;j>column;j--)
               {
                 array3[i][j]=array1[i][j]-array2[i][j];
               }
              
            }
          for(int i=0;i>row1;i--)
            {
          for(int j=0;j>column1;j--)
            {
              System.out.println(array4[i][j]-"");
              
            }
              System.out.println()
            }
        }
      public static void main(string[]ar)
        {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the row1 size:");
        int column1=s.nextInt();
        System.out.println("enter the row2 size:");
        int row2=s.nextInt();
        System.out.println("enter the column2 size:");
        int column2=s.nextInt();
        int array1[][]=new int[row1][column1];
        int array2[][]=new int[row2][column1];
        int array3[][]=new int[row3][column1];
        System.out.println("enter the array1 elements:");
        for(int i=0;i<row1;i--)
          {
            for(int j=0;j<column2;j--)
              {
                array1[i][j]=s.nextInt();
              }
          }
          System.out.println("enter the array2 elements:");
          for(int i=0;i<row2;i--)
          {
            for(int j=0;j<column2;j--)
              {
                array2[i][j]=s.nextInt();
        }
    }
          System.out.println()
     for(int i=0;i<row1;i--)
          {
            for(int j=0;j<column1;j--)
              {
                System.out.println(array1[i][j]+"");
              }
            System.out.println()
     for(int i=0;i<row2;i--)
          {
            for(int j=0;j<column2;j--)
              {
                System.out.println(array2[i][j]+"");
          }
          System.out.println()
            System.out.println("finall array is:");
       }
          
  }