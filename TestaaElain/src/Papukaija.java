/** Aliluokka Papukaija, joka perii Eläin-luokan ominaisuudet sekä metodit
 * ja lisää piirteitä/ominaisuuksia Papukaijalle
 *@author Emmi Moisio 11/2020
 */
public class Papukaija extends Elain {
    private String isanta = "ei asetettu"; //Papukaijan merirosvoisännän nimi

    /** konstruktorit oletusarvoilla*/
    public Papukaija(){
    }
    /** konstruktorit määritetyillä arvoilla*/
    public Papukaija(String nimi, boolean elossa, String isanta) {
        super(nimi, elossa); //periytyy Eläin-luokasta
        this.isanta = isanta;
    }
    /** Metodi, joka asettaa papukaijan merirosvoisännän nimen.
     * @param isanta */
    public void setIsanta (String isanta) {
        this.isanta = isanta;
    }
    /** Metodi, joka selvittää käyttäjälle merirosvoisännän nimen
     * @return isanta */
    public String getIsanta() {
        return isanta;
    }

    public String toString() {
        return "Papukaijan nimi: " + getNimi() + "\n" +
                "Onko elossa: " + onElossa() + "\n" +
                "Isännän nimi: " + getIsanta() + "\n";

    }
    /** Metodi, jolla eläin puhuu
     * @return puhe */
    public String puhu () {
        return "Papu-Kai-Ja!"; }
}
