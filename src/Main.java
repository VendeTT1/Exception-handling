import projet.EntierNaturel;
import projet.NombreNegatifException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        try {
            // Test du constructeur avec une valeur valide
            System.out.println("Création d'un entier naturel avec la valeur 3:");
            EntierNaturel en = new EntierNaturel(3);
            System.out.println("Valeur actuelle: " + en.getVal());

            // Test de setVal avec une valeur invalide
            System.out.println("\nTentative de modification avec une valeur négative (-1):");
            try {
                en.setVal(-1);
            } catch (NombreNegatifException e) {
                System.out.println("Erreur: " + e.getMessage());
                System.out.println("Valeur négative tentée: " + e.getNombreNegatif());
            }

            // Test de décrémentation jusqu'à 0 et au-delà
            System.out.println("\nTest de décrémentation:");
            while (true) {
                System.out.println("Valeur avant décrémentation: " + en.getVal());
                try {
                    en.decrementer();
                    System.out.println("Valeur après décrémentation: " + en.getVal());
                } catch (NombreNegatifException e) {
                    System.out.println("Impossible de décrémenter davantage: " + e.getMessage());
                    break;
                }
            }

            // Test du constructeur avec une valeur invalide
            System.out.println("\nTentative de création avec une valeur négative (-5):");
            EntierNaturel en2 = new EntierNaturel(-5);

        } catch (NombreNegatifException e) {
            System.out.println("Erreur: " + e.getMessage());
            System.out.println("Valeur négative tentée: " + e.getNombreNegatif());
        }
    }

}
