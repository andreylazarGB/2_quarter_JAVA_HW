package JAVA.Homework.Homework_seminar6;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Integer number;
    do {
        System.out.print("Критерии для фильтрации: \n" +
                "1 - ОЗУ\n" +
                "2 - Объем ЖД\n" +
                "3 - Операционная система\n" +
                "4 - Цвет\n" +
                "5 - Поиск\n" +
                "Введите цифру, соответствующую необходимому критерию: ");
        number = scanner.nextInt();
    }while(number!=1 && number!=2 && number!=3 && number!=4 && number!=5);
    scanner.close();
    }
}
