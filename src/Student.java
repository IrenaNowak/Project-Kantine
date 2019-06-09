package src;

public class Student extends Persoon {

    private String studentNummer;
    private String studieRichting;

    /**
     * Constructor - maakt een nieuwe Student aan
     *
     * @param studentNummer String met daarin het studentNummer
     * @param studieRichting String met daarin de studieRichting
     */
    public Student(String studentNummer, String studieRichting) {
        super();
        this.studentNummer = studentNummer;
        this.studieRichting = studieRichting;
    }

    /**
     * Methode die de studentNummer van Student retourneert
     *
     * @return String studentNummer
     */
    private String getStudentNummer() {
        return this.studentNummer;
    }

    /**
     * Methode die de studieRicthing van Student retourneert
     *
     * @return String studieRichting
     */
    private String getStudieRichting() {
        return this.studieRichting;
    }

    /**
     * Methode om de studentNummer van Student aan te passen
     *
     * @param nieuwStudentNummer String van het nieuwe studentNummer
     */
    public void setStudentNummer(String nieuwStudentNummer) {
        this.studentNummer = nieuwStudentNummer;
    }

    /**
     * Methode om de studieRichting van Student aan te passen
     *
     * @param nieuweStudieRichting String met de nieuwe studieRichting
     */
    public void setStudieRichting(String nieuweStudieRichting) {
        this.studieRichting = nieuweStudieRichting;
    }

    /**
     * Methode om de informatie van Student in een String te plaatsen
     *
     * @return String met studentNummer en studieRicthing
     */
    public String toString() {
        return("STUDENT: " + getStudentNummer() + " " + getStudieRichting());
    }

}
