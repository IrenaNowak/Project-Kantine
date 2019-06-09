package src;

public class Artikel {

    private String naam;
    private double prijs;

    /**
     * Constructor waarin de velden worden geinitaliseerd
     *
     * @param naam  Voor nieuw Artikel
     * @param prijs Voor nieuw Artikel
     */
    public Artikel(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    /**
     * Lege constructor waarin geen parameters zijn opgegeven
     */
    public Artikel() {
        this.naam = "EMPTY";
        this.prijs = 0.00;
    }

    /**
     * Methode om een nieuwe naam op te geven van een Artikel
     *
     * @param nieuweNaam nieuwe naam voor het Artikel
     */
    public void setNaam(String nieuweNaam) {
        this.naam = nieuweNaam;
    }

    /**
     * Methode die de huidige naam van het Artikel retourneert
     *
     * @return naam van het Artikel
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Methode om de nieuwe prijs op te geven van een Artikel
     *
     * @param nieuwePrijs nieuwe prijs voor het Artikel
     */
    public void setPrijs(double nieuwePrijs) {
        this.prijs = nieuwePrijs;
    }

    /**
     * Methode die de huidige prijs retourneert
     *
     * @return prijs van het Artikel
     */
    public double getPrijs() {
        return prijs;
    }

    /**
     * Methode om de velden terug te geven van deze klasse in een String
     *
     * @return String van naam en prijs
     */
    public String toString() {
        return this.naam + " " + this.prijs;
    }

}