import java.util.*;

/**
 * Luokka Kuvio esittelee yksinkertaisen perusmallin geometristen olioiden piirteille.
 * @author Jyri Kemppainen
 * @version 0.0.1
 * @see java.util.Date
 * @see #getTyyppi
 * @see #getViivanVari
 */
public abstract class Kuvio implements Comparable <Kuvio>  { //comparable koskee kuvioperhettä
    /** Kuvion tyyppi */
    protected String tyyppi = "Tuntematon";
    /** Kuvion piiroviivan väri RGB -muoto */
    protected String viivanvari = "";
    /** Kuvion piirtoviivan leveys */
    protected double viivanleveys = 0;
    /** Kuvion luontipäivä - java.util.Date */
    protected Date luontipaiva;


    /** Kuvion oletusalustaja, joka tallentaa luontipäivän
     */
    public Kuvio() {
        this.luontipaiva = new Date();
    }

    /** Kuvion alustaja, tallentaa luontipäivän, viivanleveyden ja viivan värin
     * @param viivanleveys Kuvion piirtoviivan leveys
     * @param viivanvari Kuvion piirtoviivan vari
     */
    public Kuvio(double viivanleveys, String viivanvari) {
        this.luontipaiva = new Date();
        this.viivanleveys = viivanleveys;
        this.viivanvari = viivanvari;
    }

    // getterit
    /** Palauttaa kuvion tyypin
     * @return Kuvion tyyppi merkkijonona.
     */
    public final String getTyyppi() {
        return tyyppi;
    }

    /** Palauttaa kuvion piirtoviivan värin
     * @return Kuvion piirtoviivan väri RGB -muodossa merkkijonona.
     */
    public String getViivanVari() {
        return viivanvari;
    }

    /** Palauttaa kuvion piirtoviivan leveyden
     * @return Kuvion piirtoviivan leveys millimetrit desimaalilukuna.
     */
    public double getViivanLeveys() {
        return viivanleveys;
    }

    /** Palauttaa kuvion luontipäivämäärän
     *  @return Kuvion luontipäivämäärä - java.util.Date
     */
    public Date getLuontiPaiva() {
        return luontipaiva;
    }

    /** Palauttaa kuvion pinta-alan desimaalilukuna
     *  @return Kuvion pinta-ala desimaalilukuna.
     */
    public abstract double getPintaala ();

    /** Palauttaa kuvion kehän pituuden desimaalilukuna
     *  @return Kuvion kehän pituus desimaalilukuna.
     */
    public abstract double getKeha ();

    // setterit
    /** Asetetaan kuvion viivan leveys.
     *  @param viivanleveys Kuvion viivan leveys mm.
     */
    public void setViivanLeveys(double viivanleveys) {
        this.viivanleveys = viivanleveys;
    }

    /** Asetetaan kuvion piirtoviivan väri
     *  @param viivanvari Kuvion piirtoviivan väri RGB -muodossa.
     */
    public void setVari(String viivanvari) {
        this.viivanvari = viivanvari;
    }

    // muut metodit
    /** Palautetaan koko kuviota kuvaava merkkijono
     *  @return Kuvion tiedot merkkijonona.
     */
    @Override
    public String toString() {
        return getTyyppi() + " on luotu " + getLuontiPaiva()
                + "\n\t -Viivanleveys: " + getViivanLeveys()
                + "\n\t -RGB väri: " + getViivanVari();
    }

    @Override
    /** Vertailee on tämä kuvio samanlainen kuin vertailtava olio
     *  @return Palauttaa true, jos kuviot ovat samanlaisia, muutoin false.
     */
    public boolean equals(Object obj) {
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())	   // oliot eri luokkaa => false
            return false;
        Kuvio k = (Kuvio)obj;
        if(viivanleveys != k.viivanleveys)    // viivaleveydet eroavat => false
            return false;
        if(!viivanvari.equals(k.viivanvari)) // viivavarit eroavat => false
            return false;
        if(!tyyppi.equals(k.tyyppi)) 		   // Kuvioiden tyypit eroavat => false
            return false;
        return true;
    }
    /** Vertaillaan tämän olion  pinta-alaa toiseen samanlaiseen olioon
     *  @return Palauttaa kokonaisluvun 1, jos this-olion pinta-ala on suurempi,
     *          - 1 jos pienempi, 0 jos sama
     */
    //COMPARABLE-LIITTYMÄ (vertaa yhteen) huom. sidottu luokkaan ylhäällä
    public int compareTo(Kuvio k) {
        //tulee null
        if (k == null)  //null eli olioita ei voida vertailla
            throw new NullPointerException();
        if (! (k instanceof Kuvio)) { //kuuluuko k kuvioperheeseen (mutta tässä tilanteessa aina kuuluu)
            throw new ClassCastException();
        }
        if (getPintaala() > k.getPintaala()) //vertaillaan pinta-aloja jos suutempi niin palautetaan 1
            return 1;
        else if (getPintaala() < k.getPintaala()) //jos pienempi
            return -1;
        else //jos sama
            return 0;
    }

}
// VERTAILLAAN KAHTA KUVIOLUOKAN OLIOTA KESKENÄÄN pinta-alan mukaan
// uusi luokka joka sisältää comparator-liittymän
class Pintaalanmukaan implements Comparator < Kuvio > {
    //vertaillaan khden Kuvio-olion pinta-alaa, palautetaan 1, jos pinta-ala suurempi kuin k2. (-1 jos pienempi,
    // 0, jos sama
    public int compare (Kuvio k1, Kuvio k2) {
        return k1.compareTo(k2);
    }


}
// sama tyypin mukaan, tyyppi on merkkijono
class Tyypinmukaan implements Comparator < Kuvio > {

public int compare(Kuvio k1,Kuvio k2){
        return (k1.getTyyppi().compareTo(k2.getTyyppi()));
        }
}
