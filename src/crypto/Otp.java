package crypto;

import java.util.Scanner;

public class Otp {

    public static final String alph="abcdefghijklmnopqrstuvwxyz";
    public static String encryData(String plaintxt,String key){
        int t1=0;
        int t2=0;
        int ch;

        StringBuilder encryStr= new StringBuilder();

        for (int i=0;i<plaintxt.length();i++){
            ch=alph.indexOf(plaintxt.charAt(t1)) + alph.indexOf(key.charAt(t2));
            ch=ch%26;
            t1++;
            t2++;
            char en=alph.charAt(ch);
            encryStr.append(en);


            if (t1==plaintxt.length()){
               t1=0;
           }

           if (t2==key.length()){
               t2=0;
           }


        }
        return encryStr.toString();
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter plain text : ");
        String plaintxt=sc.nextLine();

        System.out.print("enter Key : ");
        String key=sc.nextLine();

        System.out.println("encrypted String : "+encryData(plaintxt,key));

    }
}