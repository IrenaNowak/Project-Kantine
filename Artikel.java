public class Artikel {

    private String naam;
    private double prijs;

    /**
     * Constructor waarin de velden worden geinitaliseerd
     *
     * @param naam (String)
     * @param prijs (double)
     */
    public Artikel(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    /**
     * Lege constructor waarin geen parameters zijn opgegeven
     */
    public Artikel() {
        System.out.println("Er zijn geen prijs en naam opgegeven voor het nieuwe Artikel");
        this.naam = "Empty";
        this.prijs = 0;
    }

    /**
     * Methode om een nieuwe naam op te geven van een Artikel
     *
     * @param nieuweNaam (String)
     */
    public void setNaam(String nieuweNaam) {
        this.naam = nieuweNaam;
    }

    /**
     * Methode die de huidige naam van het Artikel retourneert
     *
     * @return naam als een String
     */
    public String getNaam() {
        return naam;
    }

    /**
     * Methode om de nieuwe prijs op te geven van een Artikel
     *
     * @param nieuwePrijs (double)
     */
    public void setPrijs(double nieuwePrijs) {
        this.prijs = nieuwePrijs;
    }

    /**
     * Methode die de huidige prijs retourneert
     *
     * @return prijs als een double
     */
    public double getPrijs() {
        return prijs;
    }

    /**
     * Methode om de velden terug te geven van deze klasse in een String
     */
    public String toString() {
        System.out.println(this.naam + " " + this.prijs);
    }

}