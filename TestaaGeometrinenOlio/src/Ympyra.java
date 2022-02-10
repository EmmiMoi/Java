/**
 * Ympyra.java kuvaa yksinkertaista ympyrää
 * joka sisältää myös geometrisen olion yleisen ominaisuudet.
 *
 */
//peritään geometrinenOlio-luokka extend-merkinnällä
public class Ympyra extends GeometrinenOlio {

   // uusi attribuutti tähän luokkaan
    private double m_sade;

    //nollaympyrä
    public Ympyra() {
        m_sade = 0.0;
    }
    //välitetyt parametrit
    public Ympyra(double sade) {
        this.m_sade = sade; //this ei pakko, koska eri nimet
    }
    //kolmas konstruktori kantaluokkaan liittyen
    public Ympyra(double sade, String vari, boolean taytetty) {
        super(vari, taytetty); //pakko kirjoittaa (set.Vari(vari) ja set.Taytetty(taytetty)
        this.m_sade = sade;
    }

    //palauttaa säteen
    public double getSade() {
        return m_sade;
    }

    public void setSade(double sade) {
        this.m_sade = sade;
    }

    //pinta-Ala
    public double getAla() {
        return m_sade * m_sade * Math.PI;
    }

    public double getKeha() {
        return 2 * m_sade * Math.PI;
    }

    public double getHalkaisija() {
        return 2 * m_sade;
    }

    public String toString() { // Object
        return "Ympyra " + m_luontiPaiva + ", jonka sade on " + m_sade;
    }

}
