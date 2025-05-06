package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto {
    private int dimensionInPollici;
    private boolean isSmart;

    public Televisori(String nome, String marca, BigDecimal prezzo, BigDecimal iva, int dimensionInPollici, boolean isSmart) {
        super(nome, marca, prezzo, iva);
        this.dimensionInPollici = dimensionInPollici;
        this.isSmart = isSmart;
    }

    public int getPollici() {
        return this.dimensionInPollici;
    }

    public void setPollici(int dimensionInPollici) {
        this.dimensionInPollici = dimensionInPollici;
    }

    public boolean getIsSmart() {
        return this.isSmart;
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return String.format("Televisore: '%s', con codice: %d, di pollici: %d, smart: %b", this.getNome(), this.getCodice(), this.dimensionInPollici, this.isSmart);
    }
}
