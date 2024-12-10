import java.util.Scanner;

public class Produitlmpl implements IProduit {

    @Override
    public Produit saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la référence : ");
        String ref = scanner.nextLine();

        System.out.print("Entrez le libellé : ");
        String libelle = scanner.nextLine();

        System.out.print("Entrez la quantité : ");
        double quantite = scanner.nextDouble();

        System.out.print("Entrez le prix : ");
        int prix = scanner.nextInt();

        return new Produit(ref, libelle, quantite, prix);
    }

    @Override
    public void affichage(Produit produit) {
        System.out.println("Détails du produit :");
        System.out.println(produit.toString());
    }
}
