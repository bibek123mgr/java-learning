
import java.util.Scanner;

public class ArmstrongExample {

    static boolean isArmstrong(int n) {
        int temp = n, sum = 0, rem;
        int numDigit = String.valueOf(temp).length();
        while (n > 0) {
            rem = n % 10;
            sum += Math.pow(rem, numDigit);
            n = n / 10;
        }
        return temp == sum;
    }
    
    public void displayArmstrong(int n) {
        for (int i = 1; i <= n; i++) {
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number up to armstrong to print:");
        int a = sc.nextInt();
        ArmstrongExample ar = new ArmstrongExample();
        ar.displayArmstrong(a);

    }
}
