public class PlaneteGazeuse extends Planete{
    String matiere;
    PlaneteGazeuse(){
        super();
    }
    PlaneteGazeuse(String nomPlanete){
            this.nom=nomPlanete;
            nbPlaneteDecouvertes++;
            this.matiere="Gazeuse";
    }
}
