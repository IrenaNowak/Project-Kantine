package src;

public class Docent extends Persoon implements KortingskaartHouder {

    private String docentCode;
    private String afdeling;

    public Docent(String docentCode, String afdeling) {
        super();
        this.docentCode = docentCode;
        this.afdeling = afdeling;
    }

    public Docent() {
        super();
    }

    /**
     * Methode om de docentCode op te vragen
     *
     * @return String van docentCode
     */
    private String getDocentCode() {
        return this.docentCode;
    }

    /**
     * Methode om de afdeling van Docent op te vragen
     *
     * @return String van afdeling
     */
    private String getAfdeling() {
        return this.afdeling;
    }

    /**
     * Methode om de docentCode van Docent aan te passen
     *
     * @param nieuweDocentCode String van aan te passen docentCode
     */
    public void setDocentCode(String nieuweDocentCode) {
        this.docentCode = nieuweDocentCode;
    }

    /**
     * Methode om de afdeling van Docent aan te passen
     *
     * @param nieuweAfdeling String met de nieuwe afdeling
     */
    public void setAfdeling(String nieuweAfdeling) {
        this.afdeling = nieuweAfdeling;
    }

    /**
     * Methode om de gegevens van Docent in een String te plaatsen
     *
     * @return String met de gegevens van Docent
     */
    public String toString() {
        return("DOCENT: " + getDocentCode() + " " + getAfdeling());
    }

    @Override
    public double geefKortingsPercentage() {
        return 0.25;
    }

    @Override
    public boolean heeftMaximum() {
        return true;
    }

    @Override
    public double geefMaximum() {
        return 1.00;
    }
}
