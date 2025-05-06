package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Smartphone iPhone16 = new Smartphone("Iphone 16", "Apple", new BigDecimal("999.99"), new BigDecimal("22"), 128);
        Televisori LGSmart = new Televisori("LG SmartTv", "LG", new BigDecimal("599.99"), new BigDecimal("22"), 43, true);

        System.out.println(iPhone16);
        System.out.println(LGSmart);
    }
}
