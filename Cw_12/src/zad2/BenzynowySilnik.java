package zad2;

public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom(){
        System.out.println("Brum Brum");
    }
    @Override
    public void zatrzymaj(){
        System.out.println("Pyr Pyr Pyr");
    }

}
