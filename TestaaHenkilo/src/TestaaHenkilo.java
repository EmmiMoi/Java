public class TestaaHenkilo {
    public static void main (String []args) {

        Henkilo eka = new Henkilo();
        Henkilo toka = new Henkilo();

        //asetetaan henkiloille tiedot settereiden avulla
       eka.setName("Pirjo"); //Voisi myös kysyä, jolloin name = lukija.nextLine, tällöin olio luotaisiin vasta kysymisen jälkeen ja parametreiksi kysyttävät
       eka.setAge(12);
       eka.setAddress("Kirkkokatu 3");
       eka.setPhone("123456");

       toka.setName("Pekka");
       toka.setAge(16);
       toka.setAddress("Jokukatu 6");
       toka.setPhone("987654");

       //luodaan kolmas henkilo, joka on kopio Henkilosta toka
      Henkilo kolmas = toka.copy();

        // Testataan olioiden samuus equals-metodilla
        System.out.println("Ovatko toka ja kolmas samanlaisia: " + toka.equals(kolmas));
        System.out.println("Ovatko eka ja toka samanlaisia: " + eka.equals(toka));
        System.out.println("Ovatko kolmas ja toka samanlaisia: " + kolmas.equals(toka));

        System.out.println("************");
        //Tulostetaan kaikkien olioiden tiedot:
        System.out.println(eka);
        System.out.println("************");
        System.out.println(toka);
        System.out.println("************");
        System.out.println(kolmas);
    }
}
