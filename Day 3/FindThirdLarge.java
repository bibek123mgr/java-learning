
import java.util.Arrays;

public class FindThirdLarge {
    public static void main(String[] args) {
        int array[] = { 2, 1, 4, 8, 10, 30, 50, 100, 20, 5 };
        int k = 3;
        Arrays.sort(array);
        System.out.println("the third largest number is ="+ array[array.length-k]);
    }
}
