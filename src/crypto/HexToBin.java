package crypto;
public class HexToBin {
    public static void main(String[] args) {
        int hex=Integer.parseInt("7261",16);

        String Binary=Integer.toBinaryString(hex);

        System.out.println("Binary value is : "+Binary);
    }
}
