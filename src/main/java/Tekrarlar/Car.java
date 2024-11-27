package Tekrarlar;

public class Car {

    //1-variable’lar olusturalim (pasif ozellikler)

    String brand = "Audi";
    String model = "A8";
    int year = 2024;
    boolean hybrid = true;



    //2-method’lar olusturalim (aktif ozellikler)


    public void mot() {

        System.out.println(brand + " Hızlı hareket eder");
    }

    public void mot2() {

        System.out.println(brand + " güvenlidir");
    }



    //3-CarRunner yani main’li class’i olusturalim


    public Car(String brand, String model, int year) {

        this.brand = brand;
        this.model = model;
        this.year = year;
    }


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
