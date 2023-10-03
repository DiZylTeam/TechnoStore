import java.util.*;

public class TechnoStore {
    private List<LapTops> laptopsList = new ArrayList<>();

    public void loadLaptop(LapTops laptop) {
        loadLaptops(laptop);
    }

    public  void loadLaptops(LapTops laptop) {
        this.laptopsList.add(laptop);
    }

    @Override
    public String toString() {
        return "TechnoStore {" +
                "laptopsList = " + laptopsList +
                '}';
    }

    //public static Map<String, Object> findChar = new HashMap<>();

    public void findLaptop() {
        Scanner scan = new Scanner(System.in);
        Map<String, Object> findChar = new HashMap<>();
        System.out.println("Enter a number corresponding to the following characteristics: ");
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
            double diagonal = scan.nextDouble();
            findChar.put("diagonal", diagonal);
        }
        System.out.println(findChar);

        List<LapTops> foundLT = new ArrayList<>();
        for (LapTops laptop: laptopsList) {
            boolean compliance = true;
            for (Map.Entry<String, Object> entry : findChar.entrySet()) {
                if (laptop.getRam() < (int) entry.getValue()) {
                    compliance = false;
                    break;
                }
                //break;
                if (laptop.getSsd() < (int) entry.getValue()) {
                    compliance = false;
                    break;
                }
                // break;
                if (!laptop.getOs().equalsIgnoreCase((String) entry.getValue())) {
                    compliance = false;
                    break;
                }
                //break;
                if (laptop.getDiagonal() < (double) entry.getValue()) {
                    compliance = false;
                    break;
                }
                //break;
            }
            if (compliance) {
                foundLT.add(laptop);
            }
        }
        System.out.println("Found laptops: ");
        for (LapTops laptop: foundLT) {
            System.out.println(laptop);
        }
    }
}
