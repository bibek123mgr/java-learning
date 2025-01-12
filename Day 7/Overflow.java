public class Overflow {
    public static void main(String[] args) {
        int a = 30;
        byte b = (byte) a;
        //range of byte -127 t0 127 ,2^8


        int c = 130;
        byte d = (byte)c;
        System.out.println(b);
        System.out.println(d);

    }
}
