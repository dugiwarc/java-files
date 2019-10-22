import java.text.DecimalFormat;

public class TSexDec {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        SexDec h1 = new SexDec(2, 72, 84);
        // System.out.println("h1 - decimal = " + df.format(h1.getDec()) + " Sexa = " +
        // h1.getH() + ":" + h1.getM() + ":"
        // + h1.getS());
        SexDec h2 = h1.ajout(1.50);
        System.out.println("h2 - decimal = " + df.format(h2.getDec()) + " Sexa = " + h2.getH() + ":" + h2.getM() + ":"
                + h2.getS());

    }
}