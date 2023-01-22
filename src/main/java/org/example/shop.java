package org.example;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.ThreadLocalRandom;


public class shop {

    public static final int [] Pricearr = {100, 200, 300, 400, 500, 600, 700, 800};
    public static final int [] Ramearr = {4, 8, 16, 20, 24, 28, 32};
   public  static BRAND brand;



    public static void main(String[] args) {
        int i = 1;
        ArrayList<laptop> shop = new ArrayList<>();
        while (i < 10){
            shop.add(createLaptop());
            i++;
        }
        System.out.println(shop);
        sortPrice(shop);
        sortRam(shop);
        sortBrand(shop);
        resultSort(shop);

    }
    public static void resultSort(ArrayList<laptop>arrayList){
        System.out.println("----------------\nResult sort");
      arrayList.sort(Comparator.comparing(laptop::getPrice).thenComparing(laptop::getRam).thenComparing(laptop::getBrand));
        System.out.println(arrayList);

    }


   public static void sortBrand(ArrayList<laptop>arrayList){
       System.out.println("----------------\nSorted by brand");
       Collections.sort(arrayList, Comparator.comparing(laptop::getBrand));
       System.out.println(arrayList);

   }

    public static void sortPrice(ArrayList<laptop> arrayList){
        System.out.println("----------------\nSorted by price");
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size()-1; j++) {
                if (arrayList.get(j).getPrice() > arrayList.get(j + 1).getPrice()) {
                    laptop temp = arrayList.get(j);
                    arrayList.remove(j);
                    arrayList.add(j, arrayList.get(j));
                    arrayList.remove(j + 1);
                    arrayList.add(j + 1, temp);
                }
            }
        }
        System.out.println(arrayList);

    }
    public static void sortRam(ArrayList<laptop> arrayList){
        System.out.println("----------------\nSorted by ram");
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size()-1; j++) {
                if (arrayList.get(j).getRam() > arrayList.get(j+1).getRam()){
                    laptop temp = arrayList.get(j);
                    arrayList.remove(j);
                    arrayList.add(j, arrayList.get(j));
                    arrayList.remove(j + 1);
                    arrayList.add(j + 1, temp);
                }
            }
        }
        System.out.println(arrayList);

    }



    public static laptop createLaptop(){
        laptop lp = new laptop(Pricearr[addRandomPrice()],Ramearr[addRandomRam()],addRandomBrand());
        return lp;
    }

    public static BRAND addRandomBrand(){
        int index = ThreadLocalRandom.current().nextInt(BRAND.values().length);
        for (BRAND brand: BRAND.values()) {
            if (index == brand.ordinal()){
                return brand;
            }
        }
        return null;
    }


    public static int addRandomRam(){
        return ThreadLocalRandom.current().nextInt(Ramearr.length);
    }
    //random cost
    public static int addRandomPrice() {
        return ThreadLocalRandom.current().nextInt(Pricearr.length);
    }}

