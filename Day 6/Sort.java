
import java.util.Arrays;

class Sort {

    void asc(String str) {

        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        System.out.println(String.valueOf(ch));
    }
    public static void main(String[] args) {
        Sort obj = new Sort();
        String str = "bibekmagar";
        obj.asc(str);
    }
}
