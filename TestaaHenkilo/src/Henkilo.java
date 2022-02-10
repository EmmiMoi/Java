import java.util.*;
public class Henkilo {

    //attribuutit
    private String name;
    private String address;
    private int age;
    private String phone;

    //konstruktorit
    public Henkilo (){}

    public Henkilo (String name, String address, int age, String phone) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
    }

    /** Kopio-testailua */
    public Henkilo(Henkilo kopio) {
        this.name = kopio.name;
        this.address = kopio.address;
        this.age = kopio.age;
        this.phone = kopio.phone;
    }

    /**Copy-metodi
     * @return kopio oliosta Henkilo
     */
    public Henkilo copy() {
        return new Henkilo (name, address, age, phone);
    }

    /** getterit ja setterit
     */
    String getName(){
        return name; }
    void setName(String name){
        this.name = name; }
    String getAddress(){
        return address; }
    void setAddress(String address){
        this.address = address; }
    int getAge(){
        return age; }
    void setAge(int age){
        this.age = age; }
    String getPhone(){
        return phone; }
    void setPhone(String phone){
        this.phone = phone; }

    /** palauttaa merkkijonona Henkilö-olion tiedot
     * @return henkilötiedot
     */
    @Override
    public String toString(){
        return "Nimi: " + getName() + "\n" +
                "Osoite: " + getAddress() + "\n" +
                "Ika: " + getAge() + "\n" +
                "Puhelinnumero: " + getPhone();
    }

    /** Vertaa kahta oliota keskenään ja kertoo ovatko ne samanlaiset vai eivät
     * @param verrattava - verrattava olio
     * @return true jos oliot ovat samanlaisia
     */
    public boolean equals (Object verrattava) {
        if (verrattava == null) {
            return false;
        }
        if (getClass() != verrattava.getClass()) {//onko olioiden luokat erilaiset
            return false; //palautetaan false jos poikkeavat toisistaan
        }
        //muunnetaan olio Henkilö-olioksi
        Henkilo verrattavaHlo = (Henkilo)verrattava;
        //verrataan muuttujien arvoja toisiinsa ja jos ne täsmäävät, niin palautetaan "true"
        if (this.name.equals(verrattavaHlo.name) &&
            this.address.equals(verrattavaHlo.address) &&
            this.age == verrattavaHlo.age &&
            this.phone.equals(verrattavaHlo.phone)) {
                return true;
        }
        // jos oliot eivät ole samat, tullaan tänne ja palautetaan "false"
        return false;
    }


}
