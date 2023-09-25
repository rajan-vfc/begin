package crypto;

public class BlumBlum {
    public static void main(String[] args) {
        int x=5;
        int p=11;
        int q=7;
        int m=p*q;

            if(((p%4)==3)&&((q%4)==3)){
                for(int i=0;i<10;i++){
                    int k=(x*x)%m;
                    System.out.println(k);
                    x=k;
                }
            }
        }
    }

