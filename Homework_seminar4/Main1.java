package JAVA.Homework.Homework_seminar4;

import java.util.Arrays;
import java.util.LinkedList;


public class Main1 {
    /*Пусть дан LinkedList с несколькими элементами.
    Напишите класс LLTasks с методом revert, который принимал бы на вход LinkedList и 
    возвращает “перевернутый” список.
        Пример
        // Дан 
        [1, One, 2, Two]

        // Вывод
        [1, One, 2, Two]
        [Two, 2, One, 1] */
    public static void main(String[] args) {
        String[] strings = new String[]{"1", "One", "2", "Two"};
        LinkedList<String> spisok = new LinkedList<>();
        LinkedList<String> spisok2 = new LinkedList<>();
        spisok.addAll(Arrays.asList(strings));
        System.out.println(spisok);
        
        // for (int index = spisok.size()-1; index >= 0; index--) {
        //     //spisok2.add(spisok.get(index));
        // }
        for (int index = 0; index < spisok.size(); index++) {
            spisok2.addFirst(spisok.get(index));
        }
        // for (Object o : spisok) {
        //     spisok2.addFirst(o);
        // }
        System.out.println(spisok2);
    }
}
