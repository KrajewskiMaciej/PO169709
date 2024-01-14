public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom(){
        System.out.println("Uruchamiam silnik");
    }

    @Override
    public void zatrzymaj(){
        System.out.println("Zatrzymuje silnik");
    }

}
