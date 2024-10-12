
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {
    String reverseWords(String str) {
        List<String> words = new ArrayList<>();
        String[] parts = str.split("\\.");
        
        for (String word : parts) {
            if (!word.isEmpty()) {
                words.add(word);
            }
        }

        Collections.reverse(words);
        return String.join(" ", words);

    }
    public static void main(String[] args) {
        String str = "..geeks..for.geeks.";
        Reverse obj = new Reverse();
        System.out.println(obj.reverseWords(str));
    }
}
