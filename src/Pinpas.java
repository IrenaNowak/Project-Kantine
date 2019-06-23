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

    // Kredietlimiet: hoeveel je maximaal op kan nemen
    // Niet meer betalen dan kredietlimiet + saldo
    @Override
    public void betaal(double tebetalen) throws TeWeinigGeldException {
        if(tebetalen <= this.kredietlimiet + this.saldo) {

            this.kredietlimiet -= tebetalen;
            this.saldo -= tebetalen;

        } else {
            throw new TeWeinigGeldException("Betaling is mislukt (Pinpas)");
        }
    }
}
