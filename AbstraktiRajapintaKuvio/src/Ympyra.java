import java.lang.Math;

/**
 * Ympyr� luokka, joka sis�lt�� Kuvio -luokan ominaisuudet
 * ja toteuttaa Kuvio -luokan perivilt� luokilta vaaditut abstraktit metodit.
 * @author Lupu Ankka
 * @version 0.1.0
 * @see java.lang.Math
 */
public class Ympyra extends Kuvio {
    /** ympyr�n s�de */
    protected double sade;

    /** Luodaan nollan kokoinen ympyr� */
    public Ympyra(){
        this.tyyppi = "Ympyr�";
        sade = 0;
    }

    /** Ympyr�n alustaja, tallentaa luontip�iv�n, viivanleveyden ja viivan v�rin
     * @param sade Ympyr�n leveys
     * @param viivanleveys Ympyr�n piirtoviivan vari
     * @param viivanvari Ympyr�n piirtoviivan leveys
     */
    public Ympyra(double sade, double viivanleveys, String viivanvari) {
        this.tyyppi = "Ympyr�";
        this.sade = sade;
        this.viivanleveys = viivanleveys;
        this.viivanvari = viivanvari;
    }

    // getterit
    /** Palauttaa ympyr�n s�teen
     *  @return Ympyr�n s�de desimaalilukuna
     */
    public double getSade() {
        return sade;
    }

    // toteutetaan abstraktin luokan vaatimat getterit
    /** Palauttaa ympyr�n pinta-alan desimaalilukuna
     *  @return Ympyr�n pinta-ala.
     */
    public double getPintaala() {
        return Math.PI * Math.pow(sade, 2);
    }

    /** Palauttaa ympyr�n keh�n pituuden desimaalilukuna
     *  @return Ympyr�n keh�n pituus.
     */
    public double getKeha () {
        return Math.PI * sade * 2;
    }

    // setterit
    /** Asettaa ympyr�n s�teen
     *  @param sade Ympyr�n s�de desimaalilukuna
     */
    public void setSade(double sade) {
        this.sade = sade;
    }

}