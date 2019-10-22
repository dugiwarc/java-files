public class TestCercle {
    public static void main(String[] args) {
        Cercle c = new Cercle(3, 8, 2.5);
        System.out.println(c);
        c.deplaceCentre(1, 0.5);
        c.changeRayon(5.25);
        System.out.println(c);
        Point pt = c.getCentre();
        System.out.println(pt);
    }
}