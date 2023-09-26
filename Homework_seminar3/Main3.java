package JAVA.Homework.Homework_seminar3;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Напишите функцию analyzeNumbers, которая принимает на вход целочисленный список arr и:

Сортирует его по возрастанию и выводит на экран
Находит минимальное значение в списке и выводит на экран - Minimum is {число}
Находит максимальное значение в списке и выводит на экран - Maximum is {число}
Находит среднее арифметическое значений списка и выводит на экран - Average is =  {число}
Напишите свой код в методе analyzeNumbers класса Answer. Метод analyzeNumbers принимает на вход один параметр:

Integer[] arr - список целых чисел

Пример
arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
analyzeNumbers(arr)

// [1, 2, 3, 4, 5, 6, 7, 8, 9]
// Minimum is 1
// Maximum is 9
// Average is = 5 */
public class Main3 {
    public static void main(String[] args) {
        //Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        Integer[] arr = new Integer[]{-2, -1, 0, 1, 2, 3, 4, 5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<Integer> list = Arrays.asList(arr); 
        System.out.println("Minimum is " + Collections.min(list));
        System.out.println("Maximum is " + Collections.max(list));
        
        double sum = 0;
        for (int i : arr) sum += i;
        double result = Math.floor(sum/arr.length);
        String average = String.format("%.0f",result);
        System.out.println("Average is = " + average);
    }
}
