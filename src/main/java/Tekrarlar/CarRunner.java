package Tekrarlar;

public class CarRunner {
    public static void main(String[] args) {


        //4- Car class’indan bir object uretelim

        Car object = new Car("mercedes","c180",2020);

        System.out.println(object.brand);
        System.out.println(object.model);
        System.out.println(object.year);
        System.out.println(object.hybrid);

        object.mot();
        object.mot2();

        System.out.println("--------------------------");
        Car object2 =new Car("tofaş","şahin",1995);
        System.out.println(object);
        System.out.println(object2);




        //5- Car class’a donup, constructor olusturalim


    }
}
