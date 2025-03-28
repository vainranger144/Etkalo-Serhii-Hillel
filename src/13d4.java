import java.util.HashMap;
import java.util.Map;

public class StringMapCreator {
    public static Map<String, String> createMap(String[] strings) {
        Map<String, String> resultMap = new HashMap<>();
        
        for (String str : strings) {
            if (!str.isEmpty()) {
                String key = String.valueOf(str.charAt(0));
                String value = String.valueOf(str.charAt(str.length() - 1));
                resultMap.put(key, value);
            }
        }
        
        return resultMap;
    }

    public static Map<String, String> mergeStringsByFirstChar(String[] strings) {
        Map<String, String> resultMap = new HashMap<>();
        
        for (String str : strings) {
            if (!str.isEmpty()) {
                String key = String.valueOf(str.charAt(0));
                resultMap.put(key, resultMap.getOrDefault(key, "") + str);
            }
        }
        
        return resultMap;
    }

    public static void main(String[] args) {
        System.out.println(createMap(new String[]{"code", "bug"})); // {c=e, b=g}
        System.out.println(createMap(new String[]{"man", "moon", "main"})); // {m=n}
        System.out.println(createMap(new String[]{"man", "moon", "good", "night"})); // {m=n, g=d, n=t}
        
        System.out.println(mergeStringsByFirstChar(new String[]{"salt", "tea", "soda", "toast"})); // {s=saltsoda, t=teatoast}
        System.out.println(mergeStringsByFirstChar(new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"})); // {a=aaaAA, b=bb, c=cccCC, d=d}
        System.out.println(mergeStringsByFirstChar(new String[]{})); // {}
    }
}
