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

            if (tipoProdotto.equals("tv")) {
                System.out.print("Di quanti pollici è il televisore?");
                int dimensionInPollici = sc.nextInt();

                System.out.print("È un televisore smart? Rispondi con 'y' per sì e 'n' per no: ");
                String inputIsSmart = sc.nextLine();
                boolean isSmart;

                if (inputIsSmart.equals("y")) {
                    isSmart = true;
                } else {
                    isSmart = false;
                }

                Televisore tv = new Televisore(nome, marca, prezzo, dimensionInPollici, isSmart);
            }
        }

        sc.close();
    }
}
