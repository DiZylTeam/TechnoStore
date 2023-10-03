import java.util.Random;

public class LapTops {

    private int id;
    private String title;
    private int ram;
    private int ssd;
    private String os;
    private String color;
    private double diagonal;


    public LapTops(int id, String title, int ram, int ssd, String os, String color, double diagonal) {
        this.id = id;
        this.title = title;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
        this.diagonal = diagonal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }


    @Override
    public String toString() {
        return "LapTops{" +
                "id = " + id +
                ", title = " + title + '\'' +
                ", ram = " + ram +
                ", ssd = " + ssd +
                ", os = " + os + '\'' +
                ", color = " + color + '\'' +
                ", diagonal = " + diagonal +
                '}';
    }
}


