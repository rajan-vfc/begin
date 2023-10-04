package HashFunctions;
public class TwoSimple {
    public static void main(String[] args) {

        int[] a ={1,1,0,0,1,0,1,1};
        int[] b ={1,1,0,0,1,0,1,1};
        int[] c ={1,1,0,0,1,0,1,1};
        int[] d ={1,1,0,0,1,1,1,1};
        int[] e ={1,1,0,0,1,0,1,1};
        int[] f ={1,0,0,0,1,0,1,1};
        int[] g ={1,1,0,0,1,0,1,1};
        int[] h ={1,1,0,0,0,0,1,1};

        int[] s =new int[8];
        for (int i=0;i<a.length;i++){
            s[i]=a[i]^b[i]^c[i]^d[i]^e[i]^f[i]^g[i]^h[i];
            System.out.print(s[i]+" ");
        }
        System.out.println();
        for(int i=s.length-1;i>0;i--){
            s[i]=s[i-1];
        }
        s[0]=s[s.length-1];

        for (int i : s) {
            System.out.print(i + " ");
        }
    }
}
