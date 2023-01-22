package org.example;

import java.util.Comparator;
public enum BRAND {
    Lenuvo("Lenuvo"), Asos("Asos"), MacNote("MacNote"), Eser("Eser"), Xamiou("Xamiou");
        private String brand;
        BRAND (String br){
            this.brand=br;

        }
        public String getBrand() {
            return brand;
        }


        Comparator<BRAND> compareBRAND = new Comparator<BRAND>() {
            @Override
            public int compare(BRAND o1, BRAND o2) {
                return 0;
            }
        };
    }



