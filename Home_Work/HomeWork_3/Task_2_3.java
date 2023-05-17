import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task_2_3 {
    public static void main(String[] args) {
        Random rand = new Random();

        List<Integer> array1 = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            array1.add(rand.nextInt(100));
        }
        deleteNumbers(array1);
        averageNumbers(array1);
    }

    // Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
    public static void deleteNumbers(List<Integer> list) {
        System.out.println("Исходный список : " + list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println("Список после удаления четных чисел: " + list);
    }

    // Задан целочисленный список ArrayList. Найти минимальное, максимальное и
    // среднее арифметичское этого списка.
    public static void averageNumbers(List<Integer> list) {
        double sum = 0;
        for (int x : list) {
            sum += x;
        }
        System.out.println("Среднее арифметическое чисел списка равно: " + sum / list.size());
        System.out.println("Максимальное число списка равно: " + Collections.max(list));
        System.out.println("Минимальное число списка равно: " + Collections.min(list));
    }
}
