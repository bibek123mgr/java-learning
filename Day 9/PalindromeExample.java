import java.util.Scanner;

class PalindromeExample {

    static void isPalin(int n) {
        int rev = 0, rem, temp = n;
        while (n > 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        if (temp == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
    
    private static boolean checkPalin(String string) {
        String reversed = new StringBuilder(string).reverse().toString();
        return string.equals(reversed);
    }

    private static boolean isPalindrome(String str) {
        char[] data = str.toCharArray();
        int i = 0;
        int j = data.length - 1;

        while (j > i) {
            if (data[i] != data[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPalin(n);
        System.out.println(checkPalin(String.valueOf(n).toLowerCase()));       
        
    }
}