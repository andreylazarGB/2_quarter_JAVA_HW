package JAVA.Homework.Homework_seminar3;

import java.util.Arrays;

/*
 Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел a 
 и реализует алгоритм сортировки слиянием. Метод должен возвращать отсортированный массив.

Пример
a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]

 */
public class Main1 {

    public static void main(String[] args) {
        int[] arrayA = {5, 1, 6, 2, 3, 4, 9};
        System.out.println(Arrays.toString(MergeSort(arrayA)));
         }
    
    public static int[] MergeSort(int[] arrayA){
        if (arrayA.length <= 1) return arrayA;
        int[] arrayB = Arrays.copyOfRange(arrayA, 0, arrayA.length/2);
        int[] arrayC = Arrays.copyOfRange(arrayA, arrayA.length/2, arrayA.length);
       
        return merge(MergeSort(arrayB), MergeSort(arrayC));
        }

    private static int[] merge(int[] arrayA, int[] arrayB){   
        int[] arrayC = new int[arrayA.length + arrayB.length];
        int positionA = 0;
        int positionB = 0;
        int i = 0;

        while (positionA < arrayA.length && positionB < arrayB.length)
            if (arrayA[positionA] < arrayB[positionB])
                arrayC[i++] = arrayA[positionA++];
            else arrayC[i++] = arrayB[positionB++];

        while (i < arrayC.length)
            if (positionA != arrayA.length)
                arrayC[i++] = arrayA[positionA++];
            else arrayC[i++] = arrayB[positionB++];
        
        return arrayC;
    }
}
