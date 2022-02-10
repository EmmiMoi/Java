import java.util.*;
public class TestaaGeometrinenOlio {

    public static void main(String [] args) {
        // luodaan nelja oliotam object on kaikista ylin luokka,
        //kaikkia voidaan pitää samantyyppisinä eli ovat tyyppiä object,
        //käääntöpuolena ominaisuuksia häviää
        Object olio1 = new Ympyra(1.0);
        Object olio2 = new Suorakulmio(1.0,1.0);
        Object olio3 = new Ympyra(6.0, "keltainen", true);
        Object olio4 = new Suorakulmio(11.6, 6.0, "vihrulainen", false);
        //yksi neliö
        Nelio olio5 = new Nelio(10, "sini", false);
        //voisi olla myäs Suorakulmio olio4 = new Suorakulmio

        // ei toimi (olio3.getSade()), koska Object-tyyppinen

        // luodaan taulukko ja tässä kohtaa paras olla object, koska muuten kaikki ei olisi samantyyppisiä
        Object [] oli_jot = new Object [5]; //yhteinen nimittäjä myös Geometrinen olio
        // viedään kuviot taulukkoon
        oli_jot [0] = olio1;
        oli_jot [1] = olio2;
        oli_jot [2] = olio3;
        oli_jot [3] = olio4;
        oli_jot [4] = olio5;

        //Kaydaan taulukko läpi toStringillä, kuvastaa monimuotoisuutta
        //tulostaa Suorakulmiolle Geometrisen olion tiedot ja ympyrälle ympyrän, jos
        //geometrisella oliolla ei toStringiä, tulostetaan Suorakulmiolle Object-luokasta
        for (int i = 0; i < 5; i++) {
            System.out.println(oli_jot[i].toString()); // castataan Object GeometrinenOlio:ksi

            //onko tuossa ympyräluokanolio
            if (oli_jot [i] instanceof Ympyra){
                System.out.println("YMPYRÄÄÄ.");
            }
            //onko tässä neliöluokan olio
            if (oli_jot [i] instanceof Nelio){
                System.out.println("Nelio.");}
            if (oli_jot [i] instanceof Suorakulmio){
                System.out.println("SUORIS.");}
        }

    }


}