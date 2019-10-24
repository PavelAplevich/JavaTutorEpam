package simple.classes.and.objects.TaskNine;

//Класс агрегирующий массив Book.
class BookArray {
    Book[] array;

    //Метод печати по году.
    void printYearList(int year){
        BookLogic.yearList(this.array, year);
    }

    //Метод печати по автору.
    void printAuthorList(String author){
        BookLogic.authorList(this.array, author);
    }

    //Метод печати по издательству.
    void printPublishingList(String publishing){
        BookLogic.publishingList(this.array, publishing);
    }

    //Конструктор и набор сеттеров и геттеров.
    BookArray(Book[] array){
        this.array = array;
    }

    public Book[] getArray() {
        return array;
    }

    public void setArray(Book[] array) {
        this.array = array;
    }
}
