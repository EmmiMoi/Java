/** Aliluokka Lammas, joka perii Eläin-luokan ominaisuudet sekä metodit
 * ja lisää piirteitä/ominaisuuksia lampaalle.
 * @author Emmi Moisio 11/2020
 */
public class Lammas extends Elain {
    private boolean valkoinen = true;

    /** konstruktorit oletusarvoilla*/
    public Lammas(){
    }
    /** konstruktorit määritetyillä arvoilla*/
    public Lammas (String nimi, boolean elossa, boolean valkoinen) {
        super(nimi, elossa); //periytyy Eläin-luokasta
        this.valkoinen = valkoinen;
    }
    /** Metodi, joka asettaa lampaan värin.
     * Jos lammas on valkoinen, asetetaan parametreihin true, jos musta, asetetaan false.
     * @param valkoinen */
    public void setVari(boolean valkoinen) {
        this.valkoinen = valkoinen;

    }
    /** Metodi, joka kertoo lampaan värin. Jos boolean= true, väri on valkoinen, jos false, väri on musta.
     * @return valkoinen */
    public String getVari() {
        if (valkoinen)
            return "valkoinen";
        return "musta";
    }
    public String toString() {
        if (valkoinen)
            return "Lampaan nimi: " + getNimi() + "\n" +
                "Onko elossa: " + onElossa() + "\n" +
                "Väri: valkoinen" ;
        return "Lampaan nimi: " + getNimi() + "\n" +
                "Onko elossa: " + onElossa() + "\n" +
                "Väri: musta" + "\n";
    }
    /** Metodi, jolla eläin puhuu
     * @return puhe */
    public String puhu () {
        return "BÄÄ BÄÄ!"; }
}

