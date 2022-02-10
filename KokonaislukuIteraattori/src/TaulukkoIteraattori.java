//rajapintaa toteuttava luokka

public class TaulukkoIteraattori implements Iteraattori { //pilkku iteraattorin jälkeen ja voi laittaa toisen rajapinnan
    private int [] iteroitavaTaulukko;
    private int seuraava = 0;

    public TaulukkoIteraattori(int [] luvut) {
        iteroitavaTaulukko = luvut;
    }
    //getterit

    public int getLukujenMaara() {
        return iteroitavaTaulukko.length;
    }
    //rajapinnan metodit oltava
    public boolean onkoSeuraava () {
        return seuraava < iteroitavaTaulukko.length;
    }
    public int palautaSeuraava() {
        return iteroitavaTaulukko[seuraava++];
    }
}
