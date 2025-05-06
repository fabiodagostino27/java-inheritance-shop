package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffia extends Prodotto {
    private String colore;
    private boolean isWireless;

    public Cuffia(String nome, String marca, BigDecimal prezzo, BigDecimal iva, String colore, boolean isWireless) {
        super(nome, marca, prezzo, iva);
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
        return String.format("Cuffia: '%s', con codice: %d, di colore: %s, wireless: %b", this.getNome(), this.getCodice(), this.colore, this.isWireless);
    }
}
