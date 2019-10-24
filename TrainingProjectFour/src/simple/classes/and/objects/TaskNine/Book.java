package simple.classes.and.objects.TaskNine;

//Требуемый класс Book.
class Book {
    private int id;
    private String title;
    private String author;
    private String publishingHouse;
    private int year;
    private int numberOfPages;
    private int price;
    private String bindingType;


    //Метод вывода экземпляра класса.
    void printBook(){
        BookOutput.printBook(this);
    }

    //Метод создания массива экземпляров.
    static Book[] createBook(int count){
        Book[] array = new Book[count];
        for(int i = 0; i < count; i++){
            array[i] = new Book();
        }
        return array;
    }

    //Набор сеттеров и геттеров. И переопределенный метод toString.
    int getId() {
        return id;
    }

    void setId(int id) {
        this.id = id;
    }

    String getTitle() {
        return title;
    }

    void setTitle(String title) {
        this.title = title;
    }

    String getAuthor() {
        return author;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    String getPublishingHouse() {
        return publishingHouse;
    }

    void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    int getYear() {
        return year;
    }

    void setYear(int year) {
        this.year = year;
    }

    int getNumberOfPages() {
        return numberOfPages;
    }

    void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        this.price = price;
    }

    String getBindingType() {
        return bindingType;
    }

    void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id = " + id +
                ", title = " + title +
                ", author = '" + author + '\'' +
                ", publishingHouse = '" + publishingHouse + '\'' +
                ", year = " + year +
                ", numberOfPages = " + numberOfPages +
                ", price = " + price +
                ", bindingType = '" + bindingType + '\'' +
                '}';
    }

    void setAllData(int id, String title, String author, String publishingHouse, int year, int numberOfPages, int price, String bindingType) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.bindingType = bindingType;
    }
}
