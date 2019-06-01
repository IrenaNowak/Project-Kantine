import java.util.Stack;

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
     * Methode om aantal artikelen op dienblad te tellen
     *
     * @return Het aantal artikelen op het Dienblad
     */
    public int getAantalArtikelen() {
        return artikelen.size();
    }

    /**
     * Methode om de totaalprijs van de artikelen op Dienblad uit te rekenen
     *
     * @return De totaalprijs van de artikelen op Dienblad
     */
    //public double getTotaalPrijs() {
    //    double totaalPrijs = 0;
    //    for (int i = 0; i < getAantalArtikelen(); i++) {
    //        totaalPrijs += artikelen.get(i).getPrijs();
   //     }
    //    return totaalPrijs;
    //}

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

}

