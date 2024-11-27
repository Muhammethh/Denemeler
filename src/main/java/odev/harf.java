package odev;

public class harf {
    public static void main(String[] args) {


        /*
         *******
         *
         *
         *******
         *
         *
         *******
         */



        int satır = 7;

        for (int bulSatır = 1; bulSatır <= satır ; bulSatır++) {

            if (bulSatır==1||bulSatır==satır/2+1||bulSatır==satır){
                for (int i = 1; i <= satır; i++) {
                    System.out.print("*");
                }

            }else {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
