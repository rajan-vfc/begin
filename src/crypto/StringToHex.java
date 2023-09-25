package crypto;

import java.util.Scanner;

public class StringToHex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String : ");
        String input = sc.nextLine();

        String hexres="";

        for(int i=0;i<input.length();i++)
            hexres+=Integer.toHexString(input.charAt(i));


        System.out.println("The Hex Value is : "+hexres);
    }
}
