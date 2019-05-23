import java.util.*;
public class Persoon {

    private int BSN; // Kan int?
    private String voornaam;
    private String achternaam;
    private Date geboortedatum; // Klopt dit?
    private String geslacht;

    public Persoon(int BSN, String voornaam, String achternaam, Date geboortedatum, String geslacht) {
        this.BSN = BSN;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
        if(geslacht != "Man" || "Vrouw") {
            System.err.println("Geen geldig geslacht opgegeven")
        } else {
            this.geslacht = geslacht;
        }
    }

    public Persoon() {
        this.geboortedatum = null;
        this.geslacht = null;
    }
    public void setBSN(int nieuweBSN) {
        this.BSN = nieuweBSN;
    }

    public void setVoornaam(String nieuweVoornaam) {
        this.voornaam = nieuweVoornaamoornaam;
    }

    public void setAchternaam(String nieuweAchternaam) {
        this.achternaam = nieuweAchternaamchternaam;
    }

    public void setGeboortedatum(Date nieuweGeboortedatum) {
        this.geboortedatum = nieuweGeboortedatum;
    }

    public void setGeslacht(String nieuwGeslacht) {
        this.geslacht = nieuwGeslacht;
    }

    public int getBSN() {
        return this.BSN;
    }

    public String getVoornaam() {
        return this.voornaam;
    }

    public String getAchternaam() {
        return this.achternaam;
    }

    /**
     * NOG NADER AAN TE PASSEN!!!!
     * @return
     */
    public Date getGeboortedatum() {
        return this.geboortedatum;
        return Datum.getDatumAsString();
    }

    public String getGeslacht() {
    if(this.geslacht != "Man" || "Vrouw") {
        System.out.println("Onbekend")
    } else {
        return this.geslacht;
    }

}
