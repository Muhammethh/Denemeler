package Loops;

import java.util.Scanner;

public class RenkKarışımı {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Boolean geçerliRenk;
        String renk1;
        String renk2;
        do {

            System.out.println("1.Rengi seçin (Kırmızı-Mavi-Sarı)");
            renk1 = input.next();
            System.out.println("2.rengi seçin (Kırmızı-Mavi-Sarı)");
            renk2 = input.next();

            geçerliRenk = renk1.equalsIgnoreCase("Kırmızı") || renk1.equalsIgnoreCase("Sarı")
                    || renk1.equalsIgnoreCase("mavi");
            if (!geçerliRenk) {
                System.out.println("Geçerli renk seçilmedi");
            }
        } while (!geçerliRenk);

        if (renk1.equalsIgnoreCase("kırmızı") && renk2.equalsIgnoreCase("mavi")) {

            System.out.println("Oluşan renk Mor");
        } else if (renk1.equalsIgnoreCase("kırmızı") && renk2.equalsIgnoreCase("sarı")
                || renk2.equalsIgnoreCase("kırmızı") && renk1.equalsIgnoreCase("sarı")) {
            System.out.println("Oluşan renk Turuncu");
        } else if (renk1.equalsIgnoreCase("mavi") && renk2.equalsIgnoreCase("sarı")
                || renk2.equalsIgnoreCase("mavi") && renk1.equalsIgnoreCase("sarı")) {
            System.out.println("oluşan renk Lacivert");
        } else if (renk1.equalsIgnoreCase(renk2)) {
            System.out.println("Aynı renk karışımı seçildi, oluşan renk " + renk1);
        } else {
            System.out.println("Yanlış bir ifade girildi");
        }


    }
}
