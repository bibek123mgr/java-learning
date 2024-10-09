

import java.util.*;

public class FindMax {

    int findLargeByJavaMethod(int arr[]) {
        int max = Arrays.stream(arr).max().getAsInt();
        return max;
    }

    void findMaxNum(int arr[]) {
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
    
    void maxByList(int arr[]) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        System.out.println(Collections.max(list));
    }
    public static void main(String[] args) {
        int array[] = { 1, 3, 5, 6, 7, 9, 10 };
        System.out.println(Arrays.toString(array));
        FindMax obj = new FindMax();
        obj.findMaxNum(array);
        System.out.println(Arrays.toString(array));
        obj.maxByList(array);
        System.out.println(obj.findLargeByJavaMethod(array));

    }
}
