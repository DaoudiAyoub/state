package org.sid;

public class Payee extends Etat {

	public Payee(Commande commande) {
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
		throw new IllegalStateException("***Error***");
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
		throw new IllegalStateException("***Error***");
	}

	@Override
	public void livraison() {
		// TODO Auto-generated method stub
		commande.setEtat(new Livree(commande));
	}

}
