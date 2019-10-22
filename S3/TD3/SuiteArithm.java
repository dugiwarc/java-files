class SuiteArithm extends Suite {
    SuiteArithm(int premier, int pas) {
        super(premier, pas);
    }

    int valeurAuRangN(int n) {
        return premier + (n - 1) * pas;
    }

    int sommeAuRangN(int n) {
        return (n / 2) * (premier + n);
    }

    int calculRang(int n) {
        System.out.println((n - premier) / pas);
        return (n - premier) / pas + premier;
    }

}