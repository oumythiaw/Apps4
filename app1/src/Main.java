public class Main {
    public static void main(String[] args) {
        System.out.println("---- Employé ----");
        Employe employe = new Employe();
        employe.saisie();
        employe.affiche();

        System.out.println("\n---- Étudiant ----");
        Etudiant etudiant = new Etudiant();
        etudiant.saisie();
        etudiant.affiche();
    }
}
