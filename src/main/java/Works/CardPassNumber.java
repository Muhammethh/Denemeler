package Works;

import java.util.Scanner;

public class CardPassNumber {

    public static void main(String[] args) {

        /* Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.

          Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazd
          Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.

        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,

         */

        //Kart numarası ve şifresi sorusu

        Scanner input = new Scanner(System.in);
        String cardNum = "1234 5678 0000 0000";
        String pswd = "5601";

        int balance = 1000;
        String choise;
        int send;
        int withdrw;
        int invest;
        String iban;
        String pswdConfirm;
        String newPswd;
        String validCardNum;
        String validPswd;
        boolean validation;
        boolean pswdValidation;
        boolean validIban;
        boolean exit=true;

        do {

            System.out.println("Kart numaranızı giriniz");
            validCardNum = input.nextLine();

            System.out.println("Şifrenizi giriniz");
            validPswd = input.nextLine();

            validation = validCardNum.replaceAll("\\s", "").equals(cardNum.replaceAll("\\s", ""));
            pswdValidation = validPswd.equals(pswd);

            do {

                if (validation && pswdValidation) {
                    System.out.println("Yapmak istediğiniz işlemi seçiniz, \n "
                            + "Bakiye Sorgula. \n Para Yatır. \n Para Çek \n Para Gönder \n Şifre değiştir \n Çıkış");


                    choise = input.nextLine();
                    exit =  choise.equalsIgnoreCase("çıkış");

                    if (choise.equalsIgnoreCase("Bakiye sorgula")) {

                        System.out.println(" \n Bakiyeniz: " + balance + "\n");

                    } else if (choise.equalsIgnoreCase("Para yatır")) {

                        do {
                            System.out.println("Yatırmak istenilen miktarı giriniz");
                            invest = input.nextInt();
                            if (invest > 0) {
                                System.out.println(" \n Yeni bakiyeniz: " + (balance + invest) + "\n");
                                balance = balance + invest;
                                break;

                            } else {
                                System.out.println(" \n Miktar 0'dan küçük olamaz \n");
                            }
                        } while (true);

                    } else if (choise.equalsIgnoreCase("Para çek")) {

                        do {
                            System.out.println(" \n Çekmek istediğiniz miktarı giriniz \n ");
                            withdrw = input.nextInt();
                            String empty = input.nextLine();
                            if (withdrw < balance && withdrw > 0) {

                                System.out.println("\n" + withdrw + " Çekildi. \n Yeni Bakiye: " + (balance - withdrw) + "\n");
                                break;
                            } else {
                                System.out.println(" \n Bakiye bu miktar için uygun değil lütfen tekrar deneyin \n ");

                            }

                        } while (true);

                    } else if (choise.equalsIgnoreCase("Para gönder")) {


                        System.out.println(" \n Para göndermek istediğiniz iban numarasını başında TR olarak giriniz \n ");
                        iban = input.nextLine();
                        validIban = iban.trim().replaceAll("\\s", "").length() == 28 && iban.startsWith("TR");

                        if (validIban) {

                            System.out.println(" \n Göndermek istenilen miktarı giriniz \n ");
                            send = input.nextInt();

                            if (send < balance && send > 0) {
                                System.out.println(" \n" + send + " Gönderildi. Yeni bakiye: " + (balance - send) +" \n");
                                break;
                            } else {
                                System.out.println(" \n Miktar doğrulanmadı. Yeni bir miktar giriniz \n ");

                            }

                        } else {
                            System.out.println(" \n Geçerli bir IBAN girilmedi. Tekrar deneyiniz \n ");
                        }


                    } else if (choise.equalsIgnoreCase("Şifre değiştir")) {
                        do {
                            System.out.println(" \n Mevcut şifrenizi yazınız \n ");
                            pswdConfirm = input.nextLine();

                            if (pswdConfirm.equalsIgnoreCase(pswd)) {
                                System.out.println(" \n Yeni şifrenizi tuşlayınız \n ");
                                newPswd = input.nextLine();
                                pswd = newPswd;
                                System.out.println(" \n Şifre güncellenmiştir \n ");
                                break;
                            } else {
                                System.out.println(" \n Parolanız yanlıştır \n ");
                            }
                        } while (true);

                    } else if (choise.equalsIgnoreCase("Çıkış")) {
                        System.out.println(" \n Güle Güle \n ");

                    } else {
                        System.out.println(" \n Geçerli seçim yapılmadı \n ");
                    }

                } else {
                    System.out.println(" \n Hatalı giriş yapıldı \n ");
                }

            } while (!exit);

        } while (!validation || !pswdValidation);


    }
}
