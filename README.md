# Produit Alimentaire
Le code fourni définit un programme Java pour gérer des produits alimentaires. Il contient une classe `ProduitAlimentaire` qui permet aux utilisateurs de créer, modifier et afficher des informations sur les produits, y compris une date d'expiration. Le programme principal (`testPA`) démontre l'utilisation de la classe en créant et en gérant des instances de produits. Les utilisateurs peuvent ajouter de nouveaux produits de manière dynamique via une entrée utilisateur.

* Les méthode utilisée dans le code :

1. `afficher(String P)`: Affiche les détails d'un produit en incluant un titre personnalisé.
2. `setPrix(double nouveauPrix)`: Modifie le prix d'un produit.
3. `setMarque(String nouveauMarque)`: Modifie la marque d'un produit.
4. `setLibelle(String nouveauLibelle)`: Modifie le libellé d'un produit.
5. `setIdentifiant(int nouveauIdentifiant)`: Modifie l'identifiant d'un produit.
6. `setDateExpiration(Date date)`: Définit la date d'expiration d'un produit.
7. `createProduit()`: Permet à l'utilisateur de créer un nouveau produit avec des informations saisies au clavier.
8. `response.equalsIgnoreCase("Oui")`: Vérifie si l'utilisateur souhaite ajouter un nouveau produit en acceptant "Oui" ou "Non" comme réponse.
