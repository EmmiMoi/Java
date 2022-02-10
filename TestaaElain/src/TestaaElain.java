/** Eläimen aliluokkia testaava ohjelma.
 *@author Emmi Moisio 11/2020
 */

import java.util.*;

public class TestaaElain {
    public static void main (String []args) {
        Scanner input = new Scanner (System.in);

        /** Luodaan oliot kaikista aliluokista*/
        Kissa kissanen = new Kissa();
        Papukaija kaijaPapunen = new Papukaija();
        Lammas päkäpässi = new Lammas();

        /** määritellään kissalle tietoja*/
        kissanen.setElamat(7);
        kissanen.setNimi("Mörkö");
        kissanen.asetaKuolleeksi(false); //asetetaan kuolleeksi
        kissanen.vahennaElamia(5); //vähennetään elämiä
        /** tulostetaan tiedot kissa-oliosta. */
        System.out.println(kissanen);

        /** määritellään lampaalle tietoja ja tulostetaan tiedot*/
        päkäpässi.setVari(false);
        päkäpässi.setNimi("Pässipää");
        päkäpässi.asetaKuolleeksi(true); //asetetaan eläväksi
        System.out.println(päkäpässi);

        /** määritellään lampaalle tietoja ja tulostetaan tiedot*/
        kaijaPapunen.setNimi("Kaija");
        kaijaPapunen.setIsanta("Pertti-merirosvo");
        System.out.println(kaijaPapunen);

        /** Luodaan Elain-taulukko, johon lisätään kaikki kolme aliluokan oliota*/
        Elain [] elaimetPuhuu = new Elain[3];
        elaimetPuhuu [0] = kissanen; // kissa-olio
        elaimetPuhuu [1] = kaijaPapunen; // papukaija-olio
        elaimetPuhuu [2] = päkäpässi; // lammas-olio

        /** Käydään silmukassa läpi kaikki kolme eläintä ja tulostetaan puhe kutsumalla puhe-metodia*/
        for ( Elain e : elaimetPuhuu) {
            System.out.println(e.getNimi() + " sanoo: " + e.puhu());
        }




    }

}
