import java.io.*;
import java.util.*;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        int sum = 0;
        int product = 1;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n != 0)
        {
            int lastDigit = n%10;
            sum += lastDigit;
            product *= lastDigit;
            n = n/10;
            System.out.println(n);
        }
        if(sum == product)
        {
            System.out.println("This is a spy number");
        }
        else
        {
            System.out.println("This is not a spy number");
        }
        input.close();
    }   
}


