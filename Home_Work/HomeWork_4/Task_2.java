import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Task_2 {

    // Реализуйте очередь с помощью LinkedList со следующими методами:
    // enqueue() - помещает элемент в конец очереди,
    // dequeue() - возвращает первый элемент из очереди и удаляет его,
    // first() - возвращает первый элемент из очереди, не удаляя
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>(Arrays.asList(9, 3, 15, 35, 12));
        System.out.println("Исходный LinkedList: " + lst.toString());

        Queue<Integer> cQ = new LinkedList<Integer>(lst);
        System.out.println("Коллекция Queue имеет вид: " + cQ);

        System.out.println("Добавляем новый элемент '55' в конец коллекции: ");
        enqueue(cQ, 55);
        System.out.println("Коллекция Queue имеет вид: " + cQ);

        System.out.println("Первый элемент коллекции: " + dequeue(cQ) + ", удаляем его");
        System.out.println("Коллекция Queue имеет вид: " + cQ);

        System.out.println("Первый элемент коллекции: " + first(cQ));
        System.out.println("Коллекция Queue имеет вид: " + cQ);
    }

    public static void enqueue(Queue<Integer> qulist, Integer element) {
        qulist.offer(element);
    }

    public static Integer dequeue(Queue<Integer> qulist) {
        return qulist.remove();
    }

    public static Integer first(Queue<Integer> qulist) {
        return qulist.peek();
    }
}
