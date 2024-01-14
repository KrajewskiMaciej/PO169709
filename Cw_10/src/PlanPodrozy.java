public class PlanPodrozy {
    Biletomat biletomat;

    public PlanPodrozy(Biletomat biletomat){
        this.biletomat=biletomat;
    }

    public void wystawBilet(){
        biletomat.wystawBilet();
    }

}
