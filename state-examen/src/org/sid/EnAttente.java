package org.sid;

public class EnAttente extends Etat {

	public EnAttente(Commande commande) {
		super(commande);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ajouterProduit(Produit produit) {
		// TODO Auto-generated method stub
		commande.getProduits().add(produit);
	}

	@Override
	public void efface() {
		// TODO Auto-generated method stub
		commande.getProduits().clear();
		
	}

	@Override
	public void retireProduit(Produit produit) {
		// TODO Auto-generated method stub
		if(commande.getProduits().contains(produit)) {
		commande.getProduits().remove(produit);
		}
		else throw new IllegalStateException("le produit n'existe pas");
	}

	@Override
	public void annulerCommande() {
		// TODO Auto-generated method stub
		commande=null;
	}

	@Override
	public void valitation() {
		// TODO Auto-generated method stub
		commande.setEtat(new Valide(commande));
		
	}

	@Override
	public void payement() {
		// TODO Auto-generated method stub
        throw new IllegalStateException("***Error***");

	}

	@Override
	public void livraison() {
		// TODO Auto-generated method stub
        throw new IllegalStateException("***Error***");

	}

}
