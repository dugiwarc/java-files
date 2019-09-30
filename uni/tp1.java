class Point
{
    private int x = -1;
    private int y;
    static int totalPoint = 0;
    int numeroOrdre = 0;

    public Point(int x, int y)
    {
        x = x;
        y = y;
        totalPoint++;
        numeroOrdre = totalPoint;
    }

    public String toString ()
    {
        return "abscisse : " + x + ", ordonne : " + y;
    }
}

public class TestPoint
{
    static public void main(String [] args)
    {
        Point p1 = new Point(10, 40);
        Point p2 = new Point(10, 40);
        Point p3 = new Point(10, 40);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}