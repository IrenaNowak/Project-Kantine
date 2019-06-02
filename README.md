# Project-Kantine

Irena Nowak & Aline van der Klok

Hanzehogeschool Groningen

## Opgaven

### Week 1

**Opgave 1b.** Declaratie betekent: een nieuwe variabele aanmaken, bijvoorbeeld int totaalPrijs. Type en naam dient opgegeven te worden.
Initialiseren betekent: een waarde geven aan variabele die al gedeclareerd is, bijvoorbeeld totaalPrijs = 3. Dit mag nu omdat het type int al is toegewezen aan totaalPrijs bij de declaratie.

### Week 2
**Opgave 1.a** Bij een kassarij is het nooit zeker hoeveel klanten zich aansluiten. 
Bij een for lus moet er van te voren een limiet worden aangegeven en bij een while lus hoeft dit niet. 
Hierdoor is een while lus een betere optie, want dan kan je de coditie: "zolang er klanten in de rij staan... doe dit" gebruiken.

**Opgave 4.** Methodes die twee keer voorkwamen in Kassa & Kantine: 
aantalArtikelen() en hoeveelheidGeldInKassa()

**Opgave 5a.** Het is goed om de methodes private te maken, omdat het het makkelijker maakt om een klasse te maken. Bijvoorbeeld getArtikel() in deze opgave heeft een private functie, maar ook een public functie. De public getArtikel(String productnaam) gebruikt tijdens het retourneren de private functie getArtikel met daarin ArrayList<Artikel> stapel als parameter.
  
**Opgave 5b.** Je gebruikt een HashMap wanneer gedupliceerde waardes zijn toegestaan, maar gedupliceerde keys niet. Een HashSet gebruik je wanneer je niets gedupliceerd wilt hebben.

**Opgave 6.a** Er wordt een nieuwe kantine en random nummer generator aangemaakt.
Daarnaast wordt er een array gemaakt(hoeveelheden) van een paar waarden die random worden gekozen door de methode getRandomArray.
Deze geeft een rijtje getallen terug. Hoeveel getallen dit zijn hangt af van hoeveel artikelen er worden verkocht in de kantine.
Er wordt vervolgens een nieuwe kantineaanbod gemaakt en gevuld met de artikelnamen en artikelprijzen. Dan wordt de array hoeveelheden ook nog toegevoegd, zodat alle artikelen ook een hoeveelheid hebben.
Het kantineaanbod wordt tenslotte ingevuld in de kantine. 

**Opgave 6.b** getRandomValue heeft als parameters een minimaal getal en een maximaal getal. De random value moet dus tussen die twee getallen zitten.
de random.nextInt roept een random getal op tussen 0 en het ingevoerde getal. In dit geval is dat dus het max-min +1. 
Er wordt +1 bij de parameter gedaan want bij nextIn(int) telt hij de 0 mee(inclusief) maar het ingevoerde getal niet (exclusief). Om dit getal toch mee te laten doen, wordt er +1 bij opgedaan zodat de grenzen 0 en ingevoerd getal zijn. 
Dit geeft dan een random getal terug. Bij dit random getal wordt vervolgens het min getal opgeteld, in het geval het random getal 0 gaf en anders krijg je lager dan het minimum, en dat is uiteindelijk de randomValue.