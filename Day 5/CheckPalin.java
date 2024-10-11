public class CheckPalin {
    public boolean isPalin() {
        String str = "aabbaa";
        String rev = "";
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }

    public boolean isValidPalin() {
        String str = "aabbaa";
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;

    }
    public static void main(String[] args) {
        CheckPalin obj = new CheckPalin();
        System.out.println(obj.isValidPalin());
        System.out.println(obj.isPalin());
    }
}
