public class KokonaislukuIteraattori {
    public static void main (String [] args) {
        //luodaan taulukko
        int [] lukuja = new int[] {2,4,6,8,10};

        Iteraattori i = new TaulukkoIteraattori(lukuja);
        int summa = 0;

        while(i.onkoSeuraava()) {
            summa += i.palautaSeuraava();
            System.out.println(summa);
        }
    }

}
