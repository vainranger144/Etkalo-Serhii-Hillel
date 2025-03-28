import java.util.*;

public class StringUtil {
    public static String buildResultString(String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();
        Set<String> resultSet = new LinkedHashSet<>();
        
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            if (wordCount.get(word) % 2 == 0) {
                resultSet.add(word);
            }
        }
        
        return String.join("", resultSet);
    }
    
    public static void main(String[] args) {
        System.out.println(buildResultString(new String[]{"a", "b", "a"})); // "a"
        System.out.println(buildResultString(new String[]{"a", "b", "a", "c", "a", "d", "a"})); // "a"
        System.out.println(buildResultString(new String[]{"a", "", "a"})); // "a"
    }
}
