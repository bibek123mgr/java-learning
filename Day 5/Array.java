
import java.util.Arrays;

class RecursionSum {
    public int rSum(int arr[], int n) {
        if (n == 0) {
            return arr[0];
        }
        return arr[n] + rSum(arr, n - 1);
    }
}

public class Array {
    static int arr[] = { 2, 3, 4, 5, 6, 7 };

    static int sum() {
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum; 
    }
    public static void main(String[] args) {
        System.out.println(sum());
        int numArr[] = { 3, 5, 2, 5, 8, 10 };
        int sumOfNum = Arrays.stream(numArr)
                // .filter(i -> i % 2 == 0)
                .sum();
        // Arrays.stream(numArr)
        //     .filter(i -> i % 2 == 0) 
        //     .forEach(i-> System.out.print(i));  
        System.out.println(sumOfNum);
        int n = numArr.length - 1;
        RecursionSum obj = new RecursionSum();
        System.out.println(obj.rSum(numArr, n));
    }
}
