import java.util.LinkedHashSet;

public class SetIntersectionChecker {
    public static boolean hasIntersection(LinkedHashSet<Integer> setA, LinkedHashSet<Integer> setB) {
        for (Integer num : setA) {
            if (setB.contains(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        LinkedHashSet<Integer> setA = new LinkedHashSet<>(java.util.List.of(1, 2, 3, 4));
        LinkedHashSet<Integer> setB = new LinkedHashSet<>(java.util.List.of(3, 5, 6));

        System.out.println(hasIntersection(setA, setB)); // Ожидаемый результат: true
    }
}
