package org.sid;

public abstract class Etat {
	protected Commande commande;
	public Etat(Commande commande) {
		this.commande=commande;
	}
	public abstract void ajouterProduit(Produit produit);
	public abstract void efface();
	public abstract void retireProduit(Produit produit);
	public abstract void annulerCommande();
	public abstract void valitation();
	public abstract void payement();
	public abstract void livraison();

}
