import java.util.*;

public class Main {
    public static void main(String[] args) {

        LapTops laptop1 = new LapTops(1, "Samsung", 8, 256, "Windows", "Black", 15.6);
        LapTops laptop2 = new LapTops(2, "Apple", 16, 512, "MacOS", "Grey", 21.8);
        LapTops laptop3 = new LapTops(3, "Acer", 4, 256, "Linux", "White", 13.1);
        LapTops laptop4 = new LapTops(4, "Asus", 8, 1024, "Windows", "Grey", 15.6);
        LapTops laptop5 = new LapTops(5, "HP", 16, 1024, "Linux", "Black", 21.8);
        LapTops laptop6 = new LapTops(6, "Lenovo", 4, 512, "Windows", "White", 25.0);
        LapTops laptop7 = new LapTops(7, "Honor", 2, 128, "Linux", "Bronze", 18.5);

        TechnoStore technoStore = new TechnoStore();
        technoStore.loadLaptop(laptop1);
        technoStore.loadLaptop(laptop2);
        technoStore.loadLaptop(laptop3);
        technoStore.loadLaptop(laptop4);
        technoStore.loadLaptop(laptop5);
        technoStore.loadLaptop(laptop6);
        technoStore.loadLaptop(laptop7);

        System.out.println(technoStore);
        technoStore.findLaptop();
    }
}

