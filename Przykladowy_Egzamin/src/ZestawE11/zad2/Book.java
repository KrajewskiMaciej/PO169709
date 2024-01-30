package ZestawE11.zad2;

public record Book(String title, String author, int pages) {
    public Book(String title, String author, int pages){
        this.title=title;
        this.author=author;
        if(pages<=0){
            pages=50;
        }
        this.pages=pages;
    }

    public boolean isLong(){
        if(pages>=400){
            return true;
        }
        return false;
    }
}

class TestBook {
    public static void main(String[] args) {
        Book ksiazka = new Book("The Lord Of The Rings","J.R.R. Tolkien",-406);

        System.out.println(ksiazka.pages());
        System.out.println(ksiazka.isLong());
    }
}
