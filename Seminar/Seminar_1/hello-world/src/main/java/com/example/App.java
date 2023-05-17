package com.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        System.out.println(now.toString());
        System.out.println(now.format(formatter));

        Scanner iScanner = new Scanner(System.in, ("cp866"));
        System.out.printf("Введите имя:");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!",  name);
        System.out.println();
        
        int[] numbers = new int[] { 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1 };
        System.out.println (Arrays.toString(numbers)); //вывод массива 1
        
        for (int number : numbers) //вывод массива 2
            System.out.printf("%d ", number);
        System.out.println();

        int counter = 0, max = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers [i] == 1)
                counter++;
            else {
                if (counter > max)
                    max = counter;
                counter = 0;
            }
        }
        if (counter > max)
            max = counter;
            System.out.println(max);
    }

}
