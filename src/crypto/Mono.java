package crypto;

import java.util.Locale;
import java.util.Scanner;

public class Mono {
    public static final String normalChar="abcdefghijklmnopqrstuvwxyz";

    public static final String codedChar="mnbvcxzlkjhgfdsapoiuytrewq";

    public static  String encryptData(String str){
        str=str.toLowerCase(Locale.ROOT);
        String encryptStr="";

        for (int i=0;i<str.length();i++){
            for(int j=0;j<26;j++){
                if(str.charAt(i)==normalChar.charAt(j)){
                    encryptStr+=codedChar.charAt(j);
                }
                if(str.charAt(i)<'a'||str.charAt(i)>'z'){
                    encryptStr+=str.charAt(i);
                }
            }
        }
        return encryptStr;
    }

    public static  String decryptData(String str){
        str=str.toLowerCase(Locale.ROOT);
        String decryptStr="";

        for (int i=0;i<str.length();i++){
            for(int j=0;j<26;j++){
                if(str.charAt(i)==codedChar.charAt(j)){
                    decryptStr+=normalChar.charAt(j);
                }
                if(str.charAt(i)<'a'||str.charAt(i)>'z'){
                    decryptStr+=str.charAt(i);
                }
            }
        }
        return decryptStr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String : ");
        String str=sc.nextLine();
        System.out.println("encrypted String : "+encryptData(str));
        System.out.println("decypted String : "+decryptData(encryptData(str)));
    }
}


