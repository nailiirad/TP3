import java.util.Date;
import java.util.Scanner;

public class testPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProduitAlimentaire produit1 = new ProduitAlimentaire();
        ProduitAlimentaire produit2 = new ProduitAlimentaire();

        /*ProduitAlimentaire produit1 = new ProduitAlimentaire(1021, "Lait", "Delice",0);
        ProduitAlimentaire produit2 = new ProduitAlimentaire(2510, "Yaourt", "Vitalait",0);*/

        ProduitAlimentaire produit3 = new ProduitAlimentaire(3250, "Tomate", "Sicam", 1.200);

        produit1.afficher("produit1");
        produit2.afficher("produit2");
        produit3.afficher("produit3");

        produit1.setPrix(0.700);
        System.out.println("       ==> Produit modifié <==");
        produit1.afficher("produit1");

        produit1.setIdentifiant(1021);
        produit1.setLibelle("lait");
        produit1.setMarque("delice");

        produit2.setIdentifiant(2510);
        produit2.setLibelle("yaourt");
        produit2.setMarque("vitalait");
        produit2.setPrix(0.600);

        System.out.println("       ==> Produit modifié <==");
        produit1.afficher("produit1");
        produit2.afficher("produit2");

        /*Date expirationDate1 = new Date(01/06/2024);
        Date expirationDate2 = new Date(01/06/2024);
        Date expirationDate3 = new Date(01/06/2024);*/

        produit1.setDateExpiration(new Date(124, 5, 1));
        produit2.setDateExpiration(new Date(124, 5, 1));
        produit3.setDateExpiration(new Date(124, 5, 1));

        System.out.println("       ==> Produits <==");
        System.out.println(produit1);
        System.out.println(produit2);
        System.out.println(produit3);

        System.out.println("Ajouter un nouveau produit ? (Oui/Non)");
        String response = scanner.next();

        if (response.equalsIgnoreCase("Oui")) {
            ProduitAlimentaire nouveauProduit = ProduitAlimentaire.createProduit();
            nouveauProduit.afficher("Nouveau Produit");
        }

    }
}