//1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//2. Создать множество ноутбуков.
//3. Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//    отвечающие фильтру. Критерии фильтрации можно хранить в Map.
//    Например: “Введите цифру, соответствующую необходимому критерию:
//    1 - ОЗУ
//    2 - Объем ЖД
//    3 - Операционная система
//    4 - Цвет …
//
//Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.


import java.util.*;

public class Main {
    public static void main(String[] args) {

        LapTops laptop1 = new LapTops(1, "Samsung", 8, 256, "Windows", "Black", 15.6);
        LapTops laptop2 = new LapTops(2, "Apple", 16, 512, "Mac OS", "Grey", 21.8);
        LapTops laptop3 = new LapTops(3, "Acer", 4, 256, "Linux", "White", 13.1);
        LapTops laptop4 = new LapTops(4, "Asus", 8, 1024, "Windows", "Grey", 15.6);
        LapTops laptop5 = new LapTops(5, "HP", 16, 1024, "Linux", "Black", 21.8);

        int count = 5;
        LapTops[] lapTops = new LapTops[count];
        TechnoStore technoStore = new TechnoStore();
        technoStore.loadLaptop(laptop1);
        technoStore.loadLaptop(laptop2);
        technoStore.loadLaptop(laptop3);
        technoStore.loadLaptop(laptop4);
        technoStore.loadLaptop(laptop5);

        // int count = 5;
        // TechnoStore[] technoStores = new TechnoStore[count];
        System.out.println(technoStore);
        technoStore.findLaptop();
    }
}

