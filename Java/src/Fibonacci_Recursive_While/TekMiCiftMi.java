package Fibonacci_Recursive_While;

import java.util.Scanner;

public class TekMiCiftMi {

	public static void main(String[] args) {
        //creating Scanner class object
        Scanner scan=new Scanner(System.in);
        System.out.print("Numara giriniz : ");
        //reading value from the user
        int num=scan.nextInt();
        //method calling
        TekOr«ift(num);
    }

    //user defined method
    public static void TekOr«ift(int num)
    {
        //method body
        if(num%2==0)
            System.out.println(num+" Áift ");
        else
            System.out.println(num+" tek ");
    }
}
