import java.io.*;

class Point {
    private int x = -1;
    private int y;
    static private int totalPoint = 0;
    private int numeroOrdre = 0;
    final String nom;

    private Point(int x, int y) {
        totalPoint++;
        numeroOrdre = totalPoint;
        this.x = x;
        this.y = y;
        this.nom = "George";
    }

    public static boolean egalite(Point p1, Point p2) {
        if (p1 == null || p2 == null)
            return false;
        if (p1.x == p2.x && p1.y == p2.y)
            return true;
        else
            return false;
    }

    public boolean egalite(Point p) {
        if (p == null)
            return false;
        if (p.x == this.x && p.y == this.y)
            return true;
        return false;
    }

    public static Point creationPoint(int x, int y) {
        if (x < 0 || y < 0)
            return null;
        else
            return new Point(x, y);
    }

    private Point() {
        this.x = 10;
        this.y = 40;
        this.nom = "6";
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        return "Point numero " + nom + numeroOrdre + " sur " + totalPoint + ": abs: " + x + " ord: " + y;
    }

    public boolean egalASoi(Point p) {
        return egalite(p);
    }

    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // String str1 = br.readLine();
        // String str2 = br.readLine();
        Point p1 = new Point(5, 8);
        Point p2 = new Point(5, 8);
        Point p3 = new Point(56, 78);
        Point p4;
        p4 = Point.creationPoint(6, 6);
        boolean b = p1.egalite(p2);
        System.out.println(b == true ? "True" : "False");
        // Point p1 = new Point(Integer.parseInt(str1), Integer.parseInt(str2));
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p4);
    }
}
