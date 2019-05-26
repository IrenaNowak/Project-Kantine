public class Persoon {

    private String BSN;
    private String voornaam;
    private String achternaam;
    private Datum geboortedatum;
    private char geslacht;

    /**
     * Constructor voor het aanmaken van een nieuw Persoon
     *
     * @param BSN van Persoon
     * @param voornaam van Persoon
     * @param achternaam van Persoon
     * @param geboortedatum van Persoon
     * @param geslacht van Persoon
     */
    public Persoon(String BSN, String voornaam, String achternaam, Datum geboortedatum, char geslacht) {
        this.BSN = BSN;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
        if(geslacht != 'm' && geslacht != 'v') {
            System.err.println("Geen geldig geslacht opgegeven");
        } else {
            this.geslacht = geslacht;
        }
    }

    /**
     * Constructor voor het aanmaken van een nieuw Persoon zonder opgegeven gegevens
     */
    public Persoon() {
        this.BSN = "BSN onbekend";
        this.voornaam = "Voornaam onbekend";
        this.achternaam = "Achternaam onbekend";
        this.geboortedatum = new Datum(0, 0, 0);
        this.geslacht = 'o';
    }

    /**
     * Deze methode past het BSN aan van Persoon
     *
     * @param nieuweBSN (String)
     */
    public void setBSN(String nieuweBSN) {
        this.BSN = nieuweBSN;
    }

    /**
     * Deze methode past de voornaam aan van Persoon
     *
     * @param nieuweVoornaam (String)
     */
    public void setVoornaam(String nieuweVoornaam) {
        this.voornaam = nieuweVoornaam;
    }

    /**
     * Deze methode past de achternaam aan van Persoon
     *
     * @param nieuweAchternaam (String)
     */
    public void setAchternaam(String nieuweAchternaam) {
        this.achternaam = nieuweAchternaam;
    }

    /**
     * Deze methode past de geboortedatum aan van Persoon
     *
     * @param nieuweGeboortedatum (Datum)
     */
    public void setGeboortedatum(Datum nieuweGeboortedatum) {
        this.geboortedatum = nieuweGeboortedatum;
    }

    /**
     * Deze methode past het geslacht aan van Persoon als "man" of "vrouw"
     *
     * @param nieuwGeslacht (String)
     */
    public void setGeslacht(char nieuwGeslacht) {
        if(nieuwGeslacht != 'm' && nieuwGeslacht != 'v') {
            System.err.println("Geen geldig geslacht opgegeven");
        } else {
            this.geslacht = nieuwGeslacht;
        }
    }

    /**
     * Deze methode retourneert het BSN van Persoon
     *
     * @return BSN van Persoon
     */
    public String getBSN() {
        return this.BSN;
    }

    /**
     * Deze methode retourneert de voornaam van Persoon
     *
     * @return voornaam van Persoon
     */
    public String getVoornaam() {
        return this.voornaam;
    }

    /**
     * Deze methode retourneert de achternaam van Persoon
     *
     * @return achternaam van Persoon
     */
    public String getAchternaam() {
        return this.achternaam;
    }

    /**
     * Deze methode retourneert de geboortedatum als een String via de methode Datum.getDatumAsString()
     *
     * @return geboortedatum van Persoon als String
     */
    public String getGeboortedatum() {
        return geboortedatum.getDatumAsString();
    }

    /**
     * Deze methode geeft het geslacht terug van Persoon
     *
     * @return String van geslacht (Man, Vrouw of Onbekend)
     */
    public String getGeslachtAsString() {
        if(geslacht == 'v') {
            return "Vrouw";
        } else if(geslacht == 'm') {
            return "Man";
        } else {
            return "Onbekend";
        }
    }

    /**
     * Deze methode geeft alle opgegeven velden terug als een String
     *
     * @return String met alle waarden van Persoon
     */
    public String toString() {
        return this.BSN + " " + this.voornaam + " " + this.achternaam + " " + this.geboortedatum.getDatumAsString() + " " + getGeslachtAsString();
    }

}
