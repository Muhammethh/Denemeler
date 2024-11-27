package Tekrarlar;

public class Şekil {

    public static void main(String[] args) {
         
        
  /*     1       *  
                * *  
               * * *  
              * * * *  
             * * * * *  
            * * * * * *  
           * * * * * * *  
          * * * * * * * *  
         * * * * * * * * *
*/
        
        int satır = 10;

        for (int i = 1; i <satır ; i++) {

            for (int j = i; j < satır; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        

    }
}
