package action;

import authentication.Authentication;
import logic.Output;
import write.and.read.MyReader;
import write.and.read.MyWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ActionLogic {
    static URL resource = Authentication.class.getResource("Catalog.txt");
    static File file;
    static {
        try {
           file = Paths.get(resource.toURI()).toFile();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

    static void printCatalog() throws URISyntaxException, FileNotFoundException {
        MyReader.printCatalog(file);
    }

    static void findBook() throws IOException {
        Output.printOutBlue("Введите название требуемой книги:");
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            String str = scanner.nextLine();
            Output.printOutGreen("Список найденных книг:");
            MyReader.findBook(str,file);
        } else {
            Output.printOutRed("Неккоректный ввод, попробуйте ещё раз.");
            findBook();
        }
    }

    static void readBook(){}
    static void addBook() throws URISyntaxException, IOException {
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
            MyWriter.addBook(title,author,pages,type,path);
        } else {
            MyWriter.addBook(title,author,pages,type);
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
    //Todo  Продолжить делать логику
    static void removeBook(){}
    static void offerBook(){}
}
