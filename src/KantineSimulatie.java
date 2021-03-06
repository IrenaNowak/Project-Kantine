package src;

import java.util.Random;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class KantineSimulatie {
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY =
            Persistence.createEntityManagerFactory("jpakantine");
    private EntityManager manager;

    private Kantine kantine;
    private KantineAanbod kantineaanbod;
    private Random random;

    // aantal artikelen
    private static final int AANTAL_ARTIKELEN = 4;

    // artikelen
    private static final String[] artikelnamen = new String[]
            {"Koffie", "Broodje pindakaas", "Broodje kaas", "Appelsap"};

    // prijzen
    private static double[] artikelprijzen = new double[]{1.50, 2.10, 1.65, 1.65};

    // minimum en maximum aantal artikelen per soort
    public static final int MIN_ARTIKELEN_PER_SOORT = 10;
    public static final int MAX_ARTIKELEN_PER_SOORT = 20;

    // minimum en maximum aantal personen per dag
    private static final int MIN_PERSONEN_PER_DAG = 50;
    private static final int MAX_PERSONEN_PER_DAG = 100;

    // minimum en maximum artikelen per persoon
    private static final int MIN_ARTIKELEN_PER_PERSOON = 1;
    private static final int MAX_ARTIKELEN_PER_PERSOON = 4;

    // aantal dagen om te simuleren
    private static final int DAGEN = 7;

    // aantal klanten
    private static final int KANS_AANTAL_STUDENTEN = 89;
    private static final int KANS_AANTAL_DOCENTEN = 10;
    private static final int KANS_AANTAL_KANTINEMEDEWERKERS = 1;

    /**
     * Constructor
     */
    public KantineSimulatie() {
        manager = ENTITY_MANAGER_FACTORY.createEntityManager();
        kantine = new Kantine(manager);
        random = new Random();
        int[] hoeveelheden = getRandomArray(
                AANTAL_ARTIKELEN,
                MIN_ARTIKELEN_PER_SOORT,
                MAX_ARTIKELEN_PER_SOORT);
        kantineaanbod = new KantineAanbod(
                artikelnamen, artikelprijzen, hoeveelheden);

        kantine.setKantineAanbod(kantineaanbod);
    }

    /**
     * Methode om een array van random getallen liggend tussen
     * min en max van de gegeven lengte te genereren
     *
     * @param lengte van de array
     * @param min    minimale grens van de array
     * @param max    maximale grens van de array
     * @return De array met random getallen
     */
    private int[] getRandomArray(int lengte, int min, int max) {
        int[] temp = new int[lengte];
        for (int i = 0; i < lengte; i++) {
            temp[i] = getRandomValue(min, max);
        }

        return temp;
    }

    /**
     * Methode om een random getal tussen min(incl)
     * en max(incl) te genereren.
     *
     * @param min minimaal getal van de value
     * @param max maximaal getal van de value
     * @return Een random getal
     */
    private int getRandomValue(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    /**
     * Methode om op basis van een array van indexen voor de array
     * artikelnamen de bijhorende array van artikelnamen te maken
     *
     * @param indexen getallen van de artikelen
     * @return De array met artikelnamen
     */
    private String[] geefArtikelNamen(int[] indexen) {
        String[] artikelen = new String[indexen.length];

        for (int i = 0; i < indexen.length; i++) {
            artikelen[i] = artikelnamen[indexen[i]];

        }

        return artikelen;
    }

    /**
     * Deze methode simuleert een aantal dagen
     * in het verloop van de kantine
     *
     * @param dagen het aantal dagen dat aangeeft hoelang de simulatie is
     */
    public void simuleer(int dagen) {
        // Administratie arrays declaratie
        int[] aantal = new int[dagen];
        double[] omzet = new double[dagen];

        // Vooraf prints
        SimulatieArt.simuleerArt();
        System.out.println("Administratie over " + dagen + " dagen: \n");

        // for lus voor dagen
        for (int i = 0; i < dagen; i++) {

            // toon dagen van de week in simulatie
            String dag = "";
            int dagNr = 0;
            switch (i) {
                case 0:
                    System.out.println("► MAANDAG");
                    dag = "maandag";
                    break;
                case 1:
                    System.out.println("\n► DINSDAG");
                    dag = "dinsdag";
                    dagNr = 1;
                    break;
                case 2:
                    System.out.println("\n► WOENSDAG");
                    dag = "woensdag";
                    dagNr = 2;
                    break;
                case 3:
                    System.out.println("\n► DONDERDAG");
                    dag = "donderdag";
                    dagNr = 3;
                    break;
                case 4:
                    System.out.println("\n► VRIJDAG");
                    dag = "vrijdag";
                    dagNr = 4;
                    break;
                case 5:
                    System.out.println("\n► ZATERDAG");
                    dag = "zaterdag";
                    dagNr = 5;
                    break;
                case 6:
                    System.out.println("\n► ZONDAG");
                    dag = "zondag";
                    dagNr = 6;
                    break;
            }

            // bedenk hoeveel personen vandaag binnen lopen
            int aantalpersonen = getRandomValue(MIN_PERSONEN_PER_DAG, MAX_PERSONEN_PER_DAG);

            // laat de personen maar komen...
            for (int j = 0; j <= aantalpersonen; j++) {

                // Genereer random persoon met nextInt()
                int randomPersoon = random.nextInt(MAX_PERSONEN_PER_DAG);

                // Declareer persoon
                Persoon persoon;
                Dienblad dienblad;

                // Wie komt er kantine binnen?
                if (randomPersoon <= KANS_AANTAL_KANTINEMEDEWERKERS) {
                    persoon = new Kantinemedewerker("4184382", "Emily", "de Vries", new Datum(27, 8, 1993), 'v', "634", false);
                    System.out.println(persoon.toString());
                } else if (randomPersoon <= KANS_AANTAL_KANTINEMEDEWERKERS + KANS_AANTAL_DOCENTEN) {
                    persoon = new Docent("324244", "Jan", "Jansen", new Datum(2, 1, 1978), 'm', "JAJA", "ICT");
                    //String BSN, String voornaam, String achternaam, Datum geboortedatum, char geslacht,
                    System.out.println(persoon.toString());
                } else {
                    persoon = new Student("8125492", "Aaliyah", "Ferraci", new Datum(23, 11, 1999), 'v', "147293", "ICT");
                    System.out.println(persoon.toString());
                }

                // Bepaal de betaalwijze
                int bepaalBetaalwijze = random.nextInt(2);

                //genereer willekeurig kredietlimiet/saldo tussen 0 en 500
                int kredietlimiet = random.nextInt(501);
                int saldo = random.nextInt(501);

                if (bepaalBetaalwijze == 0) {
                    persoon.setBetaalwijze(new Contant());
                    persoon.getBetaalwijze().setSaldo(saldo);

                } else {
                    Pinpas pinpas = new Pinpas();
                    pinpas.setKredietLimiet(kredietlimiet);
                    persoon.setBetaalwijze(pinpas);
                    persoon.getBetaalwijze().setSaldo(saldo);
                }

                dienblad = new Dienblad(persoon);
                dienblad = new Dienblad(persoon);
                System.out.println(persoon);

                // en bedenk hoeveel artikelen worden gepakt
                int aantalartikelen = getRandomValue(MIN_ARTIKELEN_PER_PERSOON, MAX_ARTIKELEN_PER_PERSOON);

                // genereer de "artikelnummers", dit zijn indexen
                // van de artikelnamen
                int[] tepakken = getRandomArray(
                        aantalartikelen, 0, AANTAL_ARTIKELEN - 1);

                // vind de artikelnamen op basis van
                // de indexen hierboven
                String[] artikelen = geefArtikelNamen(tepakken);

                // loop de kantine binnen, pak de gewenste
                // artikelen, sluit aan
                kantine.loopPakSluitAan(dienblad, artikelen);
            }

            // verwerk rij voor de kassa
            kantine.verwerkRijVoorKassa();

            // Geef Administratie arrays waarde
            aantal[i] = kantine.getKassa().aantalArtikelen();
            omzet[i] = kantine.getKassa().hoeveelheidGeldInKassa();

            // druk de dagtotalen af
            SimulatieArt.line();
            System.out.println("Het aantal verkochte artikelen is: " + kantine.getKassa().aantalArtikelen());
            System.out.println("De opbrengst is: " + String.format("%.2f", kantine.getKassa().hoeveelheidGeldInKassa()) + " euro");
            System.out.println("Er zijn zoveel mensen binnengekomen: " + aantalpersonen);

            // druk Administratie af
            SimulatieArt.line();
            System.out.println("Het gemiddelde aantal verkochte artikelen op " + dag + " is: " + String.format("%.2f", Administratie.berekenGemiddeldAantal(aantal)));
            System.out.println("De gemiddelde omzet op " + dag + " is: " + String.format("%.2f", Administratie.berekenGemiddeldeOmzet(omzet)));

            double[] dagOmzetArray = Administratie.berekenDagOmzet(omzet);
            double dagOmzet = dagOmzetArray[dagNr];
            System.out.println("De gemiddelde dagomzet op " + dag + " is: " + String.format("%.2f", dagOmzet));
            SimulatieArt.line();

            // reset de kassa voor de volgende dag
            kantine.resetKassa();
        }
            //de query voor de totale omzet van de week
            Query queryTotaleOmzet = manager.createNativeQuery(
                    "SELECT round(sum(factuur_totaal), 2) FROM factuur"
            );
            double totaleOmzet = (double) queryTotaleOmzet.getSingleResult();

            //de query voor de totale toegepaste korting van de week
            Query queryTotaleKorting = manager.createNativeQuery(
                    "SELECT round(sum(factuur_korting), 2) FROM factuur"
            );
            double totaleKorting = (double) queryTotaleKorting.getSingleResult();

            //de query voor de gemiddelde omzet van de week
            Query queryGemOmzet = manager.createNativeQuery(
                    "SELECT round(avg(factuur_totaal),2) FROM factuur"
            );
            double gemOmzet = (double) queryGemOmzet.getSingleResult();

            //de query voor de gemiddelde toegepaste korting
            Query queryGemKorting = manager.createNativeQuery(
                    "SELECT round(avg(factuur_korting), 2) FROM factuur"
            );
            double gemKorting = (double) queryGemKorting.getSingleResult();

            //de query voor de top 3 facturen met de hoogte omzet
            Query queryTop3 = manager.createNativeQuery(
                    "SELECT round((factuur_totaal), 2) FROM factuur ORDER BY factuur_totaal DESC LIMIT 3"
            );
            List top3 = queryTop3.getResultList();

            //alle query resultaten worden hier geprint
            System.out.println("De totale omzet van de week is: " + totaleOmzet + "euro");
            System.out.println("De totale toegepaste korting van de week is: " + totaleKorting + "euro");
            System.out.println("De gemiddelde omzet van de week is: " + gemOmzet + "euro");
            System.out.println("De gemiddelde toegepaste korting van de week is: " + gemKorting + "euro");
            System.out.println("De top 3 totale omzet facturen:");
            for (Object resultaat : top3) {
                System.out.println((double) resultaat + " euro");
            }

        manager.close();
        ENTITY_MANAGER_FACTORY.close();
    }


    /**
     * De simulatie starten
     */
    public static void main(String[] args) {
        int dagen;

        if (args.length == 0) {
            dagen = DAGEN;
        } else {
            dagen = Integer.parseInt(args[0]);
        }

        KantineSimulatie kantineSimulatie = new KantineSimulatie();
        kantineSimulatie.simuleer(dagen);
    }

}

