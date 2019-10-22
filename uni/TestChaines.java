import java.lang.String;
import java.util.Scanner;

public class TestChaines {
    public void afficheLongueurString() {
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("String read from console is : \n" + inputString.length());
    }

    public void lireDeuxChainesEtAfficher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string: ");
        String inputString1 = scanner.nextLine();
        System.out.println("Enter second string: ");
        String inputString2 = scanner.nextLine();

    }

    public static void main(String[] args) {
        TestChaines testy = new TestChaines();
        testy.afficheLongueurString();
    }
}
