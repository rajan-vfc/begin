package crypto;
import java.util.Scanner;

public class hill{
    public static final String alph="abcdefghijklmnopqrstuvwxyz";

    public static  String hillChipher(String plainTxt,String key){
        int[][] k =new int[plainTxt.length()][plainTxt.length()];
        int p=0;

        for(int i=0;i<plainTxt.length();i++){
            for(int j=0;j<i;j++){
                k[i][j]=alph.indexOf(key.charAt(p));
                p++;
            }
        }
        int[][] pt =new int[plainTxt.length()][1];
        for (int i=0;i<plainTxt.length();i++){
            pt[i][0]=alph.indexOf(plainTxt.charAt(i));
        }
        int[][] c =new int[plainTxt.length()][1];
        for (int i=0;i<plainTxt.length();i++){
            for(int j=0;j<1;j++){

                c[i][j]=0;

           for(int x=0;x<plainTxt.length();x++){
               c[i][j]+=k[i][x]*pt[x][j];
           }
           c[i][j]=c[i][j]%26;
            }
        }
        StringBuilder y= new StringBuilder();
        for(int i=0;i<plainTxt.length();i++){
            char encry=alph.charAt(c[i][0]);

            y.append(encry);

        }

        return y.toString();


    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter String to encrypt :");
        String plainTxt=sc.nextLine();

        System.out.println("enter key : ");
        String key=sc.nextLine();

        System.out.println("encrypted string : "+hillChipher(plainTxt,key));
    }
}