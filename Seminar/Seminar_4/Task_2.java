import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Task_2 {
// Реализовать консольное приложение, которое:
// Принимает от пользователя и “запоминает” строки.
// Если введено print, выводит строки в обратном порядке (первая введённая окажется последней выведенной).
// Если введено revert, удаляет предыдущую введенную строку из памяти

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "cp866"); // "cp866" для ввода кириллицы
        Deque<String> deque = new LinkedList<>();

        while (true) {
            System.out.println("Введите текст, quit - выход из ввода: ");
            String input = scanner.nextLine(); //ввод данных пользователя

            if (input.equals("quit")) { // завершение программы
                break;
            }
            else if (input.equals("print")) {
                System.out.println(deque);               
            }
            else if (input.equals("revert")) {
                System.out.println(deque.pollFirst());
            }
            else {
                deque.addFirst(input);
            }
            System.out.println(deque);
        }

        scanner.close();
    
    }
}
