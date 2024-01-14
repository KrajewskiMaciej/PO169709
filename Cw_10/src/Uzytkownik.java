public class Uzytkownik {
    private Powiadomienie powiadomienie;

    public Uzytkownik(Powiadomienie powiadomienie){
        this.powiadomienie=powiadomienie;
    }

    public void powiadomOModernizacji(){
        powiadomienie.wyslij();
    }
}
