package src;

import java.time.DayOfWeek;
import java.util.ArrayList;

public class Administratie {

    private static final int DAYS_IN_WEEK = 7;
    private Administratie(){ }

    /**
     * Deze methode berekent van de int array aantal de gemiddelde waarde
     *
     * @param aantal artikelen verkocht per dag
     * @return het gemiddelde
     */
    public static double berekenGemiddeldAantal(int[] aantal) {
        double totaal = 0;

        for (int getal : aantal) {
            totaal += getal;
        }

        return totaal/aantal.length;
    }

    /**
     * Deze methode berekent van de double array omzet de gemiddelde waarde
     *
     * @param omzet gemaakt per dag
     * @return het gemiddelde
     */
    public static double berekenGemiddeldeOmzet(double[] omzet) {
        double totaal = 0;

        for (double getal : omzet) {
            totaal += getal;
        }

        return totaal/omzet.length;
    }

    /**
     * Methode om dagomzet uit te rekenen.
     * Dit berekent dus de totale omzet per dag van de week met de gegevens van de array
     * Alle maandagen worden bij elkaar opgeteld, alle dinsdagen bij elkaar etc
     *
     * @param omzet van alle 7 dagen van de week
     * @return array (7 elementen) met dagomzetten
     */

    public static double[] berekenDagOmzet(double[] omzet) {
        double[] temp = new double[DAYS_IN_WEEK];

        for(int i = 0; i < DAYS_IN_WEEK; i++) {
            int j = 0;

            while((i + DAYS_IN_WEEK * j) < omzet.length) {
                temp[i] += omzet[i + DAYS_IN_WEEK * j];
                j++;

            }
        }
        return temp;
    }
}
