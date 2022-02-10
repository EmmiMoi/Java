/**
 * Nelikulmio luokka, joka sisältää Kuvio -luokan ominaisuudet
 * ja toteuttaa Kuvio -luokan periviltä luokilta vaaditut abstraktit metodit.
 * @author Aku Ankka
 * @version 0.1.0
 */
public class Nelikulmio extends Kuvio {
    /** Nelikulmion leveys */
    private double leveys;
    /** Nelikuilmion korkeus */
    private double korkeus;

    /** Nelikulmion oletusalustaja, joka tallentaa luontipäivän
     */
    public Nelikulmio() {
        this.tyyppi = "Nelikulmio";
        leveys = 0;
        korkeus = 0;
    }

    /** Nelikulmion alustaja, tallentaa luontipäivän, viivanleveyden ja viivan värin
     * @param leveys Nelikulmion leveys
     * @param korkeus Nelikulmion korkeus
     * @param viivanleveys Nelikulmion piirtoviivan vari
     * @param viivanvari Nelikulmion piirtoviivan leveys
     */
    public Nelikulmio(double leveys, double korkeus, double viivanleveys, String viivanvari) {
        this.tyyppi = "Nelikulmio";
        this.leveys = leveys;
        this.korkeus = korkeus;
        this.viivanleveys = viivanleveys;
        this.viivanvari = viivanvari;
    }

    // getterit
    /** Palauttaa nelikulmion korkeuden desimaalilukuna
     *  @return Nelikulmion korkeus desimaalilukuna.
     */
    public double getKorkeus() {
        return korkeus;
    }

    /** Palauttaa nelikulmion leveys
     *  @return Nelikulmion leveys desimaalilukuna.
     */
    public double getLeveys() {
        return korkeus;
    }

    // toteutetaan abstraktin luokan vaatimat getterit
    /** Palauttaa nelikulmion pinta-alan desimaalilukuna
     *  @return Nelikulmion pinta-ala desimaalilukuna.
     */
    public double getPintaala() {
        return leveys * korkeus;
    }

    /** Palauttaa nelikulmion kehän pituuden desimaalilukuna
     *  @return Nelikulmion kehän pituus desimaalilukuna.
     */
    public double getKeha() {
        return (leveys + korkeus) * 2;
    }

    //setterit
    /** Asettaa nelikulmion leveyden
     *  @param leveys Nelikulmion leveys desimaalilukuna.
     */
    public void setLeveys(double leveys) {
        this.leveys = leveys;
    }

    /** Asettaa nelikulmion korkeuden
     *  @param korkeus Nelikulmion korkeus desimaalilukuna.
     */
    public void setKorkeus(double korkeus) {
        this.korkeus = korkeus;
    }
}