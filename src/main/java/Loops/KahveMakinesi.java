package Loops;

import java.util.Scanner;

public class KahveMakinesi {

    public static void main(String[] args) {

        //Kahve Makinesi

        Scanner input = new Scanner(System.in);
        System.out.println("Hangi kahveyi istersiniz \n Türk kahvesi \n Filtre Kahve \n Espresso.");
        String kahve = input.nextLine();


        switch (kahve.toLowerCase()) {
            case "türk kahvesi":
                System.out.println("Türk kahvesi hazırlanıyor");
                System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
                String süt = input.next();
                if (süt.equalsIgnoreCase("Evet")) {
                    System.out.println("Süt Ekleniyor");
                } else if (süt.equalsIgnoreCase("Hayır")) {
                    System.out.println("Süt Eklenmedi");
                } else {
                    System.out.println("Yanlış ifade girildi");
                }
                System.out.println("Şeker eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
                String şeker = input.next();
                if (şeker.equalsIgnoreCase("Evet")) {

                    System.out.println("Kaç adet şeker istersiniz?");

                    int şekerSayısı = input.nextInt();

                    if (şekerSayısı > 0) {
                        System.out.println(şekerSayısı + " adet şeker ekleniyor");
                    } else {
                        System.out.println("Şeker eklenmedi");
                    }

                } else if (şeker.equalsIgnoreCase("Hayır")) {
                    System.out.println("Şeker Eklenmedi");
                } else {
                    System.out.println("Yanlış ifade girildi");
                }
                String bosKod = input.nextLine();
                System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)");
                String boy = input.nextLine();


                if (boy.equalsIgnoreCase("büyük boy")) {
                    System.out.println(boy + " Kahveniz hazırlanıyor");

                } else if (boy.equalsIgnoreCase("orta boy")) {
                    System.out.println(boy + " Kahveniz hazırlanıyor");
                } else if (boy.equalsIgnoreCase("küçük boy")) {
                    System.out.println(boy + " Kahveniz hazırlanıyor");
                } else {
                    System.out.println("Yanlış boy girildi");
                }

                System.out.println(boy + " " + kahve + " hazırdır. Afiyet olsun");
                break;

            case "filtre kahve":
                System.out.println("Filtre kahve hazırlanıyor");
                System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
                String süt2 = input.next();
                if (süt2.equalsIgnoreCase("Evet")) {
                    System.out.println("Süt Ekleniyor");
                } else if (süt2.equalsIgnoreCase("Hayır")) {
                    System.out.println("Süt Eklenmedi");
                } else {
                    System.out.println("Yanlış ifade girildi");
                }
                System.out.println("Şeker eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
                String şeker2 = input.next();
                if (şeker2.equalsIgnoreCase("Evet")) {

                    System.out.println("Kaç adet şeker istersiniz?");

                    int şekerSayısı = input.nextInt();

                    if (şekerSayısı > 0) {
                        System.out.println(şekerSayısı + " adet şeker ekleniyor");
                    } else {
                        System.out.println("Şeker eklenmedi");
                    }

                } else if (şeker2.equalsIgnoreCase("Hayır")) {
                    System.out.println("Şeker Eklenmedi");
                } else {
                    System.out.println("Yanlış ifade girildi");
                }
                String bosKod2 = input.nextLine();
                System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)");
                String boy2 = input.nextLine();


                if (boy2.equalsIgnoreCase("büyük boy")) {
                    System.out.println(boy2 + " Kahveniz hazırlanıyor");

                } else if (boy2.equalsIgnoreCase("orta boy")) {
                    System.out.println(boy2 + " Kahveniz hazırlanıyor");
                } else if (boy2.equalsIgnoreCase("küçük boy")) {
                    System.out.println(boy2 + " Kahveniz hazırlanıyor");
                } else {
                    System.out.println("Yanlış boy girildi");
                }

                System.out.println(boy2 + " " + kahve + " hazırdır. Afiyet olsun");
                break;

            case "espresso":
                System.out.println("Espresso hazırlanıyor");
                System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
                String süt3 = input.next();
                if (süt3.equalsIgnoreCase("Evet")) {
                    System.out.println("Süt Ekleniyor");
                } else if (süt3.equalsIgnoreCase("Hayır")) {
                    System.out.println("Süt Eklenmedi");
                } else {
                    System.out.println("Yanlış ifade girildi");
                }
                System.out.println("Şeker eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız): ");
                String şeker3 = input.next();
                if (şeker3.equalsIgnoreCase("Evet")) {

                    System.out.println("Kaç adet şeker istersiniz?");

                    int şekerSayısı = input.nextInt();

                    if (şekerSayısı >= 1) {
                        System.out.println(şekerSayısı + " adet şeker ekleniyor");
                    } else {
                        System.out.println("Şeker eklenmedi");
                    }

                } else if (şeker3.equalsIgnoreCase("Hayır")) {
                    System.out.println("Şeker Eklenmedi");
                } else {
                    System.out.println("Yanlış ifade girildi");
                }
                String bosKod3 = input.nextLine();

                System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy olarak giriniz.)");
                String boy3 = input.nextLine();

                if (boy3.equalsIgnoreCase("büyük boy")) {
                    System.out.println(boy3 + " Kahveniz hazırlanıyor");

                } else if (boy3.equalsIgnoreCase("orta boy")) {
                    System.out.println(boy3 + " Kahveniz hazırlanıyor");
                } else if (boy3.equalsIgnoreCase("küçük boy")) {
                    System.out.println(boy3 + " Kahveniz hazırlanıyor");
                } else {
                    System.out.println("Yanlış boy girildi");
                }
                System.out.println(boy3 + " " + kahve + " hazırdır. Afiyet olsun");

                break;

            default:
                System.out.println("Yanlış bir ifade girildi");
                break;


        }


    }
}
