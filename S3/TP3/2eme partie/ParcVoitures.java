public class ParcVoitures {

    static void tester(Voiture[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Demarrer la voiture " + (i + 1));
            tab[i].demarrer();
            tab[i].arreter();
        }
    }

    public static void main(String[] args) {
        Voiture[] tab = new Voiture[3];
        tab[0] = new Voiture("Chevrolet", 60);
        tab[1] = new Voiture("Porsche", 32);
        tab[2] = new Voiture("Mercedes", 0);
        tester(tab);
    }

}