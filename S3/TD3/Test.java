class Test {
    public static void main(String[] args) {
        SuiteArithm s1 = new SuiteArithm(1, 3);
        SuiteGeom s2 = new SuiteGeom(3, 4);

        s1.valeurAuRangN(5);
        s1.sommeAuRangN(10);
        s2.sommeAuRangN(10);
        s2.valeurAuRangN(10);
        s1.calculRang(19);
    }
}