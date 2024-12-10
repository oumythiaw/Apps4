import java.util.Scanner;

public class Montrelmpl implements IMontre {
    public Montre saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'ID : ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consommer le saut de ligne

        System.out.print("Entrez le libellé : ");
        String lib = scanner.nextLine();

        System.out.print("Entrez la nature : ");
        String nature = scanner.nextLine();

        return new Montre(id, lib, nature);
    }

    @Override
    public void affichage(Montre m) {
        System.out.println("Détails de la montre : " + m);
    }
}
