import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    public static void main(String[] args) {
        System.out.println(countWords(new String[]{"a", "b", "a", "c", "b"})); // {a=2, b=2, c=1}
        System.out.println(countWords(new String[]{"c", "b", "a"}));          // {a=1, b=1, c=1}
        System.out.println(countWords(new String[]{"c", "c", "c", "c"}));    // {c=4}
    }
}
