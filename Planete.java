public class Planete {
    //Variables d'Instance
    String nom;
    long diametre;
    Atmosphere atmosphere = new Atmosphere();

    // Variables de Classe
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



    static String expansion (double distance){
        if(distance<14){
            return "Oh la la mais c'est super rapide !";
        } else {
            return "Je rêve ou c'est plus rapide que la lumière ?";
        }
    }


}
