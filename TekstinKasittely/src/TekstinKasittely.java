import java.util.*;
import java.io.*; //tekstinkäsittelyyn tarvittavat asiat
public class TekstinKasittely {

    //IO-virheiden käsittelyä varten IOException
    public static void main (String []args) throws IOException {
        Scanner lukija = new Scanner(System.in);

        //Kysytään tiedoston nimi mihin tallennetaan
        System.out.print("Anna To Do listan tiedoston nimi: ");
        String tiedosto = lukija.nextLine();

        //luodaan kirjaston kirjoittaja, parametreihin mikä tiedosto luodaan
        BufferedWriter tdstoKirjoittaja = new BufferedWriter(new FileWriter(tiedosto, true));
        char jatketaan;

        do {
            System.out.print("Anna asia, joka lisataan toDo-listalle: ");
            String tehtava = lukija.nextLine();
            tdstoKirjoittaja.write(tehtava);
            tdstoKirjoittaja.newLine();
            System.out.print("Haluatko jatkaa ToDo-listan taydentamista (K/E?): ");
            jatketaan=lukija.nextLine().charAt(0); //luetaan se eka merkki

            //tehdään ylempi niin kauan kuin jatketaan on Kyllä, muutoin suljetaan tiedosto
        } while (jatketaan == 'k' || jatketaan == 'K');
        tdstoKirjoittaja.close();





    }
}
