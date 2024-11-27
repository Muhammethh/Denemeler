package project2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tarife {
    public int tarifetipi;
    public double ucret;
    public int otobüsTipi;
    public String aracTipi;

    public void tarifeHesap(String aracc) {


        this.aracTipi = aracc;
        double toplam = 0;


        switch (this.tarifetipi) {

            case 1:

                if (aracc.equalsIgnoreCase("otomobil")) {
                    toplam = 2000;

                } else if (aracc.equalsIgnoreCase("kamyon")) {
                    toplam = 3000;
                } else if (aracc.equalsIgnoreCase("motosiklet")) {
                    toplam = 1500;
                } else if (aracc.equalsIgnoreCase("otobüs")) {
                    if (this.otobüsTipi == 1) {
                        toplam = 4000;
                    } else if (this.otobüsTipi == 2) {
                        toplam = 5000;
                    }

                }


                break;

            case 2:
                if (aracc.equalsIgnoreCase("otomobil")) {
                    toplam = 2500;

                } else if (aracc.equalsIgnoreCase("kamyon")) {
                    toplam = 3500;
                } else if (aracc.equalsIgnoreCase("motosiklet")) {
                    toplam = 1750;
                } else if (aracc.equalsIgnoreCase("otobüs")) {
                    if (this.otobüsTipi == 1) {
                        toplam = 4500;
                    } else if (this.otobüsTipi == 2) {
                        toplam = 5500;
                    }

                }

                break;
        }
        this.ucret = toplam;


    }

    public void bilet(String araçTipi) {

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(" dd. MMM.yyyy \n HH:mm a");


        System.out.println("*".repeat(44));
        System.out.println("---------Sigorta Poliçesi-------");
        System.out.println("Tarife Tipi    : " + this.tarifetipi);
        System.out.println("Araç tipi      : " + this.aracTipi);
        System.out.println("Toplam ücret   : " + this.ucret);
        System.out.println(dtf.format(ldt));
        System.out.println("*".repeat(44));


    }

}
