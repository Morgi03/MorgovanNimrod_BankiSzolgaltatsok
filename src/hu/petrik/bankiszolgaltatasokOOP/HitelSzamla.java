package hu.petrik.bankiszolgaltatasokOOP;

public class HitelSzamla extends Szamla {

    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }

    @Override
    public boolean kivesz(int osszeg) {
        if (this.aktualisEgyenleg - osszeg >= 0 && osszeg <= hitelKeret) {
            this.aktualisEgyenleg -= osszeg;
            return true;
        } else {
            return false;
        }
    }

}
