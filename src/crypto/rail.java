package crypto;
import java.util.Scanner;
public class rail {
    public static void  kutty(String str,int key){
        int pos=0,rpos=0;
        String[][] a =new String [key][str.length()];
        for(int i=0;i<str.length();i++){
            for(int j=0;j<2;j++){
                if(i%2==0) {
                    a[rpos][pos] = String.valueOf(str.charAt(pos));
                    pos++;
                    rpos++;
                    if (rpos == key) {
                        rpos--;
                        break;
                    }
                    if (pos == str.length()) {
                        break;
                    }

                }
                else{
                    rpos--;
                    a[rpos][pos]=String.valueOf(str.charAt(pos));
                    pos++;
                    if (rpos==0){
                        rpos=1;
                        break;
                    }
                    if(pos==str.length()){
                        break;
                    }
                }
            }
            if(pos==str.length()){
                break;
            }

        }
        for(int i=0;i<key;i++){
            for(int j=0;j< str.length();j++){
                if(a[i][j]!=null){
                    System.out.println(a[i][j]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter String : ");
        String pt=sc.nextLine();

        System.out.print("enter key value : ");
        int k=sc.nextInt();

        kutty(pt,k);

    }
}
