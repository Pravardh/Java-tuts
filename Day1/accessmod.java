import java.io.*;
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        AccessModifiers ac = new AccessModifiers();
    }
}

class AccessModifiers
{
   public int pub(int a,int b)
   {
        return a+b;
   }
   private int priv(int a,int b)
   {
        return a+b;
   }
   protected int prot(int a,int b)
   {
        return a+b;
   }
}



