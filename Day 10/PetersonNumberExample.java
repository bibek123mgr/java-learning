
import java.util.Scanner;

public class PetersonNumberExample {

    static int fatctorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
    
    static int checkPeterson(int n) {
        int num = 0;
        while (n > 0) {
            num += fatctorial(n % 10);
            n = n / 10;
        }
        return num;
    }
    
    void display(int n) {
        int temp = n;
        if (checkPeterson(n)==temp) {
            System.out.println("Peterson Number");
        }else{
            System.out.println("Not Peterson Number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = sc.nextInt();
        PetersonNumberExample ptr = new PetersonNumberExample();
        ptr.display(a);
    }
}
