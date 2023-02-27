import java.util.*;
class CopyElement
  {
    public static void main(String args[])
    {
      int [] oldarray={1,2,3,4,5};
      int [] newarray=new int[oldarray.length];
      for(int i=0;i<oldarray.length;i++)
        {
          newarray[i]=oldarray[i];
        }
      for(int i=0;i<oldarray.length;i++)
        {
          System.out.println(newarray[i]);
        }
    }
  }