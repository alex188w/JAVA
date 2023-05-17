package Lesson_02;
import java.io.IOException;
import java.util.logging.*;

public class Ex005_Logger {
    public static void main(String[] args) throws IOException {
    
        Logger logger = Logger.getLogger(Ex005_Logger.class.getName());
        //ConsoleHandler ch = new ConsoleHandler(); // вывод в консоль
        FileHandler fh = new FileHandler("log.txt"); //вывод в файл
        //logger.addHandler(ch); // вывод в консоль
        logger.addHandler(fh); //вывод в файл
        
        SimpleFormatter sFormat = new SimpleFormatter(); // текстовый формат
        //XMLFormatter xml = new XMLFormatter(); // файорвый фориат
        fh.setFormatter(sFormat); // текстовый формат
        //fh.setFormatter(xml); // файорвый фориат
        
        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");

    }
}







