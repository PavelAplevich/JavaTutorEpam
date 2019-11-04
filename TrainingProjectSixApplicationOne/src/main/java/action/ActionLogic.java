package action;

import authentication.InputValidations;
import book.Book;
import book.Catalog;
import book.EBook;
import book.PaperBook;
import logic.Logic;
import logic.Output;
import logic.email;
import person.Person;
import write.and.read.MyReader;
import write.and.read.MyWriter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ActionLogic {

    static void printCatalog(Catalog catalog){
        if(catalog.getCatalog().isEmpty()){
            Output.printOutRed("Каталог пуст!");
        } else {
            for(int i = 0; i <= catalog.getCatalog().size(); i++){
                if(i == catalog.getCatalog().size()){
                    Output.printOutCyan("Нажмите \'A\' + Enter, чтобы промотать каталог вверх..");
                    Output.printOutRed("Нажмите \'D\' + Enter, закончить просматривать каталог..");
                    if(InputValidations.checkPointer()){
                        break;
                    } else {
                        i = i - 22;
                        if(i < 0){
                            i = -1;
                        }
                        continue;
                    }
                }
                Output.printOutPurple(catalog.getCatalog().get(i).toString());
                if( (i+1)%11 == 0){
                    Output.printOutCyan("Нажмите \'A\' + Enter, чтобы промотать каталог вверх..");
                    Output.printOutCyan("Нажмите \'D\' + Enter, чтобы промотать каталог вниз..");
                    if(InputValidations.checkPointer()){
                        continue;
                    } else {
                        i = i - 22;
                        if(i < 0){
                            i = -1;
                        }
                        continue;
                    }
                } else {
                    continue;
                }
            }
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

    static void readBook(Catalog catalog) throws FileNotFoundException {
        MyReader.readBook(catalog);
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
                Book bookRemoved = Logic.removeOrReadBook(result,count);
                catalog.getCatalog().remove(bookRemoved);
                MyWriter.writeCatalog(catalog);
            }
        } else {
            Output.printOutRed("Неккоректный ввод, попробуйте ещё раз.");
            removeBook(catalog);
        }
    }

    static void offerBook(Person person) throws IOException {
        Output.printOutBlue("Введите тип книги:\n" +
                "1. Electronic book\n" +
                "2. Paper book");
        String type = addType();
        Output.printOutBlue("Введите название книги, которую вы хотите добавить:");
        String title = addString();
        Output.printOutBlue("Введите автора книги:");
        String author = addString();
        Output.printOutBlue("Введите количество страниц:");
        int pages = addInt();
        if(type.equals("eBook")){
            Output.printOutBlue("Введите полный путь до книги в вашем устройстве: ");
            String path = addString();
            email.sendEmailtoAdmin(person, new EBook(title,author,pages, path));
        } else {
            email.sendEmailtoAdmin(person, new PaperBook(title,author,pages));
        }

    }

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
