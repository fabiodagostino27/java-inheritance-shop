package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Televisore extends Prodotto {
    private int dimensionInPollici;
    private boolean isSmart;

    public Televisore(String nome, String marca, BigDecimal prezzo, boolean fedeltà, int dimensionInPollici, boolean isSmart) {
        super(nome, marca, prezzo, fedeltà);
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

    @Override
    public BigDecimal getPrezzoConIva() {
        BigDecimal prezzoConIva = this.getPrezzo().multiply(this.getIva()).add(this.getPrezzo());

        if (this.getFedeltà() == true && this.isSmart == false) {
            prezzoConIva = prezzoConIva.subtract(prezzoConIva.multiply(new BigDecimal("0.10")));
        } else if (this.getFedeltà() == true) {
            prezzoConIva = prezzoConIva.subtract(prezzoConIva.multiply(new BigDecimal("0.02")));
        }

        return prezzoConIva.setScale(2, RoundingMode.HALF_EVEN);
    }
}
