import java.util.HashMap;
import java.util.Map;

public class Task_0 {
    public static void main(String[] args) {
        // Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
    // 123456 Иванов
    // 321456 Васильев
    // 234561 Петрова
    // 234432 Иванов
    // 654321 Петрова
    // 345678 Иванов
    // Вывести данные по сотрудникам с фамилией Иванов
        HashMap<Integer, String> lastNameByPassport = new HashMap<> ();
        lastNameByPassport.put (123456, "Иванов");
        lastNameByPassport.put (321456, "Васильев");
        lastNameByPassport.put (234561, "Петрова");
        lastNameByPassport.put (234432, "Иванов");
        lastNameByPassport.put (654321, "Петрова");
        lastNameByPassport.put (345678, "Иванов");        

        System.out.println(lastNameByPassport);
        String lastName = lastNameByPassport.get (123456);
        System.out.println(lastName);

        for (Map.Entry<Integer, String> entry : lastNameByPassport.entrySet())
            if (entry.getValue().equals("Иванов"))
                System.out.println(entry);
    }    
}