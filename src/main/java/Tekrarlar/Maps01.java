package Tekrarlar;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps01 {
    public static void main(String[] args) {

        HashMap<String, Integer> myMap = new HashMap<>();

        myMap.put("Ali Can", 13);
        myMap.put("Veli Han", 18);
        myMap.put("Ayse Kaya", 15);
        myMap.put("Fatma Yilmaz", 19);
        myMap.put("Ali Can", 25); //key tekrarlı kullanıldığında son value aktif olur.
        System.out.println(myMap); //{Fatma Yilmaz=19, Ali Can=25, Veli Han=18, Ayse Kaya=15}

        //Ornek 1: myMap’deki kisilerin yaslarinin ortalamasi nedir?

        Collection<Integer> values = myMap.values();

        int toplam =0;
        for (Integer w: values){

            toplam= toplam + w;
        }
        System.out.println(toplam/values.size());


        //Ornek 2: Verilen Map’deki kisi isimlerinin character sayisi ile yaslarinin toplamini bulunuz.
        //Example 2: Find the sum of the number of characters and the age of the person names in the given Map.

        //Java’da Map.Entry kullanarak bir Set üzerinde loop yapabilir ve
        // hem anahtarları (getKey()) hem de değerleri (getValue()) elde edebilirsiniz.

        HashMap<String, Integer> people = new HashMap<>();

        people.put("Ali",3);
        people.put("Can",5);
        people.put("Ayşe",2);

       Set<Map.Entry<String,Integer>> mySet  = people.entrySet();

        int sum=0;

        for (Map.Entry<String,Integer> w: mySet){

            sum = sum + w.getKey().length() + w.getValue();

        }
        System.out.println("sum = " + sum);

    }
}
