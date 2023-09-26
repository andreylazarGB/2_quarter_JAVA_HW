package JAVA.Homework.Homework_seminar1;

import java.util.Arrays;

// Напишите функцию printPrimeNums, которая выведет на экран все простые числа 
// в промежутке от 1 до 1000, каждое на новой строке.

public class Main2 {
    public static void main(String[] args) {
        // Method 1
        Integer[] newArr = new Integer[1];
        newArr[0] = 1;
        for (int i = 2; i < 1000; i++) {
            int count = 0;
            for (int index = 1; index <= i; index++) {
                if (i % index == 0)
                    count++;
            }
            if (count == 2) {
                newArr = Arrays.copyOf(newArr, newArr.length + 1);
                newArr[newArr.length - 1] = i;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }
    }
}
