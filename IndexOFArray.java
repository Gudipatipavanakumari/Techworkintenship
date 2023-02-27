import java.Scanner;
class IndexOfArray
  {
    public static void main(String args[])
    {
      String [] colours =  {"Red","Black,"Blue"};
      int index=0;
      for(int i=0;i<colours.length;i++)
      {
        if(colours[i]=="Blue")
        {
          index=1;
        }
      }
      System.out.println("Index="+index);

    }
  }   