import java.util.Scanner;
public class Employe extends Personne {
    private String fonction;
    private int salaire;

    public Employe() {}
    public Employe(String fonction, int salaire, String nom, String prenom) {
        super(nom, prenom);
        this.fonction = fonction;
        this.salaire = salaire;
    }

    public String getFonction() { return fonction; }
    public void setFonction(String fonction) { this.fonction = fonction; }

    public int getSalaire() { return salaire; }
    public void setSalaire(int salaire) { this.salaire = salaire; }


    public void saisie() {
        super.saisie();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la fonction : ");
        this.fonction = scanner.nextLine();
        System.out.print("Entrez le salaire : ");
        this.salaire = scanner.nextInt();
    }

    public void affiche() {
        super.affiche();
        System.out.println("Fonction : " + this.fonction + ", Salaire : " + this.salaire);
    }
}
