
import java.util.Scanner;

public class InuputHandeling {
    public static void main(String[] args) {
        System.out.println("Enter the number");

        //return ascii value
        // int n = System.in.read();
        // System.out.println(n);


        //how take input in old days
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);

        // bf.close();

        //take input using 
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        System.out.println(num2);

    }
}
