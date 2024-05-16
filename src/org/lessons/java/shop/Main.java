package org.lessons.java.shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Prodotto prodotto = new Prodotto();
		System.out.println(prodotto.getCodice());
		Scanner scan = new Scanner(System.in);
		
		// chiedo nome e prezzo del prodotto all'utente
		System.out.println("Inserisci i dati del nuovo prodotto.");
		System.out.println("Nome :");
		String nome = scan.nextLine();
		prodotto.setNome(nome);
		
		System.out.println("Prezzo (Inserisci un numero con la virgola e due cifre decimali):");
		Double prezzo = scan.nextDouble();
		scan.nextLine();
		prodotto.setPrezzo(prezzo);
		prodotto.calcolaIva(prezzo);
		Double iva = prodotto.getIva();
		
		System.out.println(nome);
		System.out.println(prezzo);
		
		System.out.println("Vuoi sapere il prezzo del prodotto compreso di iva? s/n");
		String printSn = scan.nextLine();
		
		if (printSn.equalsIgnoreCase("s")) {
			
			String prezzoTot = prodotto.prezzoTot(prezzo, iva);
			System.out.println("Il prezzo compreso di iva è :" + prezzoTot);
			
		} else if (printSn.equalsIgnoreCase("n")) {
			
			System.out.println("Hai scelto di non visualizzare il prodotto totale.");
			
		} else {
			
			System.out.println("Non hai selezionato un'opzione corretta.");
			
		}
		
		System.out.println("Vuoi sapere il nome del prodotto completo di codice? s/n");
		String printSn2 = scan.nextLine();
		
		if (printSn2.equalsIgnoreCase("s")) {
			
			String codice = prodotto.getCodice();
			String nomeCompleto = prodotto.stampaNome(codice, nome);
			System.out.println("Ecco il nome completo del prodotto :" + nomeCompleto );
			
		} else if (printSn2.equalsIgnoreCase("n")) {
			
			System.out.println("Hai scelto di non visualizzare il nome completo.");
		
		} else {
			
			System.out.println("Non hai selezionato un'opzione corretta.");
			
		}
		scan.close();
	}
		
}


