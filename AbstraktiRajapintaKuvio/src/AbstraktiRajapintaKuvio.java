import java.util.*;
import java.lang.*;
import java.io.*;

/**
 *
 * @author Roope Ankka
 * @author Helppo Heikki
 */
public class AbstraktiRajapintaKuvio {
    /** Kuvio - olioperhettä testaava ohjelma
     * @param args Käynnistyksen yhteydessä annettavat parametrit merkkijonona
     * - näitä ei käsitellä mitenkään tässä ohjelmassa
     */
    public static void main(String [] args) {
        clearScreen();
        System.out.println("Monimuotoisuuden testaus abstraktin Kuvio-luokan kautta\n");

        Kuvio[] kuviot = new Kuvio[4];
        kuviot[0] = new Nelikulmio(10, 20, 1, "255255255");
        kuviot[1] = new Ympyra();
        kuviot[2] = new Ympyra(50, 1.5, "000255000");
        kuviot[3] = new Nelikulmio(50, 5, 2, "125125125");
        kuviot[1].setViivanLeveys(1.2);

        double alatYhteensa = 0.0;
        for (Kuvio k : kuviot) {
            alatYhteensa += k.getPintaala();
            System.out.println(k + "\n Luotujen kuvioiden pinta-ala on nyt: "
                    + String.format("%.2f\n", alatYhteensa));
        }
        odotaEnter();
        clearScreen();

        System.out.println("Kuvio-luokan equals metodin testaus\n");

        if (kuviot[0].equals(kuviot[3]))
            System.out.println(kuviot[0] + "\n on samanlainen kuin\n" + kuviot[3]);
        else
            System.out.println(kuviot[0] + "\n on erilainen kuin\n" + kuviot[3]);

        Kuvio sama = new Nelikulmio(10, 20, 1, "255255255");
        if (kuviot[0].equals(sama))
            System.out.println(kuviot[0] + "\n on samanlainen kuin\n" + sama);
        else
            System.out.println(kuviot[0] + "\n on erilainen kuin\n" + sama);

        odotaEnter();
        clearScreen();

        //COMPARABLE-METODIN KÄSITTELY
        System.out.println("\n CompareTO -metodi");

        try {

            if (kuviot[0].compareTo(kuviot[3]) >= 1)
                System.out.println(kuviot[0] + "\n on pinta alaltaan on suurempi kuin \n" + kuviot[3]);
            else if (kuviot[0].compareTo(kuviot[3]) <= 1)
                System.out.println(kuviot[0] + "\n on pinta alaltaan on pienempi kuin\n" + kuviot[3]);
            else
                System.out.println(kuviot[0] + "\n on pinta alaltaan on yhtäsuuri kuin\n" + kuviot[3]);
            if (kuviot[0].compareTo(null) > 1)
                System.out.println("Tätä ei pitäisi näkyä koskaan");

        }
        //poikkeusten käsittely
        catch (NullPointerException tallainen) {
            System.out.println("Vertailtavan kuvion viite on null");
            tallainen.printStackTrace(); //palauttaa virheellisen tiedot
        }
        catch (ClassCastException sellainen) {
            System.out.println("ei kuulu kuvioperheeseen");
            sellainen.printStackTrace(); //palauttaa virheellisen tiedot
        }

        //COMPARATOR-TESTI
        odotaEnter();
        clearScreen();

        System.out.println("COMPARATOR-testi");
        ArrayList<Kuvio> ku = new ArrayList <Kuvio>();
        for  (int i = 0; i<kuviot.length; i++)
            ku.add(kuviot[i]);

        System.out.println("Lajittelematon lista: ");
        for  (int i = 0; i < ku.size(); i++) {
            System.out.println(ku.get(i));
        }
        Collections.sort (ku, new Pintaalanmukaan());
        System.out.println("Lista lajiteltu pinta-alan mukaan: ");
        for  (int i = 0; i < ku.size(); i++)
            System.out.println(ku.get(i) + " , \nPinta-ala: " + ku.get(i).getPintaala());

        Collections.sort (ku, new Tyypinmukaan());
        System.out.println("Lista lajiteltu tyypin mukaan: ");
        for  (int i = 0; i < ku.size(); i++)
            System.out.println(ku.get(i));

    }

    public static void clearScreen() {
        try {
            if(System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                System.out.print("\033\143");
        } catch (IOException | InterruptedException ex) {}
    }

    public static void odotaEnter() {
        System.out.println("Paina enter - näppäintä jatkaaksesi" );
        Scanner input = new Scanner (System.in);
        input.nextLine();


    }
}

