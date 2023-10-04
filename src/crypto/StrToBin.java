package crypto;

import java.util.Scanner;

public class StrToBin {

    public static void str(String s){
        int n=s.length();
       String bin="";

        for (int i=0;i<n;i++){
            int val=Integer.valueOf(s.charAt(i));

            while (val>0){
                if(val%2==1) {
                    bin += '1';
                }
                else
                    bin+='0';

                val/=2;
            }
            bin=rev(bin);
            System.out.print(bin+" ");
        }


    }

    public static String rev(String input){
        char[] a = input.toCharArray();
        int l, r = 0;
        r = a.length - 1;

        for (l = 0; l < r; l++, r--)
        {
            // Swap values of l and r
            char temp = a[l];
            a[l] = a[r];
            a[r] = temp;
        }
        return String.valueOf(a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String s= sc.nextLine();

        str(s);


    }
}
