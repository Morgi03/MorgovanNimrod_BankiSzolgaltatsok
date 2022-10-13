package hu.petrik.bankiszolgaltatasokOOP;

public abstract class Szamla extends BankiSzolgaltatas {

    protected int aktualisEgyenleg;

    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void befizet(int osszeg) {

    }

    public abstract boolean kivesz(int osszeg);

    public Kartya ujKartya(String kartyaszam) {
    return new Kartya(this.getTulajdonos(), this, kartyaszam);
    }

}

