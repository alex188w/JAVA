import java.util.ArrayList;

public class Task_3 {
    public static void main(String[] args) {
        // Создать список типа ArrayList<String>. Поместить в него как строки, так и
        // целые числа. Пройти по списку, найти и удалить целые числа.
        ArrayList strList = new ArrayList<String>(); // ArrayList - теперь Объект, в него можно доюавлять и INt и String
                                                     // ...
        strList.add("Planet");
        strList.add("Sputnik");
        strList.add(555);
        strList.add(777);
        strList.add(999);
        strList.add("Planet9");
        for (int i = 0; i < strList.size(); i++) {
            if (strList.get(i) instanceof Integer) {
                strList.remove(i);
                i--; // возвращает к предыдущему элементу после удалению, можно i++ внести под if
            };
        }
        System.out.println(strList);
    }
}
