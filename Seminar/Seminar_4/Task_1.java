import java.util.LinkedList;
import java.util.Scanner;

public class Task_1 {
    // Реализовать консольное приложение, которое в цикле:
    // Принимает от пользователя строку вида text~num
    // Нужно разделить строку по ~, сохранить text в связный список на позицию num.
    // Если введено print~num, выводит строку из позиции num в связном списке и
    // удаляет её из списка.

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите текст: текст, через ~ индекс на который хотите вставить текст");
            System.out.println();

            String userInput = scanner.nextLine();
            if (userInput.equals("quit"))
                return; // выход из цикла, если набрали quit

            String[] parts = userInput.split("~");
            if (parts.length != 2)
                throw new IllegalStateException("Ошибка текста, нужно две части через ~");
            if (parts[0].equals("print")) {
                String temp = strings.remove(Integer.parseInt(parts[1]));
                System.out.println(temp);
                
            } else {
                strings.add(Integer.parseInt(parts[1]), parts[0]);
            }
            System.out.println(strings);
        }
    }
}
