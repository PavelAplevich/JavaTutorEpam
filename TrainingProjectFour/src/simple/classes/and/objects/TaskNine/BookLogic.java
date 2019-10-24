package simple.classes.and.objects.TaskNine;

//Класс с логикой класса Book.
class BookLogic {

    //Метод для вывода списка по году.
    static void yearList(Book[] array, int year){
        myList(array,year);
    }

    //Метод для вывода списка по издательству.
    static void publishingList(Book[] array, String publishing){
        myList(array,publishing);
    }

    //Метод для вывода списка по автору.
    static void authorList(Book[] array, String author){
        myList(array,author);
    }

    //Перегруженный внутренний метод для составления списков.
    private static void myList(Book[] array, String string){
        for (Book book : array) {
            if (book.getAuthor().equals(string) || book.getPublishingHouse().equals(string)) {
                book.printBook();
            }
        }
    }

    private static void myList(Book[] array, int year){
        for (Book book : array) {
            if (book.getYear() > year) {
                book.printBook();
            }
        }
    }
}
