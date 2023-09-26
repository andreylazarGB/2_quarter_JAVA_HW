package JAVA.Homework.Homework_seminar1;

// Вычислить n-ое треугольного число(сумма чисел от 1 до n).
// n = 4 -> 10
// n = 5 -> 15

public class Main1 {
    public static void main(String[] args) {
    int n = 5;
      int count = 0;
      for (int index = 1; index <= n; index++) {
            count += index;
        }  
      System.out.println(count); 
    }
}