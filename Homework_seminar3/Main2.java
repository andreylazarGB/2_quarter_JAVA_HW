package JAVA.Homework.Homework_seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*Напишите функцию removeEvenNumbers, которая принимала бы произвольный список целых чисел, 
  удаляла бы из него четные числа и выводила список без четных чисел.
  Напишите свой код в методе removeEvenNumbers класса Answer. Метод removeEvenNumbers принимает на вход 
  один параметр:

Integer[] arr - список целых чисел

Пример:

arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
removeEvenNumbers(arr);
// [1, 3, 5, 7, 9]

arr = new Integer[]{2, 4, 6, 8};
removeEvenNumbers(arr);
// [] */

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(10, 100));
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2 == 0 ){
                list.remove(i);
                i -= 1;
            }
        } 
        System.out.println(list);
    }
}