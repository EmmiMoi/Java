import java.util.*;
//sisältää GeometrinenOlio: n ominaisuudet
public class Nelio extends Suorakulmio {

    /** Luodaan nollan kokoinen suorakulmio */
    public Nelio() { //vain date saa arvon ja pitäisi myös väri ja täytetty
    }

    //välitetään leveys ja korkeus
    public Nelio(double sivu) {
        this.m_leveys = sivu;
        this.m_korkeus = sivu;
    }

    //kolmas konstruktori kaikilla mausteilla
    public Nelio(double sivu, String vari,
                       boolean taytetty) {
        this.m_leveys =sivu;
        this.m_korkeus = sivu;
        setVari(vari);
        setTaytetty(taytetty);
        // Tai: super(vari, taytetty); -> kutsutaan kantaluokan konstrukrotia!
    }

    /** Palautetaan leveys
     *  @return leveys*/
    public double getLeveys() {
        return m_leveys;
    }


    public void setSivu(double sivu) {
        this.m_leveys = sivu;
    }


    /** Palautetaan ala
     *  @return suorakulmion ala*/
    public double getAla() {
        return m_leveys * m_korkeus;
    }

    public double getKeha() {
        return 2 * (m_leveys + m_korkeus);
    }

    public String toString() {
        return" Nelio yms.";
    }

}
