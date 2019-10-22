public class Cercle extends Point {
    private double rayon;

    public Cercle(double x, double y, double rayon) {
        super(x, y);
        this.rayon = rayon;
    }

    public void deplaceCentre(double dx, double dy) {
        deplace(dx, dy);
    }

    public void changeRayon(double rayon) {
        this.rayon = rayon;
    }

    public Point point; // composition

    public Point getCentre() {
        return new Point(getX(), getY());
    }

    public String toString() {
        return "X: " + getX() + " Y: " + getY() + " Rayon: " + rayon;
    }
}