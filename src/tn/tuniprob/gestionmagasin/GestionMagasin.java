package tn.tuniprob.gestionmagasin;

import java.util.ArrayList;

public class GestionMagasin {
    public static void main(String[] args) {
        Produit produit1 = new Produit("Produit A", 10.5);
        Produit produit2 = new Produit("Produit B", 20.0);

        Magasin magasin1 = new Magasin(1, "Adresse 1", 3);
        Magasin magasin2 = new Magasin(2, "Adresse 2", 5);

        magasin1.ajouterProduit(produit1);
        magasin1.ajouterProduit(produit2);

        magasin2.ajouterProduit(new Produit("Produit C", 15.75));

        magasin1.afficherCaracteristiques();
        System.out.println("------------");
        magasin2.afficherCaracteristiques();

        ArrayList<Magasin> magasins = new ArrayList<>();
        magasins.add(magasin1);
        magasins.add(magasin2);

        int totalProduits = Magasin.getTotalProduits(magasins);
        System.out.println("Nombre total de produits dans tous les magasins : " + totalProduits);
    }
}
