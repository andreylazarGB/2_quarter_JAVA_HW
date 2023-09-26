package JAVA.Homework.Homework_seminar2;
/*
Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
int[] arr - числовой массив

После каждой итерации, ваш код должен делать запись в лог-файл 'log.txt' в формате 
год-месяц-день час:минуты {массив на данной итерации}.

Пример
arr = new int[]{9, 4, 8, 3, 1};
sort(arr)

// При чтении лог-файла получим:
2023-05-19 07:53 [4, 8, 3, 1, 9]
2023-05-19 07:53 [4, 3, 1, 8, 9]
2023-05-19 07:53 [3, 1, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9]
2023-05-19 07:53 [1, 3, 4, 8, 9] */

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[] { 9, 3, 4, 8, 2, 5, 7, 1, 6, 10};
        FileWriter file = new FileWriter("JAVA\\Homework\\Homework_seminar2\\log.txt");
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm ");
        // for (int index = 0; index < arr.length-1; index++) {
            // for (int i = 0; i < arr.length-i; i++) {
            //     if (arr[i] > arr[i + 1]) {
            //         int temp = arr[i + 1];
            //         arr[i + 1] = arr[i];
            //         arr[i] = temp;
            //     }
            // file.append(localDateTime.format(dateTimeFormatter) + Arrays.toString(arr) + '\n'); 
            // }
            //     file.flush();
            //      file.close();
            // }

            int temp;
            boolean unsorted = true;
            while (unsorted) {
                unsorted = false;
                for (int i = 0; i < arr.length - 1; i++) {
                    if (arr[i] > arr[i + 1]) {
                        temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                        unsorted = true;
                    }
                }
            file.append(localDateTime.format(dateTimeFormatter) + Arrays.toString(arr) + '\n'); 
                    }
        file.flush();
        file.close();
        }
}
