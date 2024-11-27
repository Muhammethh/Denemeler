package Tekrarlar;

public class MethodCreation01 {

    public static void main(String[] args) {

        // ornek 1: Toplama yapan bir method olusturunuz.
        // Example 1: Create a method that performs addition

        System.out.println(sum(3,2));

        multiply2(3,2,2);

        word("Merhaba");
        System.out.println(varargs(5,5,5,5,5,5));

    }

    public static int sum (int a, int b){

        return a+b;
    }

    //ornek 2: Verilen 3 sayidan ilk ikisini carpan ve sonucu ucuncu sayi ile toplayan method olusturunuz.
    //example 2: Create a method that multiplies the first two of the given 3 numbers and adds the result with the third number.

    private static void multiply2(int a, int b, int c){

        System.out.println(a*b+c);
    }

    //ornek 3: Girilen bir kelimeyi konsola yazdiran bir method olusturunuz (void yani return yok)
    //example 3: Create a method that prints an entered word to the console

    //Eger bir method yeni bir data uretmiyor ise return type’i void olur.void ise return yazilmaz

    public static void word(String a){

        System.out.println(a);

    }

    public static int varargs(int... m){

        int sum = 0;

        for (int w:m){

            sum= sum +w;
        }

        return sum;
    }


}
