public class TestVoiture {
    public static void main(String[] args) {
        Voiture v = new Voiture("Honda", 10);
        v.demarrer();
        v.rouler(15);
        v.fairePlein(100);
        v.rouler(15);
        v.rouler(15);
        v.rouler(15);
        v.rouler(15);
        v.rouler(15);
        v.arreter();

    }
}