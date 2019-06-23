package src;

import java.util.*;

public class Kassa {

    private Artikel artikel;
    private KassaRij kassarij;
    private int afgerekendArtikel;
    private double totaalPrijs;

    /**
     * Constructor
     */
    public Kassa(KassaRij kassarij) {
        this.kassarij = kassarij;
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
        double prijs = getTotaalPrijs(klant);
        double kortingsPercentage;
        double kortingVanBedrag = 0.00;


        if(persoon instanceof KortingskaartHouder) {

            KortingskaartHouder kortingskaartHouder = (KortingskaartHouder) persoon;
            kortingsPercentage = kortingskaartHouder.geefKortingsPercentage();

            if (kortingsPercentage > 0) {
                kortingVanBedrag = prijs * kortingsPercentage;
            }

            if (kortingskaartHouder.heeftMaximum() && kortingVanBedrag > kortingskaartHouder.geefMaximum()) {
                kortingVanBedrag = kortingskaartHouder.geefMaximum();
            }
        }

        try {
            betaalwijze.betaal(prijs);
        } catch (TeWeinigGeldException exception) {
            System.err.println(exception.getMessage() + " voor: " + persoon.getVoornaam() + " "
                    + persoon.getAchternaam() + ", bedrag €" + String.format("%.2f", prijs));
        }

        afgerekendArtikel += getAantalArtikelen(klant);
        totaalPrijs += (prijs-kortingVanBedrag);

        /*
        try {
            persoon.getBetaalwijze().betaal(totaalPrijs);
            totaalPrijs += getTotaalPrijs(klant);
            afgerekendArtikel += getAantalArtikelen(klant);
        }
        catch (TeWeinigGeldException e) {
            System.err.println(klant + " Kan niet betalen. Te weinig saldo");
            System.err.println(klant.getVoornaam);
            System.err.println(klant.getAchternaam);
            System.err.println(prijs);
        }
         */
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