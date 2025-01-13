import java.util.Scanner;

public class CheckPrimeExample {

    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        if (num == 2 || num == 3)
            return true;
        if (num % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    
    static void printPrime(int num) {
        for (int i = 0; i < num; i++) {
                if (isPrime(i)) 
                    System.out.print(i + "\t");        
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = sc.nextInt();
        // boolean bool = isPrime(number);
        // if(bool)
        //     System.out.println("prime number");
        // else
        // System.out.println("no prime");
        System.out.println("Prime number up to "+number);
        printPrime(number);
    }
}
