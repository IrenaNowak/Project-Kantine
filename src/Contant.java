package src;

public class Contant extends Betaalwijze {
    /**
     * Methode om betaling af te handelen
     */
    public boolean betaal(double tebetalen) {
        if(saldo >= tebetalen) {

            // nieuwe saldo
            saldo -= tebetalen;
            return true;
        }
        return false;
    }
}