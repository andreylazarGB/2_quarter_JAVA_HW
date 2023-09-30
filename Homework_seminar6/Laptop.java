package JAVA.Homework.Homework_seminar6;

import java.util.HashSet;
import java.util.Set;

public class Laptop {
    int RAM, SSD;
    String operatingSystem, color;
    
    Set <Laptop> laptops = new HashSet<>();

    @Override
    public String toString(){
        return "Операционная система: " + operatingSystem + ", ОЗУ: " + RAM + ", Объем ЖД: " + SSD + ", Цвет: " + color;
    }
}
