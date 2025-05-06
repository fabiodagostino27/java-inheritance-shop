package org.lessons.java.shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Smartphone iPhone16 = new Smartphone("Iphone 16", "Apple", new BigDecimal("999.99"), new BigDecimal("22"), 128);

        System.out.println(iPhone16);
    }
}
