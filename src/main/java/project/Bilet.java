package project;

import Tekrarlar.LocalDatetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bilet {

    public String isim;
    public String Soyisim;
    public int yaş;
    public double mesafe;
    public String seçilenkoltuk;
    public byte tip;
    public double fiyat;


    public void fiyatHesaplama() {


        double toplam = 0;
        int koltuk3 = Integer.valueOf(seçilenkoltuk);

        switch (this.tip) {
            case 1:
                if (koltuk3 % 3 == 0) {

                    toplam = toplam + this.mesafe * 1.2;
                } else {
                    toplam = toplam + this.mesafe * 1;
                }
                System.out.println("Toplam indirimsiz fiyat: " + toplam);
                break;
            case 2:
                if (koltuk3 % 3 == 0) {

                    toplam = toplam + this.mesafe * 2.4;
                } else {
                    toplam = toplam + this.mesafe * 2;
                }
                System.out.println("Toplam indirimsiz fiyat: " + toplam);
                toplam = toplam * 0.8;
                System.out.println("Toplam indirimli fiyat: " + toplam);
                break;

        }

        if (this.yaş < 12) {
            toplam = toplam / 2;

        } else if (this.yaş > 65) {

            toplam = toplam * 0.7;

        }

        this.fiyat = toplam;

    }

    public void biletBaskı(Otobüs Otbprm) {


        LocalDateTime tarih = LocalDateTime.now();
        DateTimeFormatter formatlı = DateTimeFormatter.ofPattern("dd.MM.yyyy \n hh:mm");
        System.out.println(tarih.format(formatlı));

        System.out.println("*".repeat(20));
        System.out.println("isim               :" + this.isim);
        System.out.println("Soyisim            :" + this.Soyisim);
        System.out.println("Otobüs Plakası     :" + Otbprm.plaka);
        System.out.println("Peron              :" + Otbprm.peron);
        System.out.println("Firma Adı          :" + Otbprm.firma);
        System.out.println("Mesafe             :" + this.mesafe);
        System.out.println("Koltuk Numaranız   :" + this.seçilenkoltuk);
        System.out.println("Yolculuk Tipi      :" + this.tip);
        System.out.println("Toplam Son Fiyat      :" + this.fiyat);
        System.out.println("*".repeat(20));
    }


}
