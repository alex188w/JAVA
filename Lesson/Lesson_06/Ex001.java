import java.util.Arrays;
import java.util.HashSet;

public class Ex001 {
    public static void main(String[] args) {
        
        Worker w1 = new Worker(); // экземпляр класса Worker
        w1.firstName = "Имя_1"; // конкретные характеристики для работника
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker(); // несмотря на одинаковые хаписи, зто разные работники
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.salary = 100;
        w4.id = 3000;

        Worker w2 = new Worker(); 
        w2.firstName = "Имя_1";
        w2.lastName = "Фамилия_1";
        w2.salary = 500;
        w2.id = 1000;

        Worker w3 = new Worker(); 
        w3.firstName = "Имя_1";
        w3.lastName = "Фамилия_1";
        w3.salary = 300;
        w3.id = 4000;

        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));
        System.out.println(w1.toString()); // Выводит: Worker@4617c264 - 4617c264 - это это хэш-код
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);
        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3, w4));
        System.out.println(workers.contains(w4));
    }
    
}