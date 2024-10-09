class Sum {
    int add(int arr[]) {
        int total = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }
}

public class ArraySum {
    public static void main(String[] args) {
        int array[] = { 2, 3, 4, 5, 6 };
        Sum sum = new Sum();
        System.out.println(sum.add(array));
    }
}
