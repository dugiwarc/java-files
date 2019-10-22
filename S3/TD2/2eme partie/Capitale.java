public class Capitale extends Ville {
    public String pays;

    public Capitale(String nom, String pays, int nbHabitants) {
        super(nom, nbHabitants);
        this.pays = pays;
    }

    public Capitale(String nom, String pays) {
        super(nom);
        this.pays = pays;
    }

    public String categorie() {
        return this.pays != null ? "C" : super.categorie();
    }

    public String toString() {
        return "Ville de " + getNom() + (nbHabitantsConnu() ? (" ; " + getNbHabitants() + " habitants. ") : ".")
                + "Capitale de " + pays;
    }

}