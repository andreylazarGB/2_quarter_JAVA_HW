package JAVA.Homework.Homework_seminar6;

import java.util.HashSet;
import java.util.Set;

public class Laptop {
    int RAM, SSD;
    String operatingSystem, color;

    static Set<Laptop> laptops = new HashSet<>();
    
    static Set addLaptop(Set<Laptop> lap){   
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

        lap.add(laptop1);
        lap.add(laptop2);
        lap.add(laptop3);
        lap.add(laptop4);
        lap.add(laptop5);
        lap.add(laptop6);
        lap.add(laptop7);
        lap.add(laptop8);
        lap.add(laptop9);
        lap.add(laptop10);
        return lap;
    }
    
    @Override
    public String toString(){
        return "Операционная система: " + operatingSystem + ", ОЗУ: " + RAM + ", Объем ЖД: " + SSD + ", Цвет: " + color;
    }
}
