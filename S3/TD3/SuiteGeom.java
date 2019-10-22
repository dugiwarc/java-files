class SuiteGeom extends Suite {
    SuiteGeom(int premier, int pas) {
        super(premier, pas);
    }

    int valeurAuRangN(int n) {
        return premier * (int) Math.pow(pas, n - 1);
    }

    int sommeAuRangN(int n) {
        return premier * (1 - (int) Math.pow(pas, n)) / (1 - pas);
    }
}