package zad1;

public record Person(String imie, int wiek) {
    public Person{
        if(wiek<0){
            wiek=0;
        }
    }
}
