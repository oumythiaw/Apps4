import java.util.Scanner;
public class Etudiant extends Personne {
    private String matricule;
    private double moyenne;

    public Etudiant() {}
    public Etudiant(double moyenne, String nom, String prenom) {
        super(nom, prenom);
        this.moyenne = moyenne;
        this.matricule = generateMatricule();
    }
    public String getMatricule() { return matricule; }
    public double getMoyenne() { return moyenne; }
    public void setMoyenne(double moyenne) { this.moyenne = moyenne; }

    public String generateMatricule() {
        return "ET" + System.currentTimeMillis();
    }
    public void saisie() {
        super.saisie();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez la moyenne : ");
        this.moyenne = scanner.nextDouble();
        this.matricule = generateMatricule();
    }

    public void affiche() {
        super.affiche();
        System.out.println("Matricule : " + this.matricule + ", Moyenne : " + this.moyenne);
    }
}
