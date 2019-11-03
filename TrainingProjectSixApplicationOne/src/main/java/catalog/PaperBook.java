package catalog;

public class PaperBook extends Book{
    public PaperBook(String title, String author, int pages) {
        super(title, author, pages);
    }

    @Override
    public String toString() {
        return super.toString() + " Type:PaperBook";
    }
}
