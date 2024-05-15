package org.lessons.java.shop;


/*Un prodotto è caratterizzato da: - codice (numero intero) - nome - descrizione - prezzo - iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi 
di “utilità” per fare in modo che: 

- il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome 
Nello stesso package aggiungete una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.
BONUS: create un metodo (statico) che restituisca il codice con un pad left di 0 per arrivare a 8 caratteri 
(ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è)*/

public class Prodotto {
	private String codice;
	private String nome;
	private String descrizione;
	private double prezzo;
	private double iva;

	// costruttore
	public Prodotto() {
		this.codice = generaCodice();
		/* li prendo in input dall'utente tramite metodi
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.iva = iva;
		*/		
	}
	
	// - alla creazione di un nuovo prodotto il codice sia valorizzato con un numero random 

	private String generaCodice() {
		
		double random = Math.random();
		return String.valueOf(random);
		}
	
	// - il prodotto esponga un metodo per avere il prezzo base 
	public void stampaPrezzo() {
		String prezzoString = prezzo + "";
		System.out.println("Il prezzo base del prodotto è: " + prezzoString);
	}
	
	// - il prodotto esponga un metodo per avere il prezzo comprensivo di iva 
	public double calcolaIva(Double prezzo) {
		iva = prezzo * 22 / 100 ;
		return iva;
	}
	
	public String prezzoTot(Double prezzo, Double iva) {
		Double prezzoTot = prezzo + iva;
		String prezzoTotString = prezzoTot + "";
		return prezzoTotString;
	}
	
	// - il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome 
	public String stampaNome(String codice, String nome) {
		String codiceNome = codice + "-" + nome;
		return codiceNome;
	}

	// - il codice prodotto sia accessibile solo in lettura 
	// - gli altri attributi siano accessibili sia in lettura che in scrittura 

	public String getCodice() {
		return codice;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public double getIva() {
		return iva;
	}
}



	