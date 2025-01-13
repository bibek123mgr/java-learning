
import java.util.Scanner;


public class FibExample {
    static int n1=0,n2=1,n3=0;

    public static void printFib(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFib(count - 1);

        }
    }

    public static int fibonacci(int count) {
        if (count == 0)
            return 0;
        if (count == 1)
            return 1;
        return fibonacci(count - 1) + fibonacci(count - 2);
    }

    public static void printFib1(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of fib to print:");
        int number = sc.nextInt();
        // System.out.print(n1 + " " + n2);
        // printFib(number - 2);

        System.out.println("Fibonacci sequence:");
        printFib1(number);
        sc.close();

    }
}
