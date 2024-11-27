package project2;

import java.util.Scanner;

public class Project {
    public static void main(String[] args) {

/*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk

       Tarife dönemi:Aralık 2024,Haziran 2024
          1.dönem :Haziran 2024               2.dönem:Aralık 2024
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750

        1-Tekrar tekrar kullanılan bir seçim menüsü(form) gösterelim.
        2-Tarife dönemi bilgisi,araç tipi bilgilerini kullanıcıdan alalım.
        3-Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü(form) gösterilsin.
        4-Menüde yeni işlem veya çıkış için seçenek sunulsun .
        5-tarife dönemi ve araç tipine göre sigorta primi hesaplansın.
 */
        Tarife t= new Tarife();
      AraçTipi a= new AraçTipi();


        baslat(a,t);

    }

    private static void baslat(AraçTipi a,Tarife t) {

        Scanner input= new Scanner(System.in);
        int cıkıs;
        do {
            System.out.println("tarife tipini giriniz.. \n 1. dönem => 1 \n 2. dönem => 2");
            int dönem=input.nextInt();



            System.out.println("araç tipinini yazınız.. \notomobil \n kamyon   \notobüs \nmotosiklet ");

                    String arac=input.next();
                    int otobüs;
                    if(arac.equalsIgnoreCase("otobüs")) {
                        System.out.println("otobüs tipini giriniz 1   ... 2  .");
                        otobüs = input.nextInt();
                        t.otobüsTipi=otobüs;
                    }

                    if ((dönem==1||dönem==2)){
                        t.tarifetipi=dönem;
                        //a.aracTipi= arac;
                        t.tarifeHesap(arac);
                        t.bilet(arac);


                    }else {
                        System.out.println("hatalı giriş yaptınız");
                    }

            System.out.println("çıkış yapmak için 0 a basınız. yeni bir işlem için başka bir sayı giriniz");
                cıkıs= input.nextInt();
        }while (cıkıs!=0);

    }


}
