package hu.petrik.bankiszolgaltatasokOOP;

public class Main {
    public static void main(String[] args) {
        Bank OTP = new Bank();
        Tulajdonos tulajdonos1 = new Tulajdonos("Róbert Gida");
        Tulajdonos tulajdonos2 = new Tulajdonos("Alföldi Géza");
        Tulajdonos tulajdonos3 = new Tulajdonos("Kis Tamás");
        Tulajdonos tulajdonos4 = new Tulajdonos("Nagy Ervin");
        Tulajdonos tulajdonos5 = new Tulajdonos("Kovács István");
        Szamla hts1 = new MegtakaritasiSzamla(tulajdonos1);

        System.out.println(OTP.szamlanyitas(tulajdonos1,0));
        OTP.szamlanyitas(tulajdonos1,310000);
        OTP.szamlanyitas(tulajdonos2,340000);
        OTP.szamlanyitas(tulajdonos3,0);
        OTP.szamlanyitas(tulajdonos3,0);
        OTP.szamlanyitas(tulajdonos4,500000);
        OTP.szamlanyitas(tulajdonos4,200000);
        OTP.szamlanyitas(tulajdonos5,10000000);

        Kartya k1 = new Kartya(tulajdonos1, hts1,"35345-364452-36334");

    /*    OTP.getOsszegyenleg(tulajdonos4);
        OTP.getOsszhitelkeret();
        OTP.getLegnagyobbEgyenleguSzamla(tulajdonos1);
*/
    }
}
