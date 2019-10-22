class SexDec {
    // private double dec;
    // double minDec;
    private int h, min, s;

    public SexDec(double heureDec) {
        // this.dec = heureDec;
        h = (int) heureDec;
        min = (int) ((heureDec - h) * 60);
        s = (int) (((heureDec - h) * 60 - min) * 60);
    }

    public SexDec(int heure, int min, int sec) {
        setHMS(heure, min, sec);
    }

    public SexDec ajout(double duree) {
        int ajH, ajM, ajS, fH, fM, fS;
        double ajMDec;
        ajH = (int) (duree);
        ajMDec = ((duree - ajH) * 60);
        ajM = (int) ajMDec;
        ajS = (int) ((ajMDec - ajM) * 60);
        fH = ajH + this.h;
        fM = ajM + this.min;
        fS = ajS + this.s;
        return new SexDec(fH, fM, fS);
    }

    public void setHMS(int heure, int min, int sec) {
        h = heure % 24;
        int n = 0;
        if (sec > 60) {
            n = (int) (sec / 60.);
            this.s = sec % 60;
            min += n;
        } else {
            this.s = sec;
        }
        if (min > 60) {
            n = (int) (min / 60.);
            this.min = min % 60;
            h += n;
        } else {
            this.min = min;
        }
    }

    public int getH() {
        // return (int) (dec);
        return h;
    }

    public int getM() {
        // this.minDec = ((dec - getH()) * 60);
        // return (int) minDec;
        return min;
    }

    public int getS() {
        // return (int) ((minDec - getM()) * 60);
        return s;
    }

    public double getDec() {
        return h + min / 60. + s / 3600.;
    }
}