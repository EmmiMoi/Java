public class Enum {
    public enum Paiva {MAANANTAI, TIISTAI, KESKIVIIKKO, TORSTAI, PERJANTAI, LAUANTAI, SUNNUNTAI}

    public static void main (String []args) {
        System.out.println(Paiva.valueOf("TORSTAI"));

        for ( Paiva p: Paiva.values())
            System.out.println(p);
    }
}
