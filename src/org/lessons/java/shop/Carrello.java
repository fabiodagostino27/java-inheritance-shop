package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hai una tessera fedeltà? Rispondi con 'y' per sì e 'n' per no: ");
        String inputFedeltà = sc.nextLine();
        boolean fedeltà = false;
        
        if (inputFedeltà.equals("y")) {
            fedeltà = true;
        }

        System.out.print("Quanti prodotti vuoi mettere nel carrello? ");
        int numeroProdotti = sc.nextInt();
        Prodotto[] arrayProdotti = new Prodotto[numeroProdotti];
        sc.nextLine();

        for (int i = 0; i < arrayProdotti.length; i++) {
            System.out.print("Decidi tra 'tv', 'cuffia' e 'smartphone': ");
            String tipoProdotto = sc.nextLine();
            
            System.out.print("Qual è il nome del prodotto? ");
            String nome = sc.nextLine();

            System.out.print("Qual è la marca del prodotto? ");
            String marca = sc.nextLine();

            System.out.print("Qual è il prezzo del prodotto? ");
            BigDecimal prezzo = sc.nextBigDecimal();

            if (tipoProdotto.equals("tv")) {
                System.out.print("Di quanti pollici è il televisore? ");
                int dimensionInPollici = sc.nextInt();

                sc.nextLine();

                System.out.print("È un televisore smart? Rispondi con 'y' per sì e 'n' per no: ");
                String inputIsSmart = sc.nextLine();
                boolean isSmart;

                if (inputIsSmart.equals("y")) {
                    isSmart = true;
                } else {
                    isSmart = false;
                }

                Televisore tv = new Televisore(nome, marca, prezzo, fedeltà, dimensionInPollici, isSmart);

                arrayProdotti[i] = tv;
            } else if (tipoProdotto.equals("cuffia")) {
                System.out.print("Di che colore sono le cuffie? ");
                String colore = sc.nextLine();

                sc.nextLine();

                System.out.print("Sono cuffie wireless? Rispondi con 'y' per sì e 'n' per no: ");
                String inputIsWireless = sc.nextLine();
                boolean isWireless;

                if (inputIsWireless.equals("y")) {
                    isWireless = true;
                } else {
                    isWireless = false;
                }

                Cuffia cuffie = new Cuffia(nome, marca, prezzo, fedeltà, colore, isWireless);
                arrayProdotti[i] = cuffie;
            } else if (tipoProdotto.equals("smartphone")) {
                System.out.print("Di qunati gb è la memoria dello smartphone? ");
                int memoria = sc.nextInt();

                sc.nextLine();

                Smartphone smartphone = new Smartphone(nome, marca, prezzo, fedeltà, memoria);
                arrayProdotti[i] = smartphone;
            }

            if (arrayProdotti.length != 1 || i < arrayProdotti.length - 1) {
                System.out.println("Prodotto salvato con successo! Passiamo al prossimo!");
            }
        }

        System.out.println("-");
        System.out.println("Ecco il tuo carrello: ");
        for (int i = 0; i < arrayProdotti.length; i++) {
            System.out.println((i + 1) + " - " + arrayProdotti[i]);
        }

        sc.close();
    }
}
