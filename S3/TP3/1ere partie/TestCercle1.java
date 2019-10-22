public class TestCercle1 {
    public static void main(String[] args) {
        Point pt1, pt2;
        Cercle c1, c2;

        pt1 = new Point(4.2, 7.3);
        pt2 = new Cercle(3.6, 7.84, 2.25);
        c1 = new Cercle(3.56, 7.84, 2.25);
        c2 = new Point(56.1, 76.9);

        pt1.deplace(0.5, 0.5);
        pt2.changeRayon(6.21);
        c1.deplace(0.4, 0.5);
        c1.changeRayon(2.52);
        c1.x = 4.78;
    }
}