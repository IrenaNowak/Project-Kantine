public class Artikel {

    /* Velden voor de naam als String en prijs als int */
    private String naam;
    private int prijs;

    /**
     * Constructor waarin de velden worden geinitaliseerd
     *
     * @param naam (String)
     * @param prijs (int)
     */
    public Artikel(String naam, int prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    /**
     * Lege constructor waarin geen parameters zijn opgegeven
     */
    public Artikel() {
        System.out.println("Er zijn geen prijs en naam opgegeven voor het nieuwe Artikel");
        this.naam = null;
        this.prijs = null;
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
     * @param nieuwePrijs (int)
     */
    public void setPrijs(int nieuwePrijs) {
        this.prijs = nieuwePrijs;
    }

    /**
     * Methode die de huidige prijs retourneert
     *
     * @return prijs als een int
     */
    public int getPrijs() {
        return prijs;
    }

    public String toString() {
        System.out.println(naam + " " + prijs);
    }

}