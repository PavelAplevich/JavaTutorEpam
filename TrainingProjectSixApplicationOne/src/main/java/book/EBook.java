package book;

//Класс, реализующий электронную книгу.
public class EBook extends Book{
    private String path;

    //Конструктор
    public EBook(String title, String author, int pages, String path) {
        super(title, author, pages);
        this.path = path;
    }

    //Набор сеттеров и геттеров.
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    //Удобный toString.
    @Override
    public String toString() {
        return super.toString() + " Type:eBook" + " Path:" + path;
    }
}
