package crypto;

public class BinToHex {

    public static void main(String[] args) {

        int bin=Integer.parseInt("11100100",2);
        String hex=Integer.toHexString(bin);

        System.out.println("Hex value is : "+hex);



    }

}
