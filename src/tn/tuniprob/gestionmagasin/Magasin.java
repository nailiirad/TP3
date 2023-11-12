package tn.tuniprob.gestionmagasin;

import java.util.ArrayList;

public class Magasin {
    private int identifiant;
    private String adresse;
    private int capacite;
    private ArrayList<Produit> produits;

    public Magasin(int identifiant, String adresse, int capacite) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        if (produits.size() < capacite) {
            produits.add(produit);
        } else {
            System.out.println("Le magasin est plein, impossible d'ajouter plus de produits.");
        }
    }

    public void afficherCaracteristiques() {
        System.out.println("Identifiant du magasin : " + identifiant);
        System.out.println("Adresse du magasin : " + adresse);
        System.out.println("Capacité du magasin : " + capacite);
        System.out.println("Produits dans le magasin :");
        for (Produit produit : produits) {
            System.out.println("Nom : " + produit.getNom() + ", Prix : " + produit.getPrix());
        }
    }

    public static int getTotalProduits(ArrayList<Magasin> magasins) {
        int totalProduits = 0;
        for (Magasin magasin : magasins) {
            totalProduits += magasin.produits.size();
        }
        return totalProduits;
    }
}
