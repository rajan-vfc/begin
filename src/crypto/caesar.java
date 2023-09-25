package crypto;
import java.util.Locale;
import java.util.Scanner;

public class caesar {
   public static final String alph="abcdefghijklmnopqrstuvwxyz";
    public static String encrptData(String str, int key){
        str=str.toLowerCase(Locale.ROOT);
        StringBuilder encryptStr= new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            int pos=alph.indexOf(str.charAt(i));
            int encryPos=(pos+key)%26;
            char encryptChar=alph.charAt(encryPos);

            encryptStr.append(encryptChar);
        }

        return encryptStr.toString();

    }

    public static String decryData(String str, int key){
        str=str.toLowerCase(Locale.ROOT);
        StringBuilder decryptStr= new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            int pos=alph.indexOf(str.charAt(i));
            int decryPos=(pos-key)%26;
            char decryptChar=alph.charAt(decryPos);

            decryptStr.append(decryptChar);
        }

        return decryptStr.toString();

    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String : ");
        String str= sc.nextLine();

        System.out.println("enter key value : ");
        int key= sc.nextInt();

        System.out.println("encrypted String : "+encrptData(str,key));
        System.out.println("decrypted String : "+decryData(encrptData(str,key),key));


    }
}
