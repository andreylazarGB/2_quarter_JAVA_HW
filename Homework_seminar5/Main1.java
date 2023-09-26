package JAVA.Homework.Homework_seminar5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1 {
    /*
     * Реализуйте структуру телефонной книги с помощью HashphoneBook, учитывая,
     * что 1 человек может иметь несколько телефонов.
     */

    public static void main(String[] args) {
          
        add("Иванов", 123456);
        add("Иванов", 654321);
        add("Петров", 456789);
       
        System.out.println(findName("Петров"));       
    }
    
    public static Map<String, List<Integer>> phoneBook = new HashMap<>();
    
    static void add(String name, Integer number) {
        if (phoneBook.containsKey(name)) {
            List<Integer> list = phoneBook.get(name);
            list.add(number);
        } else {
            List<Integer> list = new ArrayList<>();
            list.add(number);
            phoneBook.put(name, list);
        }
    }

    static String findName(String name) {
        for (Map.Entry<String, List<Integer>> entry : phoneBook.entrySet()) {
            if (entry.getKey().equals(name)) {
                return name + ": " + entry.getValue();
            }
        }
        return null;
    }

}
