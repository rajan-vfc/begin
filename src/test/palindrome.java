package test;
import java.util.Scanner;

public class palindrome {

    public static boolean pal(String str){
        boolean ans=false;
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
        }

        if(str.equals(rev)){

            ans=true;

        }


        return ans;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String : ");
        String str=sc.nextLine();

     boolean A=pal(str);
        System.out.println(A);



    }
}
