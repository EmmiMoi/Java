import java.util.*;
//sisältää GeometrinenOlio: n ominaisuudet
public class Suorakulmio extends GeometrinenOlio {

    ///lisätään nämä attribuutit
    protected double m_leveys;
    protected double m_korkeus;

    /** Luodaan nollan kokoinen suorakulmio */
    public Suorakulmio() { //vain date saa arvon ja pitäisi myös väri ja täytetty
    }

    //välitetään leveys ja korkeus
    public Suorakulmio(double leveys, double korkeus) {
        this.m_leveys = leveys;
        this.m_korkeus = korkeus;
    }

    //kolmas konstruktori kaikilla mausteilla
    public Suorakulmio(double leveys, double korkeus, String vari,
                       boolean taytetty) {
        this.m_leveys = leveys;
        this.m_korkeus = korkeus;
        setVari(vari);
        setTaytetty(taytetty);
        // Tai: super(vari, taytetty); -> kutsutaan kantaluokan konstrukrotia!
    }

    /** Palautetaan leveys
     *  @return leveys*/
    public double getLeveys() {
        return m_leveys;
    }

    /** Asetetaan uusi leveys
     *  @param leveys
     */
    public void setLeveys(double leveys) {
        this.m_leveys = leveys;
    }

    /** Palautetaan korkeus
     *  @return korkeus*/
    public double getKorkeus() {
        return m_korkeus;
    }

    /** Asetetaan uusi korkeus
     *  @return korkeus*/
    public void setKorkeus(double korkeus) {
        this.m_korkeus = korkeus;
    }

    /** Palautetaan ala
     *  @return suorakulmion ala*/
    public double getAla() {
        return m_leveys * m_korkeus;
    }

    public double getHalkaisija() {
        return m_leveys;
    }
    public double getKeha() {
        return 2 * (m_leveys + m_korkeus);
    }

    //ei toStringiä, joten käyttää Geometrisen olion Stringiä.

}
