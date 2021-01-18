package org.sid;

import java.util.List;

public class Produit {
	private Long id;
	private String libelle;
	private List<Commande> commandes;
	public Produit(Long id, String libelle) {
		super();
		this.id = id;
		this.libelle = libelle;
	}
	
	

}
