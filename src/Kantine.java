package src;

public class Kantine {

    private Kassa kassa;
    private KassaRij kassarij;

    /**
     * Constructor
     */
    public Kantine() {
        kassarij = new KassaRij();
        kassa = new Kassa(kassarij);
    }

    /**
     * In deze methode wordt een Persoon en Dienblad gemaakt
     * en aan elkaar gekoppeld. Maak twee Artikelen aan
     * en plaats deze op het dienblad. Tenslotte sluit de
     * Persoon zich aan bij de rij voor de kassa.
     */
    public void loopPakSluitAan() {
        Persoon persoon = new Persoon("012345678", "Jan", "Jansen", new Datum(20, 8, 2001), 'm');
        Dienblad dienblad = new Dienblad(persoon);

        Artikel colaLight = new Artikel("Cola Light", 1.3);
        Artikel kippensoep = new Artikel("Kippensoep", 0.5);

        dienblad.voegToe(colaLight);
        dienblad.voegToe(kippensoep);

        kassarij.sluitAchteraan(dienblad);

    }

    /**
     * In deze methode kiest een Persoon met een Dienblad dee artikelen in artikelnamen
     *
     * @param persoon de Persoon
     * @param artikelnamen Array met artikelen
     */
    public void loopPakSluitAan(Persoon persoon, String[] artikelnamen) {
        Dienblad dienblad = new Dienblad(persoon);
        // ...
        kassarij.sluitAchteraan(dienblad);
    }

    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa() {
        while (kassarij.erIsEenRij()) {
            kassa.rekenAf(kassarij.eerstePersoonInRij());
        }
        //test
    }

    /**
     * Deze methode telt het geld uit de kassa
     *
     * @return hoeveelheid geld in kassa
     */
    public double hoeveelheidGeldInKassa() {
        return kassa.hoeveelheidGeldInKassa();
    }

    /**
     * Retourneert de Kassa
     *
     * @return Kassa van Kantine
     */
    public Kassa getKassa() {
        return this.kassa;
    }

    /**
     * Deze methode geeft het aantal gepasseerde artikelen.
     *
     * @return het aantal gepasseerde artikelen
     */
    public int aantalArtikelen() {
        return kassa.aantalArtikelen();
    }

    /**
     * Retourneert de KassaRij
     *
     * @return KassaRij van Kantine
     */
    public KassaRij getKassarij() {
        return this.kassarij;
    }

    /**
     * Deze methode reset de bijgehouden telling van
     * het aantal artikelen en "leegt" de inhoud van de kassa.
     */
    public void resetKassa() {
        kassa.resetKassa();
    }
}