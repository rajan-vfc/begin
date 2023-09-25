package Interview;
import java.util.Scanner;

public class StrPal {
    public static void pal(String str){
        String word="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            word+=ch;

        }
        System.out.println(word);
        if(str.equals(word)){
            System.out.println("Given String is Palindrome ");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
       String str = sc.nextLine();

       pal(str);

    }
}
