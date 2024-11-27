package Loops;

import java.util.Scanner;

public class SıcaklıkDönüştürücü {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dönüştürmek istenilen sıcaklık değerini girin");

        int value = input.nextInt();

        System.out.println("Fahrenheita dönüştürmek için 1'e \n Celciusa dönüştürmek için 2'e basın");
        int seçim = input.nextInt();

        switch (seçim){
            case 1:
                System.out.println(value + " Celsius " + ((value* 9/5)+32) + " Fahrenheit'dır" );
                break;
            case 2:
                System.out.println(value + " Fahrenheit " + ((value-32)*5/9) + " Celciusdur'dır" );
                break;
            default:
                System.out.println("Geçerli seçim yapılmadı");
        }







    }
}
