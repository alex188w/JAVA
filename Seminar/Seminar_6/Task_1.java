import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Task_1 {
    // 1. Напишите метод, который заполнит массив из 1000 элементов случайными
    // числами от 0 до 24.
    // 1.5. Создайте метод, в который передайте заполненный выше массив, и с помощью
    // Set вычислите процент уникальных значений в данном массиве, и верните его в
    // виде числа с плавающей запятой.
    // Для вычисления процента используйте формулу:
    // процент уникальных чисел = количество уникальных чисел * 100 / общее
    // количество чисел в массиве.

    public static void main(String[] args) {
        System.out.println("Процент уникальных значений: " + percentOfUnique(fillArray(1000)));
        System.out.println(fillArray(1000));
        }
    
        public static List<Integer> fillArray (int count) {
            ArrayList<Integer> result = new ArrayList<>();
            Random rnd = new Random();
            for (int i = 0; i < count; i++) {
                result.add(rnd.nextInt(1, 24));
            }
            return result;
        }
    
        public static double percentOfUnique (List<Integer> list) {
            Set<Integer> integerSet = new HashSet<>(list);
            return integerSet.size() * 100.0 / list.size();
        }    
}
