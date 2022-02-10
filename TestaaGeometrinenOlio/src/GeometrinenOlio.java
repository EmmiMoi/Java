import java.util.*;
//kantaluokkana käytettävä luokka
public class GeometrinenOlio {
    //attribuutit protected määreellä
    protected String m_vari = "valkoinen";
    protected boolean m_taytetty = true; //onko täyttövärjätty
    protected Date m_luontiPaiva; //milloin luotu (päivämäärä Date)

    //luodaan yeinen geometrinen olio, joka luotu nyt ja muuten oletusarvoilla
    public GeometrinenOlio() {
        this.m_luontiPaiva = new Date(); //date-olio
    }
    //yleinen geomeetrinen olio tietyillä arvoilla
    public GeometrinenOlio(String vari, boolean taytetty) {
        this.m_luontiPaiva = new Date();
        this.m_vari = vari;
        this.m_taytetty = taytetty;
    }
    public String getVari() {
        return m_vari;
    }
    public void setVari(String vari) {
        this.m_vari = vari;
    }
    public boolean onTaytetty() {
        return m_taytetty;
    }
    public void setTaytetty(boolean taytetty) {
        this.m_taytetty = taytetty;
    }
    public Date getLuontiPaiva() {
        return m_luontiPaiva;
    }
    public String toString() { // periytyy object-luokasta, mutta aina lähimpänä olevasta luokasta
        return "luotu " + m_luontiPaiva + "\nvari: " + m_vari +
                " ja taytetty: " + m_taytetty;
    }
    public double getKeha() { //purkkaviritys
        return 0.0;
    }

}
