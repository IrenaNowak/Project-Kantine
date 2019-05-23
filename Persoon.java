import java.util.Date;
public class Persoon {

    private String BSN;
    private String voornaam;
    private String achternaam;
    private Date geboortedatum;
    private char geslacht;

    /**
     * Constructor voor het aanmaken van een nieuw Persoon
     *
     * @param BSN (String)
     * @param voornaam (String)
     * @param achternaam (String)
     * @param geboortedatum (Date)
     * @param geslacht (String)
     */
    public Persoon(String BSN, String voornaam, String achternaam, Date geboortedatum, char geslacht) {
        this.BSN = BSN;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
        this.geslacht = String.toLowerCase(geslacht);
        if(geslacht != "m" || "v") {
            System.err.println("Geen geldig geslacht opgegeven");
        } else {
            this.geslacht = geslacht;
        }
    }

    /**
     * Constructor voor het aanmaken van een nieuw Persoon zonder opgegeven gegevens
     */
    public Persoon() {
        this.bsn = "BSN onbekend";
        this.voornaam = "Voornaam onbekend";
        this.achternaam = "Achternaam onbekend";
        this.geboortedatum = new Date(0, 0, 0);
        this.geslacht = "Geslacht onbekend";
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
     * @param nieuweGeboortedatum (Date)
     */
    public void setGeboortedatum(Date nieuweGeboortedatum) {
        this.geboortedatum = nieuweGeboortedatum;
    }

    /**
     * Deze methode past het geslacht aan van Persoon als "man" of "vrouw"
     *
     * @param nieuwGeslacht (String)
     */
    public void setGeslacht(String nieuwGeslacht) {
        nieuwGeslacht = String.toLowerCase(nieuwGeslacht);
        if(nieuwGeslacht != "m" || (nieuwGeslacht != "v") {
            System.err.println("Geen geldig geslacht opgegeven");
        } else {
            this.geslacht = nieuwGeslacht;
        }
    }

    /**
     * Deze methode retourneert het BSN van Persoon
     *
     * @return BSN (String)
     */
    public String getBSN() {
        return this.BSN;
    }

    /**
     * Deze methode retourneert de voornaam van Persoon
     *
     * @return voornaam (String)
     */
    public String getVoornaam() {
        return this.voornaam;
    }

    /**
     * Deze methode retourneert de achternaam van Persoon
     *
     * @return achternaam (String)
     */
    public String getAchternaam() {
        return this.achternaam;
    }

    /**
     * Deze methode retourneert de geboortedatum als een String via de methode Datum.getDatumAsString()
     *
     * @return geboortedatum (String)
     */
    public String getGeboortedatum() {
        return geboortedatum.getDatumAsString();
    }

    /**
     * Deze methode geeft het geslacht terug van Persoon
     */
    public String getGeslacht() {
        if(geslacht = "v") {
            System.out.println("Vrouw");
        } else if(geslacht = "m") {
            System.out.println("Man");
        } else {
            System.out.println("Onbekend");
        }
    }

    /**
     * Deze methode geeft alle opgegeven velden terug als een string
     */
    public String toString() {
        System.out.println(this.BSN + " " + this.voornaam + " " + this.achternaam + " " + this.geboortedatum.getDatumAsString() + " " + getGeslacht());
    }

}
