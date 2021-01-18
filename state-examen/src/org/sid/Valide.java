package org.sid;

public class Valide extends Etat {

	public Valide(Commande commande) {
		super(commande);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ajouterProduit(Produit produit) {
		// TODO Auto-generated method stub
		throw new IllegalStateException("***Error***");
	}

	@Override
	public void efface() {
		// TODO Auto-generated method stub
		commande.getProduits().clear();
	}

	@Override
	public void retireProduit(Produit produit) {
		// TODO Auto-generated method stub
		throw new IllegalStateException("***Error***");
	}

	@Override
	public void annulerCommande() {
		// TODO Auto-generated method stub
		throw new IllegalStateException("***Error***");
	}

	@Override
	public void valitation() {
		// TODO Auto-generated method stub
		throw new IllegalStateException("***Error***");
	}

	@Override
	public void payement() {
		// TODO Auto-generated method stub
		commande.setEtat(new Payee(commande));
	}

	@Override
	public void livraison() {
		// TODO Auto-generated method stub
		throw new IllegalStateException("***Error***");
	}

}
