package src;

public class Pinpas extends Betaalwijze {

    private double kredietlimiet;

    /**
     * Methode om kredietlimiet te zetten
     *
     * @param kredietlimiet het kredietlimiet van de Pinpas
     */
    public void setKredietLimiet(double kredietlimiet) {
        this.kredietlimiet = kredietlimiet;
    }

    /**
     * Methode om betaling af te handelen
     *
     * @param tebetalen Het bedrag dat betaalt dient te wordene
     */
    public boolean betaal(double tebetalen) {
        if(kredietlimiet >= tebetalen) {

            // nieuwe kredietlimiet
            kredietlimiet -= tebetalen;
            return true;
        }
        return false;
    }
}
