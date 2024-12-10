public class Main {
    public static void main(String[] args) {
        IChemise chemiseService = new ChemiseImpl();
        IMontre montreService = new MontreImpl();

        // Saisie et affichage d'une chemise
        Chemise chemise = chemiseService.saisie();
        chemiseService.affichage(chemise);

        // Saisie et affichage d'une montre
        Montre montre = montreService.saisie();
        montreService.affichage(montre);
    }
}
