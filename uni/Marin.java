public class Marin implements Comparable<Marin> {
    private String nom, prenom;

    public int compareTo(Marin marin) {
        class MarinComparator implements Comparator<Marin> {
            public int compare(Marin m1, Marin m2) {
                int order = m1.nom.compareTo(m2.nom);
                return order != 0 ? order : m1.prenom.compareTo(m2.prenom);
            }
        }
        return (new MarinComparator()).compare(this, marin);
    }
}