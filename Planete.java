public class Planete {
    //Variables d'Instance
    String nom;
    String matiere;
    long diametre;
    int totalVisiteurs=0;
    Atmosphere atmosphere = new Atmosphere();
    Vaisseau vaisseauAuPort;
    boolean portPlein = false;
    static String forme = "Sphérique";
    static int nbPlaneteDecouvertes = 0;

    //Constructeur
    Planete(){
        nbPlaneteDecouvertes++;
    }

    Planete(String nomPlanete){
        this.nom=nomPlanete;
        nbPlaneteDecouvertes++;
    }


    //Méthodes
    int revolution(int angle){
        System.out.println("Je suis la planète " + nom + " et je tourne autour de mon étoile.");
        int nbTour = angle/360;
        return nbTour;
    }

    int rotation(int angle){
        System.out.println("Je suis la planète " + nom + " et je tourne sur moi-même.");
        int nbTour = angle/360;
        return nbTour;
    }

    void accueillirVaisseau(Vaisseau vaisseauArrive){
        if (portPlein){
            System.out.println("Un vaisseau de type " + vaisseauAuPort.type + " doit s'en aller");
        } else {
            System.out.println("Aucun vaisseau ne s'en va.");
            vaisseauAuPort = vaisseauArrive;
            portPlein = true;
            totalVisiteurs += vaisseauArrive.nbPassagers;
        }
    }
    void accueillirVaisseau(String typeVaisseau){
        switch (typeVaisseau){
            case "CHASSEUR" :
                totalVisiteurs += 3;
            break;
            case "FREGATE" :
                totalVisiteurs +=12;
            break;
            case "CROISEUR" :
                totalVisiteurs +=50;
            break;
            default :
        }


    }

    static String expansion (double distance){
        if(distance<14){
            return "Oh la la mais c'est super rapide !";
        } else {
            return "Je rêve ou c'est plus rapide que la lumière ?";
        }
    }


}
