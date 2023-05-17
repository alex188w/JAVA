import java.util.Arrays;
import java.util.LinkedList;

public class Task_1 {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>(Arrays.asList(9, 3, 15, 35, 12));
        System.out.println("Исходный лист: " + lst.toString());
        System.out.println("Перевернутый лист: " + revers(lst));
        System.out.println("Исходный лист: " + lst.toString());
    }

    // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
    // вернет “перевернутый” список.
    public static LinkedList<Integer> revers(LinkedList<Integer> llist) {
        LinkedList<Integer> rlist = new LinkedList<>();
        int size = llist.size();
        for (int i = 0; i < size; i++) {
            rlist.add(llist.removeLast()); // .removeLast - возвращает и удаляет последний элемент списка
        }
        return rlist;
    }
}