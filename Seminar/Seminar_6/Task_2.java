import java.util.HashSet;
import java.util.Set;

public class Task_2 {
    public static void main(String[] args) {       

        Cat();
    }

/*3. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество.
Создайте метод **public boolean** equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.*/
    public static void Cat() {
        Cat cat1 = new Cat("Bars", new CatOwner("Ivan Petrov"));
        cat1.setCatMale('M');
        cat1.setMonthBirth(2);
        cat1.setYearBirth(2021);

        Cat cat2 = new Cat("Bars", new CatOwner("Ivan Petrov"));
        cat2.setCatMale('M');
        cat2.setMonthBirth(2);
        cat2.setYearBirth(2021);

        Cat cat3 = new Cat("Bars", new CatOwner("Ivan Petrov"));
        cat3.setCatMale('M');
        cat3.setMonthBirth(2);
        cat3.setYearBirth(2021);

        Cat cat4 = new Cat("Murzik", new CatOwner("Petr Ivanov"));
        cat4.setCatMale('M');
        cat4.setMonthBirth(4);
        cat4.setYearBirth(2015);

        Cat cat5 = new Cat("Musya", new CatOwner("Lena Petrova"));
        cat5.setCatMale('F');
        cat5.setMonthBirth(5);
        cat5.setYearBirth(2019);

        Set<Cat> catSet = new HashSet<>(); // создали своё множество на основании класса

        catSet.add(cat1);
        catSet.add(cat2);
        catSet.add(cat3);
        catSet.add(cat4);
        catSet.add(cat5);

        for (Cat i : catSet) {
            System.out.println(i);
        }
        System.out.println(catSet);
    }    
}
