package crypto;

public class BinToHex {

    public static void main(String[] args) {

        int bin=Integer.parseInt("111001001110",2);
        String hex=Integer.toHexString(bin);

        System.out.println("Hex value is : "+hex);
    }

}
