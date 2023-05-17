import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class Task_0 {
    // Создайте HashSet, заполните его следующими числами: {6, 5, 3, 2, 4, 1, 2, 3}.
    // Распечатайте содержимое данного множества.
    // 2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4,
    // 5, 6, 3}. Распечатайте содержимое данного множества.
    // 3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6,
    // 3}. Распечатайте содержимое данного множества.

    public static void main(String[] args) {
        System.out.println(new HashSet<Integer>(List.of(6, 5, 3, 2, 4, 1, 2, 3)));

        System.out.println(new TreeSet<Integer>(List.of(6, 5, 3, 2, 4, 1, 2, 3)));

        System.out.println(new LinkedHashSet<Integer>(List.of(6, 5, 3, 2, 4, 1, 2, 3)));
    }

}