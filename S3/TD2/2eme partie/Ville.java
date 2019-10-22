public class Ville {
    protected String nom;
    protected int nbHabitants;

    public Ville(String nom) {
        this.nom = nom.toUpperCase();
    }

    public Ville(String nom, int nbHabitants) {
        this.nom = nom.toUpperCase();
        this.nbHabitants = nbHabitants > 0 ? nbHabitants : 0;
    }

    public String getNom() {
        return this.nom;
    }

    public int getNbHabitants() {
        return this.nbHabitants;
    }

    public void setNbHabitants(int nbHabitants) {
        this.nbHabitants = nbHabitants > 0 ? nbHabitants : 0;
    }

    public boolean nbHabitantsConnu() {
        return this.nbHabitants != 0 ? true : false;
    }

    public String categorie() {
        return this.nbHabitants == 0 ? "?" : (this.nbHabitants > 500000 ? "B" : (this.nbHabitants < 500000 ? "A" : ""));
    }

    public String toString() {
        return "Ville de " + getNom() + (nbHabitantsConnu() ? (" ; " + getNbHabitants() + " habitants") : ".");
    }
}