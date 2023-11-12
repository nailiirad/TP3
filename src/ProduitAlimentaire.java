import java.util.Date;
import java.util.Scanner;

public class ProduitAlimentaire {
    private int identifiant;
    private String libelle;
    private String marque;
    private double prix;
    private Date dateExpiration;
    public ProduitAlimentaire() {
    }

    public ProduitAlimentaire(int identifiant, String libelle, String marque, double prix) {
        this.identifiant = identifiant;
        this.libelle = libelle;
        this.marque = marque;
        this.prix = prix;
    }

    public void afficher(String P) {
        System.out.println("    *** " + P + " ***");
        System.out.println("Identifiant : " + identifiant);
        System.out.println("Libellé : " + libelle);
        System.out.println("Marque : " + marque);
        System.out.println("Prix : " + prix);
        System.out.println("Date d'Expiration : " + (dateExpiration != null ? dateExpiration : "Non spécifiée"));
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double nouveauPrix) {
        if (prix >= 0) {
            this.prix = nouveauPrix;
        } else {
            System.out.println("Le prix ne peut pas être négatif. Le prix n'a pas été modifié.");
        }
    }
    public void setMarque(String nouveauMarque) {
        marque = nouveauMarque;
    }
    public void setLibelle(String nouveauLibelle) {
        libelle = nouveauLibelle;
    }
    public void setIdentifiant(int nouveauIdentifiant) {
        identifiant = nouveauIdentifiant;
    }

    public void setDateExpiration(Date date) {
        dateExpiration = date;
    }

    public String toString() {
        return "Identifiant : " + identifiant + ", Libellé : " + libelle + ", Marque : " + marque + ", Prix : " + prix + ", date d'expiration: " + (dateExpiration != null ? dateExpiration : "Non spécifiée");
    }

    public static ProduitAlimentaire createProduit() {
        Scanner scanner = new Scanner(System.in);
        ProduitAlimentaire produit = new ProduitAlimentaire();

        System.out.println("Création d'un nouveau produit :");
        System.out.print("Identifiant : ");
        produit.setIdentifiant(scanner.nextInt());

        scanner.nextLine();
        System.out.print("Libellé : ");
        produit.setLibelle(scanner.nextLine());

        System.out.print("Marque : ");
        produit.setMarque(scanner.nextLine());

        System.out.print("Prix : ");
        produit.setPrix(scanner.nextDouble());

        return produit;
    }
}