package advancejava.collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Laptop implements Comparable<Laptop>{
    private String brand;
    private int ram;
    private int price;

    public Laptop(String brand, int ram, int price) {
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

public class ComparableDemo {
    public static void main(String[] args) {
        List<Laptop> laptops = new ArrayList<>();
        List<Integer> values = new ArrayList<>();

        laptops.add(new Laptop("Lenovo", 4, 35000));
        laptops.add(new Laptop("Lenovo", 8, 45000));
        laptops.add(new Laptop("Dell", 4, 30000));
        laptops.add(new Laptop("Apple", 8, 70000));
        laptops.add(new Laptop("HP", 4, 55000));

        values.add(12345);
        values.add(123456);
        values.add(1234567);
        values.add(1);
        values.add(12);
        values.add(123);
        values.add(1234);


        Collections.sort(values, (i, j)-> i<j?1:-1);
        for (Integer i:values) {
            System.out.println(i);
        }
        Collections.sort(laptops);

        for (Laptop lapy : laptops) {
            System.out.println(lapy);
        }    }
}
