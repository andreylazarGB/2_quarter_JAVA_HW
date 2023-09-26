package JAVA.Homework.Homework_seminar4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main3 {

    /*
     * В обычный калькулятор без логирования добавьте возможность отменить последнюю
     * операцию.
     * Отмена последней операции должна быть реализована следующим образом: если
     * передан оператор '<'
     * калькулятор должен вывести результат предпоследней операции.
     * 
     * calculate('+', 3, 7) // 10
     * calculate('+', 4, 7) // 11
     * calculate('<', 0, 0) // 10
     * 
     * calculate('*', 3, 2) // 6
     * calculate('-', 7, 4) // 3
     * calculate('<', 0, 0) // 6
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        while (true) {
            char op = ' ';
            do {
                System.out.print("enter operation: ");
                op = scanner.next().charAt(0);
            } while (op != '+' && op != '-' && op != '*' && op != '/' && op != '<');
            if (op == '<') {
                list.remove(list.get(list.size() - 1));
                for (int index = 0; index < list.size(); index++) {
                    System.out.println(list.get(index));
                }
                break;
            }
            System.out.println("Enter number: ");
            double a = scanner.nextDouble();
            System.out.println("Enter number: ");
            double b = scanner.nextDouble();

            // if (op == '+') System.out.print(a + b);
            // if (op == '-') System.out.print(a - b);
            // if (op == '*') System.out.print(a * b);
            // if (op == '/') System.out.print(a / b);
            list.add("calculate" + "(" + "'" + op + "'" + ", " + String.format("%.0f", a) + ", "
                    + String.format("%.0f", b) + ")");
            for (int index = 0; index < list.size(); index++) {
                System.out.println(list.get(index));
            }
        }
        scanner.close();
    }
}
