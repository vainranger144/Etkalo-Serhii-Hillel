import java.util.HashMap;
import java.util.Map;

public class StringLengthMap {
    public static Map<String, Integer> getLengthOfStrings(String[] strings) {
        Map<String, Integer> result = new HashMap<>();
        for (String str : strings) {
            result.put(str, str.length());
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getLengthOfStrings(new String[]{"a", "bb", "a", "bb"}));
        System.out.println(getLengthOfStrings(new String[]{"this", "and", "that", "and"}));
        System.out.println(getLengthOfStrings(new String[]{"code", "code", "code", "bug"}));
    }
}
