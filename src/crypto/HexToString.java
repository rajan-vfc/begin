package crypto;

import java.util.Scanner;

public class HexToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Hex Value : ");
        String hexVal =sc.nextLine();

        char[] resAr=hexVal.toCharArray();

        StringBuilder res= new StringBuilder();

        for(int i=0;i<resAr.length;i+=2){

            String str= ""+resAr[i]+""+resAr[i+1];
            char ch=(char)Integer.parseInt(str,16);

            res.append(ch);

        }

        System.out.println("the String is : "+res);


    }
}
