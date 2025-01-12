public class Narrowing {
    public static void main(String[] args) {
        float a = 10.4f;
        // int b=a complie time error
        // Explicitly downcasting
        int b = (int) a;

        // Printing the values
        System.out.println("Float value: " + a);
        System.out.println("Integer value: " + b);
    }
}
