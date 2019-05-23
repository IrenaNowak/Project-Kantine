import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class Dienblad {
    private ArrayList<Artikel> artikelen;

    /**
     * Constructor
     */
    public Dienblad() {
        // method body omitted
    }

    public Dienblad(Persoon klant) {
        // method body omitted
    }

    /**
     * Methode om artikel aan dienblad toe te voegen
     *
     * @param artikel (Artikel)
     */
    public void voegToe(Artikel artikel) {
        artikelen.add(artikel);
    }

    /**
     * Methode om aantal artikelen op dienblad te tellen
     *
     * @return Het aantal artikelen (int)
     */
    public int getAantalArtikelen() {
        return artikelen.size();
    }

    /**
     * Methode om de totaalprijs van de artikelen
     * op dienblad uit te rekenen
     *
     * @return De totaalprijs
     */
    public double getTotaalPrijs() {
        // method body omitted
    }
}

