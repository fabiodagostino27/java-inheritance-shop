package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String marca;
    private BigDecimal prezzo;
    private BigDecimal iva;
    private boolean fedeltà;

    public Prodotto(String nome, String marca, BigDecimal prezzo, boolean fedeltà) {
        Random rand = new Random();
        this.codice = rand.nextInt(999);
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = new BigDecimal("0.22");
        this.fedeltà = fedeltà;
    }

    public int getCodice() {
        return this.codice;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public BigDecimal getPrezzo() {
        return this.prezzo;
    }
    
    public void setPrezzo(BigDecimal prezzo) {
        this.prezzo = prezzo;
    }

    public boolean getFedeltà() {
        return this.fedeltà;
    }
    
    public void setFedeltà(boolean fedeltà) {
        this.fedeltà = fedeltà;
    }

    public BigDecimal getPrezzoConIva() {
        BigDecimal prezzoConIva = this.prezzo.multiply(iva).add(this.prezzo).setScale(2, RoundingMode.HALF_EVEN);

        if (fedeltà == true) {
            return prezzoConIva.subtract(prezzoConIva.multiply(new BigDecimal("0.02"))).setScale(2, RoundingMode.HALF_EVEN);
        }

        return prezzoConIva;
    }

    public BigDecimal getIva() {
        return this.iva;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public String toString() {
        return String.format("Il nome del prodotto è '%s', con codice: '%d'", this.nome, this.codice);
    }
}
