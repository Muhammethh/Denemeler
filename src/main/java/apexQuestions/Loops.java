package apexQuestions;

public class Loops {

    public static void main(String[] args) {

        /*120'den 11'e kadar 4 !le bölüneb!len ve 6 !le bölüneb!len tüm tam sayıları aynı satırda !k!
                ardısık tam sayı arasında bosluk bırakarak yazınız.*/

        for (int i = 120; i >= 11; i--) {

            if (i % 4 == 0 && i % 6 == 0) {
                System.out.print(" " + i);
            }

        }

        System.out.println("************************************");

       /* B!r Str!ng’ de tekrarlanan karakterler! yazdırmak !ç!n kod yazınız.
        Örneg!n; accessor!es ´ ces*/

        String str = "accessories";

        String newStr = "";

        for (int i = 0; i < str.length(); i++) {

            String sub = str.substring(i, i + 1);

            if (str.indexOf(sub) != str.lastIndexOf(sub)) {

                if (!newStr.contains(sub)) {

                    newStr += sub;
                }

            }

        }
        System.out.println(newStr);


        /*B!r Str!ng ‘ !n pal!ndrom olup olmadıgını kontrol etmek !ç!n kod yazınız. B!r Str!ng, ters! !le
        aynıysa, buna pal!ndrom den!r. Örneg!n; “anna”, “123321” pal!ndromlardır.*/

        String pal = "ann";
        String revPal = "";

        for (int i = pal.length() - 1; i >= 0; i--) {

            revPal = revPal + pal.charAt(i);

        }
        if (revPal.equals(pal)) {
            System.out.println("palindrom");
        } else {
            System.out.println("not palindrom");
        }


        /*Benzers!z (Tekrarsız) rakamları b!r tamsayı olarak yazdırmak !ç!n kod yazınız.
        Örnek; 223878 ´ 37*/

        int sayı = 223878;
        String bş = "";

        String str1 = String.valueOf(sayı);

        for (int i = 0; i < str1.length(); i++) {

            String sub1 = str1.substring(i, i + 1);

            if (str1.indexOf(sub1) == str1.lastIndexOf(sub1)) {

                bş = bş + sub1;

            }

        }

        System.out.println(Integer.valueOf(bş));


    }
}
