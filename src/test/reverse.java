package test;
import java.util.Scanner;

public class reverse{
    public static int revNum(int num) {
        int rev=0;

        while (num != 0) {

            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter num to n reverse :");
        int num=sc.nextInt();

        System.out.println("reversed number : "+revNum(num));
    }
}