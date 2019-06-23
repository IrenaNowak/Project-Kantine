package src;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class Kantine {

    private Kassa kassa;
    private KassaRij kassarij;
    private KantineAanbod kantineAanbod;
    private EntityManager manager;

    /**
     * Constructor
     */
    public Kantine() {
        kassarij = new KassaRij();
        kassa = new Kassa(kassarij, manager);
    }

    /**
     * In deze methode kiest een Persoon met een Dienblad de artikelen in artikelnamen
     *
     * @param dienblad het Dienblad
     * @param artikelnamen Array met artikelen
     */
    public void loopPakSluitAan(Dienblad dienblad, String[] artikelnamen, EntityManager manager) {
        for(String artikel : artikelnamen) {
            dienblad.voegToe(kantineAanbod.getArtikel(artikel));
        }
        kassarij.sluitAchteraan(dienblad);
        this.manager = manager;
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