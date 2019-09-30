import java.io.*;

public class Lecture {
    public static String lireString() {
        String ligne_lue = null;
        try {
            InputStreamReader lecteur = new InputStreamReader(System.in);
            BufferedReader entree = new BufferedReader(lecteur);
            ligne_lue = entree.readLine();
        } catch (IOException err) {
            System.exit(0);
        }
        return ligne_lue;
    }

    public static double lireDouble() {
        double x = 0;
        try {
            String ligne_lue = lireString();
            x = Double.parseDouble(ligne_lue);
        } catch (NumberFormatException e) {
            System.out.println("Erreur de donnee");
            System.exit(0);
        }
        return x;
    }

    public static int lireInt() {
        int n = 0;

        try {
            String ligne_lue = lireString();
            n = Integer.parseInt(ligne_lue);

        } catch (NumberFormatException e) {
            System.out.println("Erreur de donnee");
            System.exit(0);
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.print("Donner un double: ");
        double x;
        x = Lecture.lireDouble();
        System.out.println("Resultat " + x);
        System.out.print("Donner un entier: ");
        int n;
        n = Lecture.lireInt();
        System.out.println("Resultat " + n);
    }

}