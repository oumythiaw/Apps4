import java.util.Scanner;

public class Personne {
    protected String nom;
    protected String prenom;

    public Personne() {}

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom : ");
        this.nom = scanner.nextLine();

        System.out.print("Entrez le prénom : ");
        this.prenom = scanner.nextLine();
    }

    public void affiche() {
        System.out.println("Nom : " + this.nom + ", Prénom : " + this.prenom);
    }
}
