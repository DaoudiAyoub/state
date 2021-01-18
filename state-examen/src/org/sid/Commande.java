package org.sid;

import java.util.ArrayList;
import java.util.List;

public class Commande {
	private Etat etat;
	private Long id;
	private List<Produit> produits=new ArrayList<>();
	private Commande() {};
	
	public Etat getEtat() {
		return etat;
	}
	public void setEtat(Etat etat) {
		this.etat = etat;
	}
	public void ajouterProduit(Produit produit) {
		etat.ajouterProduit(produit);
	}
	public void retirerProduit(Produit produit) {
		etat.retireProduit(produit);
	}
	public void efface() {
		etat.efface();
	}
	public static Commande passerCommande() {
		Commande cmd= new Commande();
		cmd.setEtat(new EnAttente(cmd));
		return cmd;
	}
	public void annulerCommande() {
		etat.annulerCommande();
	}
	public void validation() {
		etat.valitation();
	}
	public void payment() {
		etat.payement();
	}
	public void livraison() {
		etat.livraison();
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
	
	
	
	
	

}
