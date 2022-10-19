package hu.petrik.bankiszolgaltatasokOOP;

public class MegtakaritasiSzamla extends Szamla {
    private double kamat;
    public static double alapKamat = 1.1;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
        this.kamat = alapKamat;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    @Override
    public boolean kivesz(int osszeg) {
        if (this.aktualisEgyenleg - osszeg >= 0) {
            this.aktualisEgyenleg -= osszeg;
            return true;
        } else {
            return false;
        }
    }

    public void kamatJovairas() {
        this.aktualisEgyenleg = (int)(this.aktualisEgyenleg * kamat);
    }
}
