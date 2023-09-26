package JAVA.Homework.Homework_seminar3;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


class Answer {
    public static void removeEvenNumbers(Integer[] arr) {   
      // Введите свое решение ниже
      
      List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2 == 0 ){
                list.remove(i);
                i -= 1;
            }
         }
    Integer[] array = list.toArray(new Integer[0]);  
    System.out.println(Arrays.toString(array));
    }

}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Main2_Test{ 
    public static void main(String[] args) { 
      Integer[] arr = {};
      
      if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
        arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
      }
      else{
        arr = Arrays.stream(args[0].split(", "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new);
      }     
      
      Answer ans = new Answer();      
      ans.removeEvenNumbers(arr);
    }
}