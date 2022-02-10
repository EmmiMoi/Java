/** Rajapinta
 */
public interface Iteraattori {
    /**
     * Palauttaa true, jos iterointi voi edetä seuraavaan lukuun
     */
    public boolean onkoSeuraava ();
    /**
     * Palauttaa iteraation seuraavan luvun<
     */
    public int palautaSeuraava();
}
