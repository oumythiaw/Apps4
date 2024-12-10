public class Main {
    public static void Main(String[] args) {
        IProduit produitService = new Produitlmpl();

        // Saisir un produit
        Produit produit = produitService.saisie();

        // Afficher le produit
        produitService.affichage(produit);
    }
}
