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
		
		System.out.println("Prezzo (Inserisci un numero con la virgola e due cifre decimali):");
		Double prezzo = scan.nextDouble();
		
		System.out.println(nome);
		System.out.println(prezzo);
	}
		
}


