/** Yliluokka Eläin, joka sisältää eläimen ominaisuudet ja metodit
 * Tästä luokasta ei voi tehdä oliota.
 *@author Emmi Moisio 11/2020
 */

public abstract class Elain {
    //attribuutit
     protected String nimi; //eläimen nimi
     protected boolean elossa = true;

    /** konstruktorit oletusarvoilla*/
    public Elain() {
    }
    /** konstruktorit määritetyillä arvoilla*/
    public Elain (String nimi, boolean elossa) {
        this.nimi = nimi;
        this.elossa = elossa;
    }

    /** Getterit ja setterit */

    /** Palauttaa eläimen nimen
     * @return eläimen nimi */
    public String getNimi() {
        return nimi;
    }
    /** Asettaa eläimen nimen
     * @param nimi */
    public void setNimi(String nimi) {
        this.nimi =nimi;
    }
    /** Palauttaa tiedon onko eläin elossa vai kuollut
     * @return onko eläin elossa */
    public String onElossa () {
        if (elossa)
            return "elossa";
        return "kuollut";
    }
    /** Asettaa eläimen tilan kuolleeksi
     * @param elossa */
    public void asetaKuolleeksi(boolean elossa) {
        this.elossa = elossa;

    }
    /** Abstrakti puhu-metodi, joka on jokaisella aliluokalla oma*/
    public abstract String puhu();


}
