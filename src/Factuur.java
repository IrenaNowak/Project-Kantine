package src;

import javax.persistence.*;
import java.time.LocalDate;
import java.io.Serializable;
import java.util.Iterator;

@Entity
@Table(name = "factuur")

public class Factuur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Long id;

    @Column(name = "factuur_datum", nullable = false)
    private LocalDate datum;

    @Column(name = "factuur_korting")
    private double korting;

    @Column(name = "factuur_totaal", nullable = false)
    private double totaal;

    public Factuur() {
        totaal = 0;
        korting = 0;
    }

    public Factuur(Dienblad klant, LocalDate datum) {
        this();
        this.datum = datum;

        verwerkBestelling(klant);
    }

    /**
     * Verwerk artikelen en pas kortingen toe.
     * Zet het totaal te betalen bedrag en het
     * totaal aan ontvangen kortingen.
     *
     * @param klant
     */
    private void verwerkBestelling(Dienblad klant) {
        Iterator<Artikel> prijsIterator = klant.getArtikelIterator();
        double totaalPrijs = 0;
        while(prijsIterator.hasNext()) {
            totaalPrijs += prijsIterator.next().getPrijs();
        }

        Persoon persoon = klant.getPersoon();
        double kortingsPercentage = 0;
        double kortingVanBedrag = 0;

        if(persoon instanceof KortingskaartHouder) {

            KortingskaartHouder kortingskaartHouder = (KortingskaartHouder) persoon;
            kortingsPercentage = kortingskaartHouder.geefKortingsPercentage();

            if (kortingsPercentage > 0) {
                kortingVanBedrag = totaalPrijs * kortingsPercentage;
                totaalPrijs -= kortingVanBedrag;
                this.korting = kortingVanBedrag;
            }

            if (kortingskaartHouder.heeftMaximum()) {
                kortingVanBedrag = kortingskaartHouder.geefMaximum();
                totaalPrijs -= kortingVanBedrag;
                this.korting = kortingVanBedrag;
            }
        }
        totaal += (totaalPrijs - kortingVanBedrag);
    }

    /**
     * @return double het totaalbedrag
     */
    public double getTotaal() {
        return totaal;
    }

    /**
     *
     * @return double de toegepaste korting
     */
    public double getKorting() {
        return korting;
    }

    /**
     *
     * @return String een printbaar bonnetje
     */
    public String toString() {
        return "Factuur nummer " + id + " op " + datum + "/n" +
                "Totaalprijs: " + getTotaal() + "/n" +
                "Totaal aantal korting: " + getKorting();
    }
}