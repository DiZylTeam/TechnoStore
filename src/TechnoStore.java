import java.util.*;

public class TechnoStore {
    private final List<LapTops> laptopsList = new ArrayList<>();

    public void loadLaptop(LapTops laptop) {
        loadLaptops(laptop);
    }

    public void loadLaptops(LapTops laptop) {
        this.laptopsList.add(laptop);
    }

    @Override
    public String toString() {
        return "TechnoStore " + laptopsList;
    }

    public void findLaptop() {
        Scanner scan = new Scanner(System.in);
        Map<String, Object> findChar = new HashMap<>();
        System.out.println("Enter a number of finding characteristics: ");
        System.out.println("1 - RAM");
        System.out.println("2 - SSD");
        System.out.println("3 - OS");
        System.out.println("4 - Screen diagonal");

        int inputChar = scan.nextInt();
        if (inputChar == 1) {
            System.out.println("Enter RAM capacity (min): ");
            int ram = scan.nextInt();
            findChar.put("ram", ram);
        }
        if (inputChar == 2) {
        System.out.println("Enter SSD capacity (min): ");
        int ssd = scan.nextInt();
        findChar.put("ssd", ssd);
        }
        if (inputChar == 3) {
            System.out.println("Enter OS (Windows, MacOS, Linux): ");
            String os = scan.next();
            findChar.put("os", os);
        }
        if (inputChar == 4) {
            System.out.println("Enter a screen diagonal (min): ");
            double diagonal = scan.nextInt();
            findChar.put("diagonal", diagonal);
        }
        if (inputChar > 4 || inputChar <= 0) {
            System.out.println("Invalid value!");
        }


        List<LapTops> foundLT = new ArrayList<>();
        for (LapTops laptop : laptopsList) {
            for (Map.Entry<String, Object> entry : findChar.entrySet()) {
                if (entry.getKey().equals("ram")) {
                    if (laptop.getRam() < (int) entry.getValue()) {
                        break;
                    }
                }
                if (entry.getKey().equals("ssd")) {
                    if (laptop.getSsd() < (int) entry.getValue()) {
                        break;
                    }
                }
                if (entry.getKey().equals("os")) {
                    if (!laptop.getOs().equalsIgnoreCase((String) entry.getValue())) {
                        break;
                    }
                }
                if (entry.getKey().equals("diagonal")) {
                    if (laptop.getDiagonal() < (double) entry.getValue()) {
                        break;
                    }
                }
                foundLT.add(laptop);
            }
        }
        System.out.println("Found laptops: ");
        for (LapTops laptop : foundLT) {
            System.out.println(laptop);
        }
    }
}

