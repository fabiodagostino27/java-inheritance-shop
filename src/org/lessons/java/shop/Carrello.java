package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quanti prodotti vuoi mettere nel carrello? ");
        int numeroProdotti = sc.nextInt();
        Prodotto[] lunghezzaArrayProdotti = new Prodotto[numeroProdotti];
        sc.nextLine();

        for (int i = 0; i < lunghezzaArrayProdotti.length; i++) {
            System.out.print("Decidi tra 'tv', 'cuffia' e 'smartphone': ");
            String tipoProdotto = sc.nextLine();
            
            System.out.print("Qual è il nome del prodotto? ");
            String nome = sc.nextLine();

            System.out.print("Qual è la marca del prodotto? ");
            String marca = sc.nextLine();

            System.out.print("Qual è il prezzo del prodotto? ");
            BigDecimal prezzo = sc.nextBigDecimal();
        }

        sc.close();
    }
}
