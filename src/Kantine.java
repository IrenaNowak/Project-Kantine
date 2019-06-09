public class Kantine {

    private Kassa kassa;
    private KassaRij kassarij;
    private KantineAanbod kantineAanbod;

    /**
     * Constructor
     */
    public Kantine() {
        kassarij = new KassaRij();
        kassa = new Kassa(kassarij);
    }

    /**
     * In deze methode kiest een Persoon met een Dienblad de artikelen in artikelnamen
     *
     * @param persoon de Persoon
     * @param artikelnamen Array met artikelen
     */
    public void loopPakSluitAan(Persoon persoon, String[] artikelnamen) {
        Dienblad dienblad = new Dienblad(persoon);
        for(String artikel : artikelnamen) {
            dienblad.voegToe(kantineAanbod.getArtikel(artikel));
        }
        kassarij.sluitAchteraan(dienblad);
    }

    /**
     * Deze methode handelt de rij voor de kassa af.
     */
    public void verwerkRijVoorKassa() {
        while (kassarij.erIsEenRij()) {
            kassa.rekenAf(kassarij.eerstePersoonInRij());
        }
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

    public KantineAanbod getKantineAanbod() {
        return this.kantineAanbod;
    }

    public void setKantineAanbod(KantineAanbod nieuwKantineAanbod) {
        this.kantineAanbod = nieuwKantineAanbod;
    }
}