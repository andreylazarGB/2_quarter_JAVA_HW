package JAVA.Homework.Homework_seminar6;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class filtr {

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



