import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Task_1 {

    public static void main(String[] args) {
        // Заполнить список десятью случайными числами. 
        // Отсортировать список методом sort() и вывести его на экран.

        Random rand = new Random();

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(rand.nextInt(100));
        }
        System.out.println(intList);
        intList.sort(Comparator.naturalOrder()); // или так intList.sort(null);
        System.out.println(intList);

    }
}
