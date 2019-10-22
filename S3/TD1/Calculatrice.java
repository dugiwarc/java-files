import java.util.Scanner;

public class Calculatrice {
    public static void main(String[] args) {

        int leftOP = Integer.parseInt(args[0]);
        int rightOP = Integer.parseInt(args[2]);

        switch (args[1].charAt(0)) {
        case '+':
            System.out.println("" + leftOP + args[1] + rightOP + "=" + (leftOP + rightOP));
            break;
        case '-':
            System.out.println("" + leftOP + args[1] + rightOP + "=" + (leftOP - rightOP));
            break;
        case '*':
            System.out.println("" + leftOP + args[1] + rightOP + "=" + leftOP * rightOP);
            break;
        case '/':
            System.out.println("" + leftOP + args[1] + rightOP + "=" + leftOP / rightOP);
            break;
        case '%':
            System.out.println("" + leftOP + args[1] + rightOP + "=" + leftOP % rightOP);
            break;
        case '^':
            System.out.println("" + leftOP + args[1] + rightOP + "=" + Math.pow(leftOP, rightOP));
            break;
        default:
            System.out.println("Operateur inconnu");
            break;
        }
    }
}