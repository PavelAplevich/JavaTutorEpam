package book;

//Класс, реализующий бумажную книгу.
public class PaperBook extends Book{
    //Конструктор.
    public PaperBook(String title, String author, int pages) {
        super(title, author, pages);
    }
    //Удобный toString.
    @Override
    public String toString() {
        return super.toString() + " Type:PaperBook";
    }
}
