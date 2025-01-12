public class AddingLowerType {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 10;
        //byte c = a + b; error

        byte c = (byte) (a + b);
        System.out.println(c);

    }
}
