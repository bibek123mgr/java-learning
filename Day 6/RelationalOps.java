class RelationalOps {
    public static void compareStrings(String s1, String s2) {
        // comparing both using inbuilt function
        int x = s1.compareTo(s2);
        if (x != 0) {
            System.out.println(s1 + " is not equal to " + s2);
            if (x > 0) {
                System.out.println(s1 + " is greater than " + s2);
            } else {
                System.out.println(s2 + " is greater than " + s1);
            }
        } else {
            System.out.println(s1 + " is equal to " + s2);
        }
    }

    public static void main(String[] args) {
        compareStrings("geeks", "forGeeks");
        compareStrings("forGeeks", "geeks");
    }
}
