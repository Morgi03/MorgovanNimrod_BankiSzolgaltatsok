package hu.petrik.bankiszolgaltatasokOOP;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Szamla> szamlaLista;

    public Bank() {
        this.szamlaLista = new ArrayList<>();
    }

    public Szamla szamlanyitas(Tulajdonos tulajdonos, int hitelKeret) {
        Szamla sz;
        if (hitelKeret > 0) {
            sz = new HitelSzamla(tulajdonos, hitelKeret);
            return sz;
        } else {
            sz = new MegtakaritasiSzamla(tulajdonos);
        }
        this.szamlaLista.add(sz);
        return sz;
    }

    public int getOsszegyenleg(Tulajdonos tulajdonos) {
        int ossz = 0;
        for (Szamla s : this.szamlaLista) {
            if (s.getTulajdonos().equals(tulajdonos)) {
                ossz = ossz + s.getAktualisEgyenleg();
            }
        }
        return ossz;
    }



    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos) {
        Szamla max = this.szamlaLista.get(0);
        for (Szamla s : this.szamlaLista) {
            if (s.aktualisEgyenleg > max.getAktualisEgyenleg() && s.getTulajdonos().equals(tulajdonos)) {
                max = s;
            }
        }
        return max;
    }


    public long getOsszhitelkeret() {
        long ossz = 0;
        for (Szamla s : this.szamlaLista) {
                ossz = ossz + ((HitelSzamla) s).getHitelKeret();
        }
        return ossz;
    }

}
