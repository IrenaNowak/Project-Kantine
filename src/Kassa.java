package src;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.time.LocalDate;
import java.util.*;

import static java.time.LocalDate.now;

public class Kassa {

    private Artikel artikel;
    private KassaRij kassarij;
    private int afgerekendArtikel;
    private double totaalPrijs;
    private EntityManager manager;

    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij, EntityManager manager) {
        this.kassarij = kassarij;
        this.manager = manager;
    }

    /**
     * Vraag het aantal artikelen en de totaalprijs op.
     * Tel deze gegevens op bij de controletotalen die voor
     * de kassa worden bijgehouden. De implementatie wordt
     * later vervangen door een echte betaling door de persoon.
     *
     * @param klant die moet afrekenen
     */
    public void rekenAf(Dienblad klant) {
        Persoon persoon = klant.getPersoon();
        Betaalwijze betaalwijze = persoon.getBetaalwijze();
        LocalDate datum = now();
        Factuur factuur = new Factuur(klant, datum);
        double prijs = factuur.getTotaal();

            // Transactie met rollback
        EntityTransaction transaction = manager.getTransaction();

        try {
            transaction.begin();
            manager.persist(factuur);
            betaalwijze.betaal(prijs);
            transaction.commit();
        } catch (TeWeinigGeldException exception) {
            transaction.rollback();
            System.err.println(exception.getMessage() + " voor: " + persoon.getVoornaam() + " "
                    + persoon.getAchternaam() + ", bedrag €" + String.format("%.2f", prijs));
            }
            totaalPrijs += prijs;
            afgerekendArtikel += getAantalArtikelen(klant);

        }


    /**
     * Geeft het aantal artikelen dat de kassa heeft gepasseerd,
     * vanaf het moment dat de methode resetWaarden is aangeroepen.
     *
     * @return aantal artikelen
     */
    public int aantalArtikelen() {
        return afgerekendArtikel;
    }

    /**
     * Geeft het totaalbedrag van alle artikelen die de kassa
     * zijn gepasseerd, vanaf het moment dat de methode
     * resetKassa is aangeroepen.
     *
     * @return hoeveelheid geld in de kassa
     */
    public double hoeveelheidGeldInKassa() {
        return totaalPrijs;
    }

    /**
     * reset de waarden van het aantal gepasseerde artikelen en
     * de totale hoeveelheid geld in de kassa.
     */
    public void resetKassa() {
        totaalPrijs = 0;
        afgerekendArtikel = 0;
    }

    /**
     * Methode om de totaalprijs op te halen die bij een Dienblad hoort
     *
     * @param klant Dienblad van klant
     * @return double met de totaalprijs van Dienblad
     */
    public double getTotaalPrijs(Dienblad klant) {
        Iterator<Artikel> prijsIterator = klant.getArtikelIterator();
        double totaalPrijs = 0;
        while(prijsIterator.hasNext()) {
            totaalPrijs += prijsIterator.next().getPrijs();
        }
        return totaalPrijs;
    }

    /**
     * Methode om het aantal artikelen op te halen die bij een Dienblad hoort
     *
     * @param klant Dienblad van klant
     * @return int met het aantal artikelen op Dienblad
     */
    public int getAantalArtikelen(Dienblad klant) {
        Iterator<Artikel> artikelIterator = klant.getArtikelIterator();
        int aantalArtikelen = 0;
        while(artikelIterator.hasNext()) {
            aantalArtikelen++;
            artikelIterator.next();
        }
        return aantalArtikelen;
    }
}