import java.util.*;

public class Dienblad {
    private Stack<Artikel> artikelen;
    private Persoon persoon;

    /**
     * Constructor voor het aanmaken van een nieuw dienblad
     */
    public Dienblad() {
        this.artikelen = new Stack<>();
    }

    /**
     * Constructor om een Dienblad aan een Persoon toe te kennen
     *
     * @param persoon die Dienblad heeft
     */
    public Dienblad(Persoon persoon) {
        this();
        this.persoon = persoon;
    }

    /**
     * Methode om artikel aan dienblad toe te voegen
     *
     * @param artikel toegevoegd aan Dienblad
     */
    public void voegToe(Artikel artikel) {
        artikelen.add(artikel);
    }

    /**
     * Retourneert de gegevens van de Persoon
     *
     * @return Persoon persoonsgegevens
     */
    public Persoon getPersoon() {
        return this.persoon;
    }

    /**
     * Methode om de Persoon aan te passen
     *
     * @param persoon welk Persoon
     */
    public void setPersoon(Persoon persoon) {
        this.persoon = persoon;
    }

    /**
     * Iterator over de Stack artikelen met type Artikel
     *
     * @return Iterator<Artikel> artikelen
     */
    public Iterator<Artikel> getArtikelIterator() {
        return artikelen.iterator();
    }

}

