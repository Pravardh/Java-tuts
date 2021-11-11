import java.io.*;
import java.util.*;

class main
{

     public static void main(String[] args)
     {
          narrowingCast();
          wideningCast();
     }
     public static void narrowingCast()
     {
          double pi = 3.14;
          int a = (int) pi;

          System.out.println(pi);
          System.out.println(a);
     }
     public static void wideningCast()
     {
          byte first = 2;
          int second = first;
          
          System.out.println(second);
     }
}



