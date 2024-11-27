package Tekrarlar;

public class Sb01 {

    public static void main(String[] args) {

        StringBuilder date = new StringBuilder("Java is easy");
        System.out.println(date.reverse());
        date.reverse();


        date.deleteCharAt(0);
        System.out.println(date);



    }
}
