import java.util.ArrayList;
import java.util.LinkedList;

public class KassaRij {

    private ArrayList<Dienblad> rij;

    /**
     * Constructor
     */
    public KassaRij() {
        rij = new ArrayList<>();
    }

    /**
     * Persoon sluit achter in de rij aan
     * @param klant
     */
    public void sluitAchteraan(Dienblad klant) {
        rij.add(klant);
    }

    /**
     * Indien er een rij bestaat, de eerste klant uit
     * de rij verwijderen en retourneren.
     * Als er niemand in de rij staat geeft deze null terug.
     *
     * @return null als er geen klanten zijn
     *          verwijdering eerste van de rij als er wel klanten zijn
     */
    public Dienblad eerstePersoonInRij() {
        if(erIsEenRij() == true) {
            rij.remove(0);
        }
        return null;
    }

    /**
     * Methode kijkt of er personen in de rij staan.
     *
     * @return false als er geen rij is
     *          true als er wel een rij is
     */
    public boolean erIsEenRij() {
        if(rij.size() == 0) {
            return false;
        }
        else return true;
    }
}