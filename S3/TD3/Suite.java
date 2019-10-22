abstract class Suite {
    int premier;
    int pas;

    Suite(int premier, int pas) {
        this.premier = premier;
        this.pas = pas;
    }

    abstract int valeurAuRangN(int n);

    abstract int sommeAuRangN(int n);
}