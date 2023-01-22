package org.example;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;

public class laptop  {

    private int price;
    private int ram ;

    private BRAND brand;

    public laptop(int price, int ram, BRAND brand) {
        this.price = price;
        this.ram = ram;
        this.brand = brand;
    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public BRAND getBrand() {

        return brand;
    }



    @Override
    public String toString() {
        return "laptop{" +
                "price=" + price +
                ", ram=" + ram +
                ", brand='" + brand + '\'' +
                '}';
    }



}


