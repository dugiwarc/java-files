public class Moteur {
    int carburant;

    public Moteur() {
        carburant = 0;
    }

    public Moteur(int quantCarburant) {
        carburant = quantCarburant;
    }

    public boolean demarrer() {
        carburant -= 1;
        if (carburant > 0) {
            System.out.println("Moteur demarre avec " + carburant + " litres");
            return true;
        } else {
            System.out.println("Panne d'essance");
            return false;
        }
    };

    public int utiliser(int montantCarburant) {
        carburant -= montantCarburant;
        System.out.println("Moteur utilise " + montantCarburant + " litres");
        return carburant;
    };

    public void arreter() {
        System.out.println("Moteur arrete. Carburant qui rest: " + ((carburant < 0) ? 0 : carburant));
    };

    public void fairePlein(int montantCarburantAjoutee) {
        carburant += montantCarburantAjoutee;
        System.out.println("Plein avec " + carburant + " litres");
    };
}