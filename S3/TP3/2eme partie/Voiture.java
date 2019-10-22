public class Voiture {
    String modele;
    Moteur moteur;

    public Voiture(String modele) {
        this.modele = modele;
        moteur = new Moteur();
    }

    public Voiture(String modele, int carburant) {
        moteur = new Moteur(carburant);
        this.modele = modele;
    }

    public Voiture(String modele, Moteur moteur) {
        this.modele = modele;
        this.moteur = moteur;
    }

    public boolean demarrer() {
        return moteur.demarrer();
    }

    public void rouler(int consommationCarburantPrevue) {
        if (consommationCarburantPrevue > moteur.carburant)
            System.out.println("Panne d'essance");
        else
            moteur.utiliser(consommationCarburantPrevue);
    }

    public void arreter() {
        moteur.arreter();
    }

    public void fairePlein(int carburant) {
        moteur.fairePlein(carburant);
    }

}
