package src;

public class Kantinemedewerker extends Persoon implements KortingskaartHouder {

    private String medewerkersNummer;
    private boolean kassaWelOfNiet;

    public Kantinemedewerker(String medewerkersNummer, boolean kassaWelOfNiet) {
        super();
        this.medewerkersNummer = medewerkersNummer;
        this.kassaWelOfNiet = kassaWelOfNiet;
    }

    public Kantinemedewerker() {
        super();
    }

    /**
     * Methode die het medewerkersNummer van Kantinemedewerker retourneert
     *
     * @return String met medewerkersNummer
     */
    private String getMedewerkersNummer() {
        return this.medewerkersNummer;
    }

    /**
     * Methode die teruggeeft of de Kantinemedewerker achter de kassa mag werken of niet
     *
     * @return boolean met wel of niet achter kassa mogen werken
     */
    private boolean isKassaWelOfNiet() {
        return this.kassaWelOfNiet;
    }

    /**
     * Methode om het medewerkersNummer van Kantinemedewerker aan te passen
     *
     * @param nieuwMedewerkersNummer String met nieuwe medewerkersNummer
     */
    public void setMedewerkersNummer(String nieuwMedewerkersNummer) {
        this.medewerkersNummer = nieuwMedewerkersNummer;
    }

    /**
     * Methode om aan te passen of Kantinemedewerker wel of niet achter kassa mag
     *
     * @param magKassaWelOfNiet boolean met wel of niet achter kassa mogen
     */
    public void setKassaWelOfNiet(boolean magKassaWelOfNiet) {
        this.kassaWelOfNiet = magKassaWelOfNiet;
    }

    /**
     * Methode om de gegevens van Kantinemedewerker te retourneren in een String
     *
     * @return String met gegevens Kantinemedewerker
     */
    public String toString() {
        return("KANTINEMEDEWERKER: " + getMedewerkersNummer() + " "  + isKassaWelOfNiet());
    }

    @Override
    public double geefKortingsPercentage() {
        return 0.35;
    }

    @Override
    public boolean heeftMaximum() {
        return false;
    }

    @Override
    public double geefMaximum() {
        return Double.MAX_VALUE;
    }
}
