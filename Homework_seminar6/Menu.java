package JAVA.Homework.Homework_seminar6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Menu {
    
    static Map <String, String> filtrLaptop = new HashMap<>();
    static Integer number;
    
    static void menu(){
        Scanner scanner = new Scanner(System.in);
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
        //scanner.close();
    }

    static Map<String, String> inputFiltr(Map <String, String> emptyFiltr){
        menu();
        Scanner scanner = new Scanner(System.in);
        switch (number){
            case 1: System.out.print("Введите минимальное значение объема ОЗУ (8ГБ, 16ГБ): ");
                    String valumeRAM  = scanner.next();
                    emptyFiltr.put( "RAM", valumeRAM);
                    inputFiltr(emptyFiltr);             
                    break;
            case 2: System.out.print("Введите минимальное значение объема ЖД (256ГБ, 512ГБ, 1024ГБ): ");
                    String valumeSSD  = scanner.next();
                    emptyFiltr.put( "SSD", valumeSSD);
                    inputFiltr(emptyFiltr);   
                    break;
            case 3: System.out.print("Введите название операционной системы (Linux, Windows, Mac): ");
                    String nameOS  = scanner.next();
                    emptyFiltr.put( "operatingSystem", nameOS);
                    inputFiltr(emptyFiltr);   
                    break;
            case 4: System.out.print("Введите название цвета ноутбука (black, white, silver): ");
                    String color  = scanner.next();
                    emptyFiltr.put( "color", color);
                    inputFiltr(emptyFiltr);   
                    break;            
            case 5: Laptop.addLaptop(Laptop.laptops);
                    printSet(filtr.findLaptops(Laptop.laptops, emptyFiltr));
                    //System.out.println(emptyFiltr);
                    break;
        }
        scanner.close();
        return emptyFiltr;
    }
    
    
    static void printSet(Set<Laptop> laptop) {
        System.out.println("Список ноутбоков: ");
        int count = 1;
        for (Laptop lap : laptop) {
            System.out.print(count++ + " " + "Ноутбук: ");
            System.out.println(lap);
        }
    }
}
