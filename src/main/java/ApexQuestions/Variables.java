package ApexQuestions;

import java.sql.SQLOutput;

public class Variables {

    public static void main(String[] args) {

       /* Herhang! b!r 3 ögen!n f!yatları !ç!n double data t!p!nde deg!skenler olusturunuz. F!yatların
        toplamını konsola yazdırınız.*/

        double fiyat1 = 10;
        double fiyat2 = 20;
        double fiyat3 = 30;
        System.out.println(fiyat1 + fiyat2 + fiyat3);
        System.out.println("--------------------------------");
       /* Herhang! b!r 3 öge !ç!n float, long ve !nteger data t!p!nde deg!skenler olusturunuz. Bu
        deg!skenler!n degerler!n!n çarpımını konsolda yazdırınız.*/

        float price1 = 10.20F;
        long price2 = 2020;
        Integer price3 = 20;
        System.out.println(price1 * price2 * price3);

        System.out.println("------------------------------");
        /*Bas!t fa!z! bulmak !ç!n b!r kod yazınız.
        Not: Basit faiz formülü = anapara * oran * yılDegeri /100*/

        int anaPara = 1000;
        double oran = 4.5;
        int yıl = 3;

        double sonuç = anaPara * oran * yıl / 100;
        System.out.println("sonuç = " + sonuç);
        System.out.println("-----------------");
        /*B!r Str!ng ve !k! long data t!p!nde deg!sken olusturunuz. Konsolda bu long deg!skenler!n
        toplamını ve çarpımını Str!ng !le yazdırınız.*/

        String x = "Sonuç";
        long y = 456;
        long z = 123;

        System.out.println(x + (y + z));
        System.out.println(x + (y * z));
        System.out.println("-----------------------");
        /*Degerler! farklı olan !k! boolean data t!p!nde deg!sken olusturunuz ve bu degerler! !k!
                ardısık deger arasında bosluk bırakacak sek!lde aynı satırda yazdırınız.*/

        //soru yanlış anlaşıldı------>5. apex sorusu
        boolean a = false;
        boolean b = true;

        for (int i = 2; i < 3; i++) {

            System.out.println((i - 1) + " " + a + b + " " + i);

        }
        System.out.println("--------------------");
       /* 3 öge (k!tap, defter ve laptop) f!yatı !ç!n long data t!p!nde deg!skenler olusturunuz.
                Konsolda 2 k!tap, 4 defter ve 3 laptop !ç!n toplam f!yatını yazdırınız.*/

        long kitapFiyat = 300L;
        long defterFiyat = 800L;
        long laptopFiyat = 4000L;

        System.out.println(2 * kitapFiyat + 4 * defterFiyat + 3 * laptopFiyat);


        //Ik! tamsayıyı deg!st!rmek !ç!n b!r kod yazınız.

        int m = 5;
        int ö = 4;

        m = m + ö;
        ö = m - ö;
        m = m - ö;
        System.out.println("m = " + m);
        System.out.println("ö = " + ö);






    }
}
