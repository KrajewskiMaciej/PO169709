package ZestawE11.zad2;

public interface MessageWindow {
    abstract void display();
}
class ErrorMessage implements MessageWindow{
    @Override
    public void display(){
        System.out.println("Błąd");
        System.out.println("[Retry] [Ignore] [About]");
    }
}
class InfoMessage implements MessageWindow{
    @Override
    public void display(){
        System.out.println("Sukces");
        System.out.println("[OK]");
    }
}

class WindowDisplay{
    private MessageWindow messageWindow;

    public WindowDisplay(MessageWindow messageWindow){
        this.messageWindow=messageWindow;
    }

    public MessageWindow getMessageWindow() {
        return messageWindow;
    }

    public void setMessageWindow(){
        this.messageWindow=messageWindow;
    }

    void display(){
        messageWindow.display();
    }
}

class TestMessageWindow{
    public static void main(String[] args) {

        WindowDisplay okno1 = new WindowDisplay(new ErrorMessage());
        WindowDisplay okno2 = new WindowDisplay(new InfoMessage());

        okno1.display();
        okno2.display();

    }
}
