public class PlaneteTellurique extends Planete implements Habitable{
    int totalVisiteurs=0;
    Vaisseau vaisseauAuPort;
    boolean portPlein = false;
    String matiere;
    PlaneteTellurique(){
        super();
    }
    PlaneteTellurique(String nomPlanete){
        this.nom=nomPlanete;
        nbPlaneteDecouvertes++;
        this.matiere = "Tellurique";
    }

    public void accueillirVaisseau(Vaisseau vaisseauArrive){
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


}
