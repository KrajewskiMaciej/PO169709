public class Biuro {
    private Printer printer;

    public Biuro(Printer printer){
        this.printer=printer;
    }

    public void drukujDokument(){
        printer.drukuj();
    }
}
