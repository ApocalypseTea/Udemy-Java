public class VaisseauDeGuerre extends Vaisseau{

    void attaque(Vaisseau vaisseauCible, String arme, int dureeAttaque){
        System.out.println("Un vaisseau de type " + this.type + " attaque un vaisseau de type " + vaisseauCible.type + " en utilisant l'arme " + arme + " pendant " + dureeAttaque + " minutes.");
        vaisseauCible.blindage = vaisseauCible.blindage/2;
        vaisseauCible.resistanceDuBouclier = 0;
    }


}
