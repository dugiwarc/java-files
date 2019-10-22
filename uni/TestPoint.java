class Point {
    private int x = 0;
    private int y = 0;
    static int totalPoint = 0;
    int numeroOrdre = 0;

    public Point(int x, int y) {
        x = x;
        y = y;
        totalPoint++;
        numeroOrdre = totalPoint;
    }

    public Point creationPoint(int x, int y) {
        if (x > 0 && y > 0) {
            this.x = x;
            this.y = y;
        }
        return creationPoint(x, y);
    }

    public static boolean egalite(Point p1, Point p2) {
        if (p1 != null && p2 != null) {
            System.out.println(p1.x + " " + p2.x);
            return p1.x == p2.x && p1.y == p2.y;
        } else {
            System.out.println("Argument cannot be null");
            return false;
        }
    }

    public void getX() {
        System.out.println("X is " + this.x);
    }

    public void getY() {
        System.out.println("Y is " + this.y);
    }

    public boolean egaliteNonStatic(Point p) {
        if (p != null) {
            return p.x == x && p.y == y;
        } else {
            System.out.println("Argument cannot be null");
            return false;
        }
    }

    public String toString() {
        return "Point numero " + totalPoint + " " + " sur " + numeroOrdre;
    }
}

public class TestPoint {
    static public void main(String[] args) {
        Point p1 = new Point(10, 40);
        Point p2 = new Point(10, 80);
        Point p4 = new Point(1, 4);
        p2.getX();
        p2.getY();
        System.out.println(Point.egalite(p1, p4));

    }
}