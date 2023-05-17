import java.util.ArrayList;
import java.util.LinkedList;

// Измерение времени работы программы
public class Time_measure {
    public static void main(String[] args) {
        long start = System.nanoTime(); // 0.000 000 001
        int repeat = 10_000_000;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < repeat; i++)
            arrayList.add(i);

        long middle = System.nanoTime();

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < repeat; i++)
            linkedList.add(i);

        long end = System.nanoTime();

        System.out.printf("ArrayList: %f, LinkedList: %f", 
        (middle - start) / 1e+6, (end - middle) / 1e+6);
    }

}