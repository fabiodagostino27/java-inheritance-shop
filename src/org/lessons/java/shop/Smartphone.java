package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Smartphone extends Prodotto {
    private long imei;
    private int memoria;

    public Smartphone(String nome, String marca, BigDecimal prezzo, boolean fedeltà, int memoria) {
        super(nome, marca, prezzo, fedeltà);
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
        return String.format("Smartphone: '%s', con codice: %d e imei: %d, prezzo comprensivo di iva: %s", this.getNome(), this.getCodice(), this.imei, this.getPrezzoConIva());
    }

    @Override
    public BigDecimal getPrezzoConIva() {
        BigDecimal prezzoConIva = this.getPrezzo().multiply(this.getIva()).add(this.getPrezzo());

        if (this.getFedeltà() == true && this.memoria < 32) {
            prezzoConIva = prezzoConIva.subtract(prezzoConIva.multiply(new BigDecimal("0.05")));
        } else if (this.getFedeltà() == true) {
            prezzoConIva = prezzoConIva.subtract(prezzoConIva.multiply(new BigDecimal("0.02")));
        }

        return prezzoConIva.setScale(2, RoundingMode.HALF_EVEN);
    }
}
