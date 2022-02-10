/** Aliluokka Kissa, joka perii Eläin-luokan ominaisuudet sekä metodit
 * ja lisää piirteitä/ominaisuuksia kissalle
 *@author Emmi Moisio 11/2020
 */
public class Kissa extends Elain{
    private int elamat = 9; //kissan elämien lukumäärä, joita alussa vaikkapa yhdeksän

    /** konstruktorit oletusarvoilla*/
    public Kissa() {
    }
    /** konstruktorit määritetyillä arvoilla*/
    public Kissa (String nimi, boolean elossa, int elamat) {
        super(nimi, elossa); //periytyvät Eläin-luokasta
        this.elamat = elamat;
    }
    /** Metodi, joka asettaa kissan elämien lukumäärän
     * @param elamat */
    public void setElamat (int elamat) {
        this.elamat = elamat;
    }
    /** Metodi, joka vähentää kissan elämiä
     * @param  vahennettavat*/
    public void vahennaElamia(int vahennettavat) {
        if (this.elamat > vahennettavat) //tarkastellaan ensin onko elämiä vähennettävissä annetun lukumäärän verran
            this.elamat = this.elamat - vahennettavat;
        else this.elamat = 0; // jos elmiö yritetään vähentää enemmän kuin niitä on, vähennetään ne mitä on vähennettävissä, joten arvoksi tulee 0

    }

    /** Metodi, joka palauttaa käyttäjälle kissan elämien lukumäärän
     * @return elamat */
    public int getElamat() {
        return elamat;
    }

    public String toString() {
        return "Kissan nimi: " + getNimi() + "\n" +
                "Onko elossa: " + onElossa() + "\n" +
                "Elämien lukumäärä: " + getElamat() + "\n";
    }
    /** Metodi, jolla eläin puhuu
     * @return puhe */
    public String puhu () {
        return "Miau miau!"; }

}
