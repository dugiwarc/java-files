class Oiseau extends Animal {
    protected boolean vole = false;

    public Oiseau(String s) {
        super(s);
    }

    public void apprendVole() {
        vole = true;
    }

    public void dire() {
        System.out.println(vole ? "cui-cui" : "piou-piou");
    }

}