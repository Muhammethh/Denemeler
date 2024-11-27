package project;

import java.util.Scanner;

public class Runner {



        /*
        project: Bilet Rezervasyon ve Bilet Fiyatı Hesaplama Uygulaması

        1-Uygulama mesafe ve kurallara göre otobüs bileti fiyatı hesaplar sonuç olarak bilet bilgisini verir
        2- Kullanıcıdan     mesafe (KM),
        yolcu yaşı ,
        yolculuk tipi (Tek Yön, Gidiş-Dönüş)
        ve koltuk no bilgilerini alınır.
        NOT: Koltuk numaraları 1-32 aralığında olmalıdır.)
        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi halde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

        3-Fiyat hesaplama kuralları:
        -Mesafe başına ücret:
        Tek yön: 1 Lira / km       Çift Yön(Gidiş-Dönüş): 2 Lira/km
        -Tekli Koltuk ücreti:
        Koltuk no 3 veya 3 ün katı ise fiyat %20 daha fazladır(Tek yön: 1.2 Lira/km, Çift Yön:2.4 Lira/km).
        -İlk olarak seferin mesafe, yön ve koltuk no bilgisine göre fiyatı hesaplanır,
        sonrasında koşullara göre aşağıdaki indirimler uygulanır ;
        i)-Çift Yön indirimi:
        "Yolculuk Tipi" gidiş dönüş seçilmiş ise son bilet fiyatı üzerinden %20 indirim uygulanır.
        ii)-Yaş indirimi:
        Kişi 12 yaşından küçükse son bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 65 yaşından büyük ise son bilet fiyatı üzerinden %30 indirim uygulanır.

        */

    public static void main(String[] args) {

        Otobüs Obj = new Otobüs("34KG1876", "peron 2", "M Turizm");

    }


    public void başlat(Otobüs otobusprm) {


        Scanner input = new Scanner(System.in);

        int menü;
        do {
            System.out.println("Adınızı giriniz");
            String ad = input.nextLine();

            System.out.println("Soyadınızı giriniz");
            String soyAd = input.nextLine();

            System.out.println("Yaşınızı giriniz");
            int yaş = input.nextInt();

            System.out.println("Yolculuk tipinizi giriniz, Tek yön için 1 \n Gİdiş Dönüş için 2 ye basınız");
            byte seçim = input.nextByte();

            System.out.println("Koltuğunuzu seçin");
            System.out.println(otobusprm.koltuk);
            String koltukseçimi = input.nextLine();


            System.out.println("Yolculuk mesafesini giriniz");
            double mesafe = input.nextDouble();

            boolean rezerveMi = !otobusprm.koltuk.contains(koltukseçimi);

            boolean geçerliMi = yaş > 0 && mesafe > 0 && (seçim == 1 || seçim == 2) && !rezerveMi;

            if (geçerliMi) {
                otobusprm.koltuk.remove(koltukseçimi);
            }


            menü = input.nextInt();
        } while (menü != 0);


    }


}
