package test;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        int n=sc.nextInt();


        int bin= Integer.parseInt(Integer.toBinaryString(n));

        System.out.println(bin);

        int res=bin%10;

        if(res==1)
            System.out.println("Odd number");
        else
            System.out.println("Even number ");




    }


}
