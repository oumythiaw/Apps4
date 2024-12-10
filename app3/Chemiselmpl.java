import java.util.Scanner;

import java.util.Scanner;

public class Chemiselmpl implements IChemise {

    public Chemise saisie() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez l'ID : ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consommer le saut de ligne

        System.out.print("Entrez le libellé : ");
        String lib = scanner.nextLine();

        System.out.print("Entrez la couture : ");
        String couture = scanner.nextLine();

        return new Chemise(id, lib, couture);
    }
    public void affichage(Chemise c) {
        System.out.println("Détails de la chemise : " + c);
    }
}

