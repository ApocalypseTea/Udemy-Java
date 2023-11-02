// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class HelloUniverse {
    public static void main(String[] args) {
    /*  String phraseIntroduction="En %d, les planètes du système solaire étaient au nombre de : %d";
        int nbPlanetes=0;
        short annee=2120;

        if (annee<1600 || annee>2020){
            System.out.printf("Le programme ne peut pas fournir de résultat pour %d",annee);
        }
        else {
            if (annee < 1700) {
                nbPlanetes = 7;
            }
            else if (annee < 1800) {
                nbPlanetes = 8;
            }
            else if (annee < 2006) {
                nbPlanetes = 9;
            } else {
                nbPlanetes = 8;
            }
            System.out.printf(phraseIntroduction, annee, nbPlanetes);
        }

        for(nbPlanetes=7; nbPlanetes<=9; nbPlanetes++) {

            switch (nbPlanetes) {
                case 7:
                    System.out.println("On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes");
                    break;
                case 8:
                    System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006");
                    break;
                case 9:
                    System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8");
                    break;
                default:
                    System.out.println("Le programme ne peut pas fournir de résultat pour " + nbPlanetes);

            }
        }

     */
        Planete mercure = new Planete();
        mercure.nom = "Mercure";
        mercure.matiere = "Tellurique";
        mercure.diametre = 4879;

        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.matiere = "Tellurique";
        venus.diametre = 12013;

        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.matiere = "Tellurique";
        terre.diametre = 12756;

        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.matiere = "Tellurique";
        mars.diametre = 6792;

        Planete jupiter = new Planete();
        jupiter.diametre = 142984;
        jupiter.nom = "Jupiter";
        jupiter.matiere = "Gazeuse";

        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.matiere = "Gazeuze";
        saturne.diametre = 120536;

        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.matiere= "Gazeuze";
        uranus.diametre = 51118;
        uranus.atmosphere.hydrogene=83;
        uranus.atmosphere.helium=15;
        uranus.atmosphere.methane=2.5F;

        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.matiere = "Gazeuze";
        neptune.diametre = 49528;

        System.out.println(jupiter.nom + " est une planète " + jupiter.matiere + " avec un diamètre de " + jupiter.diametre + " kilomètres.");


//Exercice 15
        Planete neuf = new Planete();
        System.out.println(neuf.nom + " est une planète " + neuf.matiere + " avec un diamètre de " + neuf.diametre + " kilomètres.");

//Exercice 17
        neptune.revolution(-3542);
        mars.rotation(-684);
        venus.rotation(1250);

        System.out.println(neptune.nom + " a effectué " + neptune.revolution(-3542) + " tours complets autour de son étoile.");
        System.out.println(mars.nom + " a effectué " + mars.revolution(-684) + " tours complets autour d'elle-même.");
        System.out.println(venus.nom + " a effectué " + venus.revolution(1250) + " tours complets autour d'elle-même.");

//Exercice 18
        /*MODIFICATION DE LA METHODE LORS DE L'EXERCICE 20
        mars.accueillirVaisseau(8);
        mars.accueillirVaisseau("FREGATE");
        System.out.println("Le nombre d'humains ayant déjà séjourné sur Mars est actuellement de " + mars.totalVisiteurs);
        */

//Exercice 19
        System.out.println("L'atmosphère de Uranus est composée de : ");
        System.out.println("A " + uranus.atmosphere.hydrogene + "% d'hydrogène");
        System.out.println("A " + uranus.atmosphere.argon + "% d'argon");
        System.out.println("A " + uranus.atmosphere.dioxCarb + "% de dioxyde de carbone");
        System.out.println("A " + uranus.atmosphere.azote + "% d'azote");
        System.out.println("A " + uranus.atmosphere.helium + "% d'hélium");
        System.out.println("A " + uranus.atmosphere.methane + "% de méthane");
        System.out.println("A " + uranus.atmosphere.sodium + "% de sodium");

//Exercice 20
        Vaisseau fregate1= new Vaisseau();
        fregate1.type="FREGATE";
        fregate1.nbPassagers=9;

        Vaisseau croiseur1 = new Vaisseau();
        croiseur1.type="CROISEUR";
        croiseur1.nbPassagers=42;

        mars.accueillirVaisseau(fregate1);
        mars.accueillirVaisseau(croiseur1);

        System.out.println("Le nombre d'humains ayant déjà sejourné sur " + mars.nom + " est actuellement de " + mars.totalVisiteurs);
//Exercice 21 : Proprietes statiques

        System.out.println("La forme d'une planète est : " + Planete.forme);
        System.out.println("La forme de " + mars.nom +" est : " + Planete.forme);

//Exercice 22 : Methodes statiques
        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.2));


//Exercice 23 : Les constructeurs
        System.out.println("Le nombre de planètes decouvertes à ce jour est de "+Planete.nbPlaneteDecouvertes);

//Exercice 24 : Ajouter un constructeur
        Planete mercure2 = new Planete("Mercure2");
        mercure2.matiere = "Tellurique";
        mercure2.diametre = 4879;

        Planete venus2 = new Planete("Venus2");
        venus2.matiere = "Tellurique";
        venus2.diametre = 12013;

        Planete terre2 = new Planete("Terre2");
        terre2.matiere = "Tellurique";
        terre2.diametre = 12756;

        Planete mars2 = new Planete("Mars2");
        mars2.matiere = "Tellurique";
        mars2.diametre = 6792;

        Planete jupiter2 = new Planete("Jupiter2");
        jupiter2.diametre = 142984;
        jupiter2.matiere = "Gazeuse";

        Planete saturne2 = new Planete("Saturne2");
        saturne2.matiere = "Gazeuze";
        saturne2.diametre = 120536;

        Planete uranus2 = new Planete("Uranus2");
        uranus2.matiere= "Gazeuze";
        uranus2.diametre = 51118;
        uranus2.atmosphere.hydrogene=83;
        uranus2.atmosphere.helium=15;
        uranus2.atmosphere.methane=2.5F;

        Planete neptune2 = new Planete("Neptune2");
        neptune2.matiere = "Gazeuze";
        neptune2.diametre = 49528;


//EXercice 25 : Heritage
    VaisseauDeGuerre chasseur1 = new VaisseauDeGuerre();
    chasseur1.blindage=156;
    chasseur1.resistanceDuBouclier=2;
    chasseur1.type="CHASSEUR";

    VaisseauCivil vaisseauMonde1 = new VaisseauCivil();
    vaisseauMonde1.type="VAISSEAU MONDE";
    vaisseauMonde1.blindage=4784;
    vaisseauMonde1.resistanceDuBouclier=30;

    chasseur1.activerBouclier();
    vaisseauMonde1.activerBouclier();

    chasseur1.attaque(vaisseauMonde1, "lasers photoniques", 3);

    vaisseauMonde1.desactiverBouclier();
    System.out.println("Duree de protection residuelle du bouclier est de " + vaisseauMonde1.resistanceDuBouclier);
    System.out.println("Le blindage du Vaisseau Monde apres l'attaque est de " + vaisseauMonde1.blindage);

//FIN DU MAIN
    }
}