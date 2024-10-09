public class Largest {
    int findLargest(int arr[]) {
        int large = arr[0];
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] > large)
                large = arr[i];
        }
    return large;
    }
    
    public static void main(String[] args) {
        int array[] = { 1, 3, 5, 6, 7, 9, 10 };
        Largest max = new Largest();
        System.out.println(max.findLargest(array));
    
    }
}
