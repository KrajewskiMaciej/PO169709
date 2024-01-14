public class Student implements Comparable<Student>{
    String imie;
    double sredniaOcen;
    int rokStudiow;

    @Override
    public String toString(){
        return "Średnia: "+sredniaOcen+" Rok: "+rokStudiow;
    }

    public Student(double sredniaOcen, int rokStudiow){
        this.sredniaOcen=sredniaOcen;
        this.rokStudiow=rokStudiow;
    }

    public int compareTo(Student other){
        int wynik = (int) Math.signum(other.sredniaOcen-this.sredniaOcen);

        if(wynik == 0){
            wynik = (int) Math.signum(this.rokStudiow- other.rokStudiow);
        }
        return wynik;
    }


}
