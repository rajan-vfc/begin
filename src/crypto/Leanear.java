package crypto;
import java.util.Scanner;

public class Leanear {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter x value : ");
        int x=sc.nextInt();

        System.out.println("enter m value : ");
        int m=sc.nextInt();

        System.out.println("enter a value : ");;
        int a =sc.nextInt();

        System.out.println("enter c value : ");
        int c=sc.nextInt();


        for (int i=0;i<10;i++){

            if(m>0 && m>a && m>c){

                int k=(a*x+c)%m;

                System.out.println(k);

               x=k;
            }
            else{
                System.out.println("enter valid value ^^ ");
            }
        }
    }



}
