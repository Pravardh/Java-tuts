import java.io.*;
import java.util.*;

class Main
{
    public static void main(String[] args)
    {
          Types type1 = new Types();
          Types type2 = new Types();

    }
}

class Types
{
     //Instance Variables
     int a = 3;
     int b = 4;

     //Static variables
     static int stat_a = 1000;
     static int stat_b = -100; 

     //Local variables
     int sumFunction()
     {
          int loc_a = 20;
          int loc_b = 30;
          return loc_a+loc_b;
     }
}



