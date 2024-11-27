package Interview;

public class InterviewQuest {
    public static void main(String[] args) {


        //Bir String'in tüm substringlerini bulan kodu yazınız.

        String str = "Java";


        for (int i = 0; i < str.length(); i++) {

            for (int j = 1; j <= str.length()-i ; j++) {

                System.out.println(str.substring(i,j+i));

            }

        }


    }
}
