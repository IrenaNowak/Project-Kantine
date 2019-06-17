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
     * @param tebetalen Het bedrag dat betaalt dient te worden
     */
    @Override
    public void betaal(double tebetalen) throws TeWeinigGeldException {
        if(kredietlimiet >= tebetalen && (saldo-tebetalen) > 0) {

            // nieuwe kredietlimiet
            kredietlimiet -= tebetalen;
        } else {
            throw new TeWeinigGeldException("Betaling is mislukt (Pinpas).");
        }

    }
}
