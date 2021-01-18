package org.sid;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produit p1=new Produit(1L,"p1");
		Produit p2=new Produit(2L,"p2");
	    Commande cmd=Commande.passerCommande();
	    cmd.ajouterProduit(p1);
	    cmd.ajouterProduit(p2);
	    cmd.validation();
	    cmd.payment();
	    cmd.livraison();

	}

}
