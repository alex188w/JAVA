import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task_2 {

    public static void main(String[] args) {
        // Заполнить список названиями планет Солнечной системы в произвольном порядке с
        // повторениями. Вывести название каждой планеты и количество его повторений в списке
        List<String> planets = Arrays.asList("Марс", "Меркурий", "Марс", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Земля",
                "Меркурий", "Уран", "Нептун");
        Map<String, Integer> frequency = planets.stream()
                // собираем элементы листа в карту
            .collect(Collectors.toMap(
                // ключ - строка
                e -> e,
                // значение - число,
                // количество вхождений
                e -> 1,
                // суммируем количество вхождений
                Integer::sum));
        // Обходим карту и выводим содержимое
        frequency.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}