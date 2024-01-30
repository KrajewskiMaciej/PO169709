package ZestawE11.zad1.healthcare;

public class TestHospital {
    public static void main(String[] args) {
        Hospital szpi1 = new Hospital("Jana Pawła II", 5763);
        Hospital szpi2 = new Hospital(null, 5763);
        Hospital szpi3= new Hospital("Pod wezwaniem św. Teresy", -6762);
        Hospital szpi4= new Hospital("św. Franciszka", 5763);
        Hospital szpi5= new Hospital("Jana Pawła II",5763);

        System.out.println(szpi1.equals(szpi5));
        System.out.println(szpi2);
        System.out.println(szpi3);
        System.out.println(szpi4);
        System.out.println("\n\n");

        Clinic kli1 = new Clinic("Jana Pawła II",5763, 5.0);
        Clinic kli2 = new Clinic(null,5763, 5.0);
        Clinic kli3 = new Clinic("Pod wezwaniem św. Teresy",-6762, 0.0);
        Clinic kli4 = new Clinic("św. Franciszka",5763, 27.0);
        Clinic kli5 = new Clinic("Jana Pawła II",5763, 5.0);

        System.out.println(kli1.equals(kli5));
        System.out.println(kli2);
        System.out.println(kli3);
        System.out.println(kli4);
    }
}
