package advancejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Laptop1 implements Comparable<Laptop>{
    private String brand;
    private int ram;
    private int price;

    public Laptop1(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Laptop laps) {
        if (this.price > laps.getPrice()){
            return 1;
        }
        else if (this.price < laps.getPrice())
            return -1;
        else
            return 0;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Laptop1> laptops = new ArrayList<>();

        laptops.add(new Laptop1("Lenovo", 4, 35000));
        laptops.add(new Laptop1("Lenovo", 8, 45000));
        laptops.add(new Laptop1("Apple", 8, 70000));
        laptops.add(new Laptop1("HP", 4, 55000));

        Collections.sort(laptops, (i, j)-> i.getRam() > j.getRam() ?1:-1);

        for (Laptop1 lapy : laptops) {
            System.out.println(lapy);
        }    }
}