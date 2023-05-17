import java.util.HashMap;
import java.util.Map;

public class Task_1 {
    // Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
    // что один человек может иметь несколько телефонов.
    public static void main(String[] args) {
        Map<Integer, String> bookFone = new HashMap<>();
        bookFone.put(99999, "Иванов И.И.");
        bookFone.put(88888, "Иванов И.И.");
        bookFone.put(77777, "Петров П.П.");
        bookFone.put(66666, "Сидоров С.С.");
        bookFone.put(55555, "Смирнов С.С");
        bookFone.put(44444, "Сидоров С.С.");

        String name = "Иванов И.И."; // выводим номера телефонов по фамилии
        // String name = "Сидоров С.С.";
        for (Map.Entry<Integer, String> entry : bookFone.entrySet()) {
            if (entry.getValue().equals(name))
                System.out.printf("[%s: %d]\n", entry.getValue(), entry.getKey());
        }
    }
}