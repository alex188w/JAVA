import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_1 {
    // Даны 2 строки, написать метод, который вернет true, если эти строки являются
    // изоморфными и false, если нет. Строки изоморфны, если одну букву в первом
    // слове можно заменить на некоторую букву во втором слове, при этом
    // повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением
    // порядка следования. (Например, add - egg изоморфны)
    // буква может не меняться, а остаться такой же. (Например, note - code)
    // Пример 1:
    // Input: s = "foo", t = "bar"
    // Output: false
    // Пример 2:
    // Input: s = "paper", t = "title"
    // Output: true

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Входная строка: ");
        String strIn = scanner.nextLine();
        System.out.println("Выходная строка: ");
        String strOut = scanner.nextLine();

        // Map<Character, Character> encoding = new HashMap<>();

        if (strIn.length() != strOut.length()) {
            throw new IllegalStateException("Длина строк не равна"); // программа завершится с ошибкой
        }

        // for (int i = 0; i < strIn.length(); i++) {
        // encoding.put(strIn.charAt(i), strOut.charAt(i));
        // }
        // System.out.println(encoding);
        
        System.out.println(isIsomorphic(strIn, strOut));
        scanner.close();
    }

    public static boolean isIsomorphic(String strIn, String strOut) {
        if (strIn.length() != strOut.length()) {
            return false;
        }
        Map<Character, Character> encoding = new HashMap<>();
        for (int i = 0; i < strIn.length(); i++) {
            if (encoding.containsKey(strIn.charAt(i))) {
                if (!encoding.get(strIn.charAt(i)).equals(strOut.charAt(i)))
                    return false;

            } else {
                encoding.put(strIn.charAt(i), strOut.charAt(i));
            }
        }
        return true;
    }
}
