# Project-Kantine

Door Irena Nowak & Aline van der Klok

Hanzehogeschool Groningen (HBO-ICT)

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

### Week 3
**Opgave 2c.** Het is niet vereist om specifiek een contructor te definiëren.
Als er geen constructor wordt gedefinieerd dan wordt er automatisch een 
standaard lege constructor gegenereerd, dit heet een default constructor.

**Opgave 2d.** Er zijn verschillende redenen waarom deze methoden static kunnen zijn. 
Deze twee methodes zouden nooit hoeven te veranderen; De methodes gebruiken
geen instantie variabelen; De methodes zijn niet afhankelijk van instantie creatie. 
De methode kan dus nog prima werken ook al zou er geen instantie van administratie gecreeërd zijn.

**Opgave 2e.** Wanneer een klasse een private constructor heeft en geen public constructors, 
dan kunnen er geen instanties van de klasse worden gemaakt. De declaratie van de
private constructor zorgt dater geen default constructor wordt gemaakt. 
Dit kan prima in administratie want er zijn geen instantievariabelen en 
er zijn alleen maar static methoden. 

**Opgave 2g.** De final zorgt ervoor dat de variabele maar één keer kan worden geïnitialiseerd 
en daarna niet meer kan worden veranderd. 

**Opgave 2h.** Wat er gebeurt is dat een variabele(int) wordt opgeroep die niet bestaat.
Er is immers geen instantie van de klasse aangemaakt met die variabele. 
De niet static variabele bestaat dus niet en is onmogelijk om aan te roepen. 
Dit kan worden opgelost door het sleutelwoord static te gebruiken.
Static methoden bestaan namelijk altijd.

**Opgave 2i.** Nu kan de variabele weer worden veranderd na de initialisatie. Dit mag niet voor
de dagen van de week want die zullen nooit veranderen. 

### Week 4

**Opgave 1b.** 
![sequence diagram](https://i.imgur.com/wLd4IU4.png)

**Opgave 1c.**
Protected betekent dat iets alleen door de subklassen gebruikt kan worden. In dit geval hebben we de instantie variabele saldo ook enkel nodig in de klassen Contant en Pinpas (die Betaalwijze extenden).

**Opgave 3a.**
Een interface kun je gebruiken door *class KlasseNaam implements InterfaceNaam* te schrijven, dus niet via new. Een interface is geen klasse op zichzelf.

**Opgave 3b.**
In Java kan je geen instanties maken van een abstracte klasse. Je kan wel een instantie maken die de abstracte klasse zelf extend.

**Opgave 3c.**
In Java kan je alleen één superklasse overerven. Vandaar dat er ook interfaces bestaan.

**Opgave 3d.**
Een klasse kan wel meerdere interfaces implementeren.

**Opgave 3e.**
Het is mogelijk in Java om tegelijkertijd een klasse te overerven en interfaces te implementeren.

**Opgave 3f.**
Methodes in interfaces zijn altijd public en abstract per definitie. Je kan een interface zien als een blauwdruk voor een klasse. Een interface heeft geen concrete methoden: ze hebben geen code erin. Je ziet in principe alleen de signatures van methoden in een interface. Wanneer je een interface implementeert, dien je de methodes van een interface zelf te definiëren in een klasse (dus de body schrijven).

**Opgave 3g.**
Abstracte methodes kunnen alleen worden geplaatst in abstracte klassen. Abstract betekent eigenlijk niets anders dat het moet worden geïmplementeerd in een subklasse (de methode zelf). Als je een normale klasse hebt met een abstracte methode zou je die NOOIT kunnen aanroepen, omdat hij dus niet geïmplementeerd is.

**Opgave 3h.**
Stel je hebt een superklasse Dier. Je hebt daarnaast twee subklassen Hond en Kat. Elke klasse heeft een methode *maakGeluid()* (abstracte methode van Dier). In de Hond klasse wil je vervolgens dat het geluid "woef" wordt en voor de Kat "miauw". Met extends *(extends Dier)* kun je de body in de klasse Kat en Hond schrijven voor deze methode. Met interfaces kun je in principe hetzelfde doen.

**Opgave 4a.**
Een klasse kan abstract zijn zonder abstracte methoden te bevatten. Deze methoden kunnen alleen worden gebruikt in een subklasse (omdat de klasse zelf dus abstract is). Het enige verschil is dat je de body van de methodes niet in een klasse hoeft te schrijven en je gewoon de functies zelf kunt aanroepen.

**Opgave 4b.**
Je zou alle abstracte methoden moeten implementeren. Wanneer dit niet zo is zou deze subklasse ook als abstract gedeclareerd moeten worden.

**Opgave 4c.**
Normaal als je een interface implementeert ga je een soort contract aan met de interface: je moet alle methoden in de interface implementeren. Wanneer je dit niet doet, zou je de klasse waarin je de interface implementeert moeten declareren als abstract om een compileerfout te voorkomen.

**Opgave 4d.**
Een instantie variabele kan niet abstract zijn. Abstracte dingen is ontworpen om later pas te "bouwen", niet om zelf te gebruiken zonder er iets aan toe te voegen.

**Opgave 4e.**
Als een methode final is betekent het dat deze niet overridden kan worden in een subklasse. Bij abstracte methoden schrijf je de body van deze methoden pas in de subklasse zelf, daarom kan een methode nooit final en abstract tegelijkertijd zijn.

### week 5
**Opgave 1d.** Het doel van de annotaties zijn:
@Id= deze variabele moet een unieke id bevatten. Deze column wordt dan de primary key
@GeneratedValue= deze variabele wordt random gegenereert. Dit betekent dat de primary key automatisch gegenereerd word.  
@Column= wordt gebruikt om de variabele een eigenschap te geven, zoals een naam

**Opgave 1e.**

![jpavoorbeeld](https://i.imgur.com/rfoGJkd.png)

**Opgave 2a.**
Omdat een student meerdere telefoonnummers kan hebben. 
Bijvoorbeeld een mobiel nummer en een vaste thuislijn.

**Opgave 2b.**
Bij de student-telefoons zal er naast de tabellen Student en Telefoons ook een derde tabel worden aangemaakt, namelijk de tabel Student_Telefoons.

Bij de student-studieinschrijving zullen er maar twee tabellen worden aangemaakt, Student en StudieInschrijving. 
Maar Student zal een foreign key krijgen. In Student zal er dus een een studieInschrijving_id komen te staan.

De meeste studenten zullen maar een studie aan het doen zijn, dus dan kan het net zo goed gelijk worden aangegeven met een foreign key i.p.v. een nieuwe tabel daarvoor aan te maken.

**Opgave 2c.**
StudieInschrijving:1----3:Student

**Opgave 2d.** 
In de tabel Student.
Dat als een entiteit embeddable is dat het in iets anders kan worden ge-embed. 
Terwijl als de entiteit embedded is dat betekent dat die entiteit wordt embed door de embeddable entiteit.

**Opgave 3.** Ja, namelijk bij de methode rekenAf.
