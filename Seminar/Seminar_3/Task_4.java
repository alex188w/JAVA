import java.util.ArrayList;

public class Task_4 {
    public static void main(String[] args) {
        // Каталог товаров книжного магазина сохранен в виде двумерного списка
        // List<ArrayList<String>> так, что на 0-й позиции каждого внутреннего списка
        // содержится название жанра, а на остальных позициях - названия книг. Напишите
        // метод для заполнения данной структуры.
        ArrayList<ArrayList<String>> boocStore = new ArrayList<>();

        ArrayList<String> action = new ArrayList<>();
        ArrayList<String> fantasy = new ArrayList<>();

        action.add("Экшн");
        action.add("Экшн 1");
        action.add("Экшн 2");
        fantasy.add("Фантастика 1");
        fantasy.add("Фантастика 2");
        fantasy.add("Фантастика 3");

        boocStore.add(action);
        boocStore.add(fantasy);

        System.out.println(boocStore);




    }
}
