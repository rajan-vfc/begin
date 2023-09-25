package test;
import java.util.Scanner;

public class vowels {
    public static int find(String str){
        int count=0;

        for(int i=0;i<str.length();i++){


            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){


              count++;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter String : ");
        String str=sc.nextLine();


        System.out.println("vowels are : "+find(str));
    }
}
