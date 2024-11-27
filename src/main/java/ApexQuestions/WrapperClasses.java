package ApexQuestions;

public class WrapperClasses {
    public static void main(String[] args) {


         /*Byte data t!p!n!n m!n!mum deger! !le short data t!p!n!n maks!mum deger!n!n toplamını
        bulmak !ç!n b!r kod yazınız.*/

        byte min = 0;
        short maks = 0;

        min = Byte.MIN_VALUE;
        maks = Short.MAX_VALUE;
        System.out.println("toplam " + (maks + min));

        /*Data t!p! Str!ng olan “103” deger!n! byte data t!p!ne dönüstürmek !ç!n b!r kod yazınız ve
        y!ne data t!p! Str!ng olan “2351” deger!n! short data t!p!ne dönüstürüp konsolda !k!
                deg!sken arasındak! farkı yazdırınız.*/

        String str = "103";
        String str1 = "2351";

        System.out.println("Byte.parseByte(str) = " + Byte.parseByte(str));
        System.out.println("Short.parseShort(str1) = " + Short.parseShort(str1));
    }
}
