package JAVA.Homework.Homework_seminar6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class filtr {

    Map <String, String> filtrLaptop = new HashMap<>();
    Scanner scanner = new Scanner(System.in);  
        switch (number){
            case 1: System.out.print("Введите минимальное значение объема ОЗУ (8ГБ, 16ГБ): ");
                    String valumeRAM  = scanner.next();
                    filtrLaptop.put( "RAM", valumeRAM);
                    info();              
            case 2: System.out.print("Введите минимальное значение объема ЖД (256ГБ, 512ГБ, 1024ГБ): ");
                    String valumeSSD  = scanner.next();
                    filtrLaptop.put( "SSD", valumeSSD);
                    info();
            case 3: System.out.print("Введите название операционной системы (Linux, Windows, Mac): ");
                    String nameOS  = scanner.nextLine();
                    filtrLaptop.put( "operatingSystem", nameOS);
                    info();
            case 4: System.out.print("Введите название цвета ноутбука (black, white, silver): ");
                    String color  = scanner.nextLine();
                    filtrLaptop.put( "color", color);
                    info();
            case 5: printSet(findLaptops(laptops, filtrLaptop));
                    break;
        }
        scanner.close();
    }

//     static Set<Laptop> findLaptops(Set<Laptop> laptops, Map<String, String> filtrLaptop){
//         Set<Laptop> res = new HashSet<>();
//         for (Laptop laptop: laptops){
//             if (filtrLaptop.containsValue(laptop.operatingSystem) && 
//                 filtrLaptop.containsValue(laptop.color) && 
//                 (laptop.RAM >= Integer.parseInt(filtrLaptop.get("RAM"))) &&
//                 (laptop.SSD >= Integer.parseInt(filtrLaptop.get("SSD")))){
//                 res.add(laptop);
//             }
//         }
//         return res;
}
