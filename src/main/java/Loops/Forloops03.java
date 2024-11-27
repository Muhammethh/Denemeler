package Loops;

public class Forloops03 {

    public static void main(String[] args) {
        /*
        ornek 1: Asagidaki ciktiyi verecek kodu yaziniz
        Example 1: Write the code to give the following output
            Week: 1
                Day: 1
                Day: 2
                Day: 3
                .....
            Week: 2
                Day: 1
                Day: 2
                Day: 3
                ....    */

        for (int i = 1; i < 5; i++) {
            System.out.println("Week " + i);

            for (int j = 1; j <8 ; j++) {
                System.out.println("    Day " + j );
            }
        }

        /* Ornek 2:  Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz.
        Example 2:  Create the code that prints the following figure to the console.

              X X X X X
              X X X X X
              X X X X X    */


        for (int i = 1; i < 4; i++) {

            for (int j = 1; j <6 ; j++) {
                System.out.print("x");
            }
            System.out.println();
        }


    }
}
