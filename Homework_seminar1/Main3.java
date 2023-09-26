package JAVA.Homework.Homework_seminar1;

import java.util.Scanner;

// Напишите класс Calculator, который будет выполнять математические операции (+, -, *, /) 
// над двумя числами и возвращать результат. В классе должен быть метод calculate, 
// который принимает оператор и значения аргументов и возвращает результат вычислений.
// При неверно переданном операторе, программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number - ");
        double a = scanner.nextDouble();
        System.out.print("enter second number - ");
        double b = scanner.nextDouble();
        char op = '0';
        do {
            System.out.print("enter operation - ");
            op = scanner.next().charAt(0);
        } while (op != '+' && op != '-' && op != '*' && op != '/');
        scanner.close();

        if (op == '+') System.out.print(a + b);
        if (op == '-') System.out.print(a - b);
        if (op == '*') System.out.print(a * b);
        if (op == '/') System.out.print(a / b);
    }
}
