package ApexQuestions;

public class TypeCasting {
    public static void main(String[] args) {

        //Short data t!p!nde b!r deg!sken olusturunuz ve onu b!r !nt deg!sken!ne dönüstürünüz.

        short shrt = 5;
        int in = shrt;

        //Long data t!p!nde b!r deg!sken olusturunuz ve onu b!r !nt deg!sken!ne dönüstürünüz.

        long uzun = 80000L;
        int kıs = (int) uzun;
        System.out.println("kıs = " + kıs);

        //Double data t!p!nde b!r deg!sken olusturunuz ve onu b!r float deg!sken!ne dönüstürünüz.

        double yas = 50.20;
        float yeniYas = (float) yas;
        System.out.println("yeniYas = " + yeniYas);

       /* Double data t!p!nde b!r deg!sken olusturunuz ve onu b!r short deg!sken!ne dönüstürünüz.
                Sonrasında bu short deg!sken!n deger!n! konsolda yazdırınız.
                Not : Çıktıya dikkat ediniz, ondalık bir deger olmayacaktır.*/

        double maaş = 20.40;
        short yeniMaaş = (short) maaş;
        System.out.println("yeniMaaş = " + yeniMaaş);

        /*Byte data t!p!nde b!r deg!sken olusturunuz ve onu b!r double deg!sken!ne dönüstürünüz.
                Sonrasında bu double deg!sken!n deger!n! konsolda yazdırınız.
                Not : Çıktıya dikkat ediniz, ondalık bir deger olmayacaktır.*/

        byte num = 50;
        double newNum = num;
        System.out.println("newNum = " + newNum);
    }
}
