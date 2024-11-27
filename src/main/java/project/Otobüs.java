package project;

import java.util.ArrayList;
import java.util.List;

public class Otobüs {

    public String plaka;
    public String peron;
    public String firma;

   public List<String> koltuk = new ArrayList<>();

    public Otobüs(String plaka, String peron, String firma) {
        this.plaka = plaka;
        this.peron = peron;
        this.firma = firma;

        for (int i = 1; i <33 ; i++) {

            this.koltuk.add(String.valueOf(i));

        }

    }



}
