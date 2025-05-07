package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Prodotto {
    private long imei;
    private int memoria;

    public Smartphone(String nome, String marca, BigDecimal prezzo, int memoria) {
        super(nome, marca, prezzo);
        Random rand = new Random();
        this.imei = rand.nextLong(999999999999999l);
        this.memoria = memoria;
    }

    public long getImei() {
        return this.imei;
    }

    public void setImei(long imei) {
        this.imei = imei;
    }

    public int getMemoria() {
        return this.memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return String.format("Smartphone: '%s', con codice: %d e imei: %d", this.getNome(), this.getCodice(), this.imei);
    }
}
