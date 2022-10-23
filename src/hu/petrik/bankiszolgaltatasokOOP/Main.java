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

        OTP.szamlanyitas(tulajdonos1,0).befizet(10000);
        OTP.szamlanyitas(tulajdonos1,310000).befizet(60000);
        OTP.szamlanyitas(tulajdonos2,340000).befizet(72000);
        OTP.szamlanyitas(tulajdonos3,0).befizet(90000);
        OTP.szamlanyitas(tulajdonos3,0).befizet(1000000);
        OTP.szamlanyitas(tulajdonos4,500000).befizet(600000);
        OTP.szamlanyitas(tulajdonos4,200000).befizet(100000);
        OTP.szamlanyitas(tulajdonos5,10000000);

        Kartya k1 = new Kartya(tulajdonos1, hts1,"35345-364452-36334");



        System.out.println(OTP.getOsszegyenleg(tulajdonos4));
        System.out.println(OTP.getOsszhitelkeret());
        System.out.println(OTP.getLegnagyobbEgyenleguSzamla(tulajdonos3).getAktualisEgyenleg());

    }
}
