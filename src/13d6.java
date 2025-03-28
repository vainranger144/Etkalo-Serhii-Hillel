import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostFrequentElement {
    public static int findMostFrequent(List<Integer> numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxCount = 0;
        int mostFrequent = numbers.get(0);

        for (int num : numbers) {
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, count);

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = num;
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 1, 2, 2, 1, 2, 3, 3, 3);
        System.out.println(findMostFrequent(numbers)); // Ожидаемый результат: 3
    }
}
