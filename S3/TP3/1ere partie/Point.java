public class Point {
    protected double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void deplace(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "Point de coordonnees : " + x + ", " + y;
    }
}