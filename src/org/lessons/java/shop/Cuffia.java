package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cuffia extends Prodotto {
    private String colore;
    private boolean isWireless;

    public Cuffia(String nome, String marca, BigDecimal prezzo, boolean fedeltà, String colore, boolean isWireless) {
        super(nome, marca, prezzo, fedeltà);
        this.colore = colore;
        this.isWireless = isWireless;
    }

    public String getColore() {
        return this.colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public boolean getIsWireless() {
        return this.isWireless;
    }

    public void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return String.format("Cuffia: '%s', con codice: %d, di colore: %s, wireless: %b, prezzo comprensivo di iva: %s", this.getNome(), this.getCodice(), this.colore, this.isWireless, this.getPrezzoConIva());
    }

    @Override
    public BigDecimal getPrezzoConIva() {
        BigDecimal prezzoConIva = this.getPrezzo().multiply(this.getIva()).add(this.getPrezzo());

        if (this.getFedeltà() == true && this.isWireless == false) {
            prezzoConIva = prezzoConIva.subtract(prezzoConIva.multiply(new BigDecimal("0.07")));
        } else if (this.getFedeltà() == true) {
            prezzoConIva = prezzoConIva.subtract(prezzoConIva.multiply(new BigDecimal("0.02")));
        }

        return prezzoConIva.setScale(2, RoundingMode.HALF_EVEN);
    }
}
