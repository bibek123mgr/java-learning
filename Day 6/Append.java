public class Append {
    void insert(String str1, String str2, int k) {
        StringBuffer str = new StringBuffer(str1);
        try {
            if (k > str1.length()) {
                throw new StringIndexOutOfBoundsException();
            }
            str.insert(k, str2); 
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Insertion index is out of bounds.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        
        System.out.println(str);
    }

    public static void main(String[] args) {
        String s = "geeks for ";
        String ch = " geeks";
        int k = 20;

        Append obj = new Append();
        obj.insert(s, ch, k);
    }
}
