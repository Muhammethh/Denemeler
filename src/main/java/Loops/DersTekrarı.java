package Loops;

public class DersTekrarı {

    public static void main(String[] args) {

        //Ornek 1: 3'den 6'ya kadar tamsayilari console’a yazdiriniz (3 ve 6 dahil).
        //Example 1: Write integers from 3 to 6 to console (including 3 and 6)

        int i = 3;
        while (i < 7) {
            System.out.println(i);

            i++;
        }

        //Ornek 2: 23'den 12'ye kadar cift tamsayilari console’a yazdiriniz(12 dahil).
        //Example 2: Write the even integers from 23 to 12 to the console (including 12)


        /* int m = 23;

        while (m > 11) {

            if (m % 2 == 0) {
                System.out.println(m);
            }
            m--;
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz");
        int num = input.nextInt();

        int i1 = 0;
        while (i <= 10) {

            System.out.println(num + "x" + i + "=" + (num * i));
            i++;
        }

         */


        //Ornek 1:  Belirli bir tamsayının palindrome olup olmadığını kontrol eden kodu yazın.
        //Example 1: Write the code to check if a given integer is a palindrome.
        //           Palindrome: 121 <==> 121        123321 <==> 123321

        System.out.println("--------------------------");
        String isim = "tâlât";

        String reversed = "";

        int index = isim.length() - 1;

        while (index >=  0) {

            reversed = reversed + isim.charAt(index);

            index--;
        }
        System.out.println(reversed);
        if (reversed.equals(isim)){
            System.out.println("Palindromdur");
        }else {
            System.out.println("Palindrom değildir");
        }


    }
}
