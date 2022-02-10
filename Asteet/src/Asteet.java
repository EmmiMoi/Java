import java.util.*;
public class Asteet {
    public static void main (String[]args){
        Scanner lukija= new Scanner(System.in);
        int pienin=0;
        int suurin=0;
        int erotus;
        int aste=0;


        System.out.println("Syota lampotila: ");
        aste = lukija.nextInt();
        pienin = aste;
        suurin = aste;
        while (aste != -99) {
            System.out.println("Syota lampotila: ");
            aste = lukija.nextInt();
            if (aste<pienin && aste != -99){
                pienin = aste;
            }
            else if (aste>suurin) {
                suurin = aste;
            }
        }
        erotus = suurin-pienin;
        if (aste == -99) {
            System.out.println("Pienin lampotila oli " + pienin + " ja suurin lampotila oli " + suurin);
            System.out.println("Suurimman ja pienimman lampotilan valinen erotus oli " + erotus);
        }


    }
}
