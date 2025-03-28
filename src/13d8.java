import java.util.TreeSet;

public class TreeSetMerger {
    public static TreeSet<Integer> mergeTreeSets(TreeSet<Integer> setA, TreeSet<Integer> setB) {
        TreeSet<Integer> mergedSet = new TreeSet<>(setA);
        mergedSet.addAll(setB);
        return mergedSet;
    }

    public static void main(String[] args) {
        TreeSet<Integer> setA = new TreeSet<>(java.util.List.of(1, 2, 3));
        TreeSet<Integer> setB = new TreeSet<>(java.util.List.of(3, 4, 5));

        System.out.println(mergeTreeSets(setA, setB)); // Ожидаемый результат: [1, 2, 3, 4, 5]
    }
}
