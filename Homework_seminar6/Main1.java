package JAVA.Homework.Homework_seminar6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main1 {
    /*
     * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
     * методы. Реализовать в java.
     * Создать множество ноутбуков.
     * Написать метод, который будет запрашивать у пользователя критерий (или
     * критерии) фильтрации и выведет ноутбуки,
     * отвечающие фильтру. Критерии фильтрации можно хранить в Map.
     * Например:
     * “Введите цифру, соответствующую необходимому критерию:
     * 1 - ОЗУ
     * 2 - Объем ЖД
     * 3 - Операционная система
     * 4 - Цвет …
     * Далее нужно запросить минимальные значения для указанных критериев -
     * сохранить параметры фильтрации можно
     * также в Map.
     * Отфильтровать ноутбуки из первоначального множества и вывести подходящие по
     * условиям.
     * Работу сдать как обычно ссылкой на гит репозиторий
     * Частые ошибки:
     * 1. Заставляете пользователя вводить все существующие критерии фильтрации
     * 2. Невозможно использовать более одного критерия фильтрации одновременно
     * 3. При выборке выводятся ноутбуки, которые удовлетворяют только одному
     * фильтру, а не всем введенным пользователем
     * 4. Работа выполнена только для каких то конкретных ноутбуков, и если поменять
     * характеристики ноутбуков
     * или добавить еще ноутбук, то программа начинает работать некорректно
     */

    public static void main(String[] args) {
        // info();

        Set<Laptop> laptops = new HashSet<>();

        Laptop laptop1 = new Laptop();
        laptop1.RAM = 8;
        laptop1.SSD = 256;
        laptop1.operatingSystem = "Linux";
        laptop1.color = "silver";

        Laptop laptop2 = new Laptop();
        laptop2.RAM = 16;
        laptop2.SSD = 512;
        laptop2.operatingSystem = "Mac";
        laptop2.color = "white";

        Laptop laptop3 = new Laptop();
        laptop3.RAM = 16;
        laptop3.SSD = 1024;
        laptop3.operatingSystem = "Windows";
        laptop3.color = "silver";

        Laptop laptop4 = new Laptop();
        laptop4.RAM = 8;
        laptop4.SSD = 512;
        laptop4.operatingSystem = "Linux";
        laptop4.color = "black";

        Laptop laptop5 = new Laptop();
        laptop5.RAM = 16;
        laptop5.SSD = 1024;
        laptop5.operatingSystem = "Mac";
        laptop5.color = "white";

        Laptop laptop6 = new Laptop();
        laptop6.RAM = 16;
        laptop6.SSD = 512;
        laptop6.operatingSystem = "Windows";
        laptop6.color = "white";

        Laptop laptop7 = new Laptop();
        laptop7.RAM = 8;
        laptop7.SSD = 256;
        laptop7.operatingSystem = "Linux";
        laptop7.color = "black";

        Laptop laptop8 = new Laptop();
        laptop8.RAM = 8;
        laptop8.SSD = 512;
        laptop8.operatingSystem = "Mac";
        laptop8.color = "white";

        Laptop laptop9 = new Laptop();
        laptop9.RAM = 16;
        laptop9.SSD = 1024;
        laptop9.operatingSystem = "Windows";
        laptop9.color = "silver";

        Laptop laptop10 = new Laptop();
        laptop10.RAM = 16;
        laptop10.SSD = 512;
        laptop10.operatingSystem = "Mac";
        laptop10.color = "black";

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        laptops.add(laptop7);
        laptops.add(laptop8);
        laptops.add(laptop9);
        laptops.add(laptop10);

        Map<String, String> filtrLaptop = new HashMap<>();
        filtrLaptop.put("operatingSystem", "Mac");
        filtrLaptop.put("color", "white");
        //filtrLaptop.put("RAM", "16");
        filtrLaptop.put("SSD", "512");

        // printSet(laptops);
        printSet(findLaptops(laptops, filtrLaptop));
    }

    static void printSet(Set<Laptop> laptops) {
        System.out.println("Список ноутбоков: ");
        int count = 1;
        for (Laptop laptop : laptops) {
            System.out.print(count++ + " " + "Ноутбук: ");
            System.out.println(laptop);
        }
    }

    // static void info(){
    // Scanner scanner = new Scanner(System.in);
    // Integer number;
    // do {
    // System.out.print("Критерии для фильтрации: \n"+
    // "1 - ОЗУ\n"+
    // "2 - Объем ЖД\n"+
    // "3 - Операционная система\n"+
    // "4 - Цвет\n"+
    // "5 - Поиск\n"+
    // "Введите цифру, соответствующую необходимому критерию: ");
    // number = scanner.nextInt();
    // } while (number != 1 && number != 2 && number != 3 && number != 4 && number
    // != 5);

    // Map <String, String> filtrLaptop = new HashMap<>();

    // switch (number){
    // case 1: System.out.print("Введите минимальное значение объема ОЗУ (8ГБ,
    // 16ГБ): ");
    // String valumeRAM = scanner.next();
    // filtrLaptop.put( "RAM", valumeRAM);
    // info();
    // case 2: System.out.print("Введите минимальное значение объема ЖД (256ГБ,
    // 512ГБ, 1024ГБ): ");
    // String valumeSSD = scanner.next();
    // filtrLaptop.put( "SSD", valumeSSD);
    // info();
    // case 3: System.out.print("Введите название операционной системы (Linux,
    // Windows, Mac): ");
    // String nameOS = scanner.nextLine();
    // filtrLaptop.put( "operatingSystem", nameOS);
    // info();
    // case 4: System.out.print("Введите название цвета ноутбука (black, white,
    // silver): ");
    // String color = scanner.nextLine();
    // filtrLaptop.put( "color", color);
    // info();
    // case 5: printSet(findLaptops(laptops, filtrLaptop));
    // break;
    // }
    // scanner.close();
    // }

    static Set<Laptop> findLaptops(Set<Laptop> laptops, Map<String, String> filtrLaptop) {
        Set<Laptop> copy = new HashSet<>(laptops);
        copy.addAll(laptops);
        
        if (filtrLaptop.get("operatingSystem") != null){
        copy.removeIf(laptop -> (!filtrLaptop.containsValue(laptop.operatingSystem)));
        }

        if (filtrLaptop.get("color") != null){
        copy.removeIf(laptop -> (!filtrLaptop.containsValue(laptop.color)));
        }

        if (filtrLaptop.get("RAM") != null){
        copy.removeIf(laptop -> !(laptop.RAM >= Integer.parseInt(filtrLaptop.get("RAM"))));
        }

        if (filtrLaptop.get("SSD") != null) {
        copy.removeIf(laptop -> !(laptop.SSD >= Integer.parseInt(filtrLaptop.get("SSD"))));
        }
        return copy;
    }
}
