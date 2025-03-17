import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {
        // Створення списку чисел
        List<Integer> numbers = Arrays.asList(3, 14, 15, 92, 6);
        System.out.println("Список чисел: " + numbers);
        
        // Створення списку рядків (ПІБ)
        List<String> fullName = Arrays.asList("Еткало", "Сергій", "Ігорович");
        System.out.println("Список рядків (ПІБ): " + fullName);
        
        // Створення сету та перевірка унікальності елементів
        Set<Integer> uniqueNumbers = new HashSet<>(Arrays.asList(1, 2, 3, 3, 4, 5, 5));
        System.out.println("Сет унікальних чисел: " + uniqueNumbers);
        
        // Створення мапи з містами України та їх телефонними кодами
        Map<String, String> cityCodes = new HashMap<>();
        cityCodes.put("Київ", "044");
        cityCodes.put("Харків", "057");
        cityCodes.put("Львів", "032");
        cityCodes.put("Одеса", "048");
        cityCodes.put("Дніпро", "056");
        
        System.out.println("Телефонні коди міст України: " + cityCodes);
    }
}
