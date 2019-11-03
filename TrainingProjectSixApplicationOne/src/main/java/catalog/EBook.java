package catalog;

public class EBook extends Book{
    private String path;

    public EBook(String title, String author, int pages, String path) {
        super(title, author, pages);
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return super.toString() + " Type:eBook" + " Path:" + path;
    }
}
