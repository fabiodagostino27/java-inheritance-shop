package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto {
    private int dimensionInPollici;
    private boolean isSmart;

    public Televisore(String nome, String marca, BigDecimal prezzo, int dimensionInPollici, boolean isSmart) {
        super(nome, marca, prezzo);
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
        return String.format("Televisore: '%s', con codice: %d, di pollici: %d, smart: %b, prezzo comprensivo di iva: %s", this.getNome(), this.getCodice(), this.dimensionInPollici, this.isSmart, this.getPrezzoConIva());
    }
}
