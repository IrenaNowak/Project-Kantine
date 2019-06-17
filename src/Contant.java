package src;

public class Contant extends Betaalwijze {

    /**
     * Methode om betaling af te handelen
     */
    @Override
    public void betaal(double tebetalen) throws TeWeinigGeldException {
        if((saldo - tebetalen) > 0) {

            // nieuwe saldo
            saldo -= tebetalen;
        } else {
            throw new TeWeinigGeldException("Betaling is mislukt (Contant).");
        }
    }
}