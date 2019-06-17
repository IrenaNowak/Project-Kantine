package src;

public abstract class Betaalwijze {

    protected double saldo;

    /**
     * Methode om krediet te initialiseren
     *
     * @param saldo het saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Methode om betaling af te handelen
     *
     * @param tebetalen het bedrag dat betaald dient te worden
     */
    public abstract void betaal(double tebetalen) throws TeWeinigGeldException;
}