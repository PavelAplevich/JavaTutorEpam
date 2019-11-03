package action;

import catalog.Book;
import catalog.Catalog;
import catalog.EBook;
import catalog.PaperBook;
import logic.Logic;
import logic.Output;
import logic.email;
import person.Person;
import write.and.read.MyReader;
import write.and.read.MyWriter;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ActionLogic {

    static void printCatalog(Catalog catalog){
        if(catalog.getCatalog().isEmpty()){
            Output.printOutRed("Каталог пуст!");
        } else {
            Output.printOutPurple(catalog.toString());
        }
    }

    static void findBook(Catalog catalog){
        Output.printOutBlue("Введите название требуемой книги:");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            String str = scanner.nextLine();
            Output.printOutGreen("Список найденных книг:");
            Catalog result = MyReader.findBook(str, catalog);
            if(result.getCatalog().isEmpty()){
                Output.printOutRed("Данная книга в каталоге не найдена.");
            } else {
                Output.printOutPurple(result.toString());
            }
        } else {
            Output.printOutRed("Неккоректный ввод, попробуйте ещё раз.");
            findBook(catalog);
        }
    }

    static void readBook(Catalog catalog){

//        MyWriter.readBook();
    }

    static void addBook(Person person, Catalog catalog) throws IOException {
        Output.printOutBlue("Введите тип книги:\n" +
                "1. Electronic book\n" +
                "2. Paper book");
        String type = addType();
        Output.printOutBlue("Введите название книги:");
        String title = addString();
        Output.printOutBlue("Введите автора книги:");
        String author = addString();
        Output.printOutBlue("Введите количество страниц книги:");
        int pages = addInt();
        if(type.equals("eBook")){
            Output.printOutBlue("Введите полный путь до книги в вашем устройстве: ");
            String path = addString();
            MyWriter.addBook(new EBook(title,author,pages,path) , catalog);
            email.sendEmail(person, new EBook(title,author,pages,path));
        } else {
            MyWriter.addBook(new PaperBook(title,author,pages) , catalog);
            email.sendEmail(person, new PaperBook(title,author,pages));
        }
    }



    static void removeBook(Catalog catalog) throws IOException {
        Output.printOutBlue("Введите название требуемой книги:");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            String str = scanner.nextLine();
            Output.printOutGreen("Список найденных книг:");
            Catalog result = MyReader.findBook(str, catalog);
            if(result.getCatalog().isEmpty()){
                Output.printOutRed("Данная книга в каталоге не найдена.");
            } else {
                int count = 1;
                for(Book x: result.getCatalog()){
                    Output.printOutPurple(count + ". " + x.toString());
                    count++;
                }
                Book bookRemoved = Logic.removeBook(result,count);
                catalog.getCatalog().remove(bookRemoved);
                MyWriter.writeCatalog(catalog);
            }
        } else {
            Output.printOutRed("Неккоректный ввод, попробуйте ещё раз.");
            removeBook(catalog);
        }
    }

    //Todo  Продолжить делать логику
    static void offerBook(){}

    private static int addInt(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            try{
                int pages = scanner.nextInt();
                if(pages < 1){
                    Output.printOutRed("Некорректный ввод. Попробуйте ещё раз.");
                    return addInt();
                } else {
                    return pages;
                }
            } catch (NoSuchElementException e){
                Output.printOutRed("Некорректный ввод. Попробуйте ещё раз.");
                return addInt();
            }
        } else {
            Output.printOutRed("Некорректный ввод. Попробуйте ещё раз.");
            return addInt();
        }
    }

    private static String addString(){
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            return scanner.nextLine();
        } else {
            Output.printOutRed("Некорректный ввод. Попробуйте ещё раз.");
            return addString();
        }
    }

    private static String addType() {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            try{
                int choice = scanner.nextInt();
                if(choice != 1 && choice != 2){
                    Output.printOutRed("Некорректный ввод. Попробуйте ещё раз.");
                    return addType();
                } else {
                    if(choice == 1){return "eBook";}
                    else{return "PaperBook";}
                }
            } catch (NoSuchElementException e){
                Output.printOutRed("Некорректный ввод. Попробуйте ещё раз.");
                return addType();
            }
        } else {
            Output.printOutRed("Некорректный ввод. Попробуйте ещё раз.");
            return addType();
        }
    }
}
