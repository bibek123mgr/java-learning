public class AutomorphicNumberExample1 {
//if last didits and number are same eg :12 and 1212 
    static boolean isAutomorphicNumber(int num) {
        int square = num * num;
        while (num > 0) {
            if (num % 10 != square % 10) {
                return false;
            }
            num = num / 10;
            square = square / 10;

        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAutomorphicNumber(76) ? "Automorphic" : "Not Automorphic");   

    }
}
