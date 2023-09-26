package JAVA.Homework.Homework_seminar5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main2 {
    /*
     * Пусть дан список сотрудников:Иван Иванов, Светлана Петрова, Кристина Белова,
     * Анна Мусина,
     * Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, Мария
     * Федорова, Марина Светлова,
     * Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников,
     * Петр Петин, Иван Ежов.
     * Написать программу, которая найдет и выведет повторяющиеся имена с
     * количеством повторений.
     * Отсортировать по убыванию популярности. Для сортировки можно использовать
     * TreeMap, мы не успели,
     * но я расписал пример использования и прикрепил к материалам урока в файле
     * TestTreeMap
     */
    public static void main(String[] args) {
        
        String spisok = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, " +
        "Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, " +
        "Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, " +
        "Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов.";
        spisok = spisok.replace(".", "");
        
        String[] employees = spisok.split(", ");
        Map<String, Integer> map = new HashMap<>();
        
        for(String emploee: employees){
            String name = emploee.split(" ")[0];
            int count = map.getOrDefault(name, 0);
            count++;
            map.put(name, count);
        }
        
        Map<Integer, List<String>> mapSort = new TreeMap<>(Comparator.reverseOrder());
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            String name = entry.getKey();
            int count = entry.getValue();
            if(mapSort.containsKey(count)){
                List<String> list = mapSort.get(count);
                list.add(name);
            } else{
                List<String> list = new ArrayList<>();
                list.add(name);
                mapSort.put(count, list);
            }
        }
        System.out.println(mapSort);
    }
}