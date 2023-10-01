package JAVA.Homework.Homework_seminar6;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class methods {

        static void inputFiltr(Map <String, String> emptyFiltr){
        Menu.menu();
        Scanner scanner = new Scanner(System.in);
        switch (Menu.number){
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
                    printSet(methods.findLaptops(Laptop.laptops, emptyFiltr));
                    break;
        }
        scanner.close();
    }

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


    static void printSet(Set<Laptop> laptop) {
        if (laptop.size() == 0){
                System.out.println("Список пуст");
        }
        else{
                System.out.println("Список ноутбоков: ");
                int count = 1;
                for (Laptop lap : laptop) {
                System.out.print(count++ + " " + "Ноутбук: ");
                System.out.println(lap);
                }
        }
        }
}

