package write.and.read;

import authentication.InputValidations;
import book.Book;
import book.Catalog;
import book.EBook;
import book.PaperBook;
import logic.Logic;
import logic.Output;
import logic.Path;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//Класс, реализующий различные считывания.
public class MyReader {

    //Метод, реализующий чтение книги из консоли.
    public static void readBook(Catalog catalog) throws FileNotFoundException {
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
                Book rightBook = Logic.removeOrReadBook(result,count);
                if(rightBook instanceof PaperBook){
                    Output.printOutRed("Выбрана бумажная книга. Вывод на экран не возможен..");
                } else {
                    EBook eBook = (EBook) rightBook;
                    showBook(eBook);
                }
            }
        } else {
            Output.printOutRed("Неккоректный ввод, попробуйте ещё раз.");
            readBook(catalog);
        }
    }

    //Метод, выводящий книгу в консоль.
    private static void showBook(EBook EBook) throws FileNotFoundException {
        FileReader fileReader = new FileReader(EBook.getPath());
        Scanner scanner = new Scanner(fileReader);
        ArrayList<String> book = new ArrayList<>();
        while (scanner.hasNext()){
            book.add(scanner.nextLine());
        }
        if(book.isEmpty()){
            Output.printOutRed("Книга пуста!");
        } else {
            for(int i = 0; i <= book.size(); i++){
                if(i == book.size()){
                    Output.printOutCyan("Нажмите \'A\' + Enter, чтобы промотать книгу вверх..");
                    Output.printOutRed("Нажмите \'D\' + Enter, закончить читать книгу..");
                    if(InputValidations.checkPointer()){
                        break;
                    } else {
                        i = i - 44;
                        if(i < 0){
                            i = -1;
                        }
                        continue;
                    }
                }
                Output.printOutPurple(book.get(i).toString());
                if( (i+1)%22 == 0){
                    Output.printOutCyan("Нажмите \'A\' + Enter, чтобы промотать книгу вверх..");
                    Output.printOutCyan("Нажмите \'D\' + Enter, чтобы промотать книгу вниз..");
                    if(InputValidations.checkPointer()){
                        continue;
                    } else {
                        i = i - 44;
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

    //Метод поиска строки в файле. Отвечает, существует ли такой пользователь и совпадает ли пароль.
    public static boolean findString(String string, File file) throws IOException {
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);
        for(;;){
            if(scanner.hasNextLine()){
                String strLogin = scanner.next();
                String strPassword = scanner.next();
                if(string.equals(strLogin)){
                    fileReader.close();
                    return true;
                } else if(string.equals(strPassword)){
                    fileReader.close();
                    return true;
                } else {
                    scanner.nextLine();
                }
            } else {
                break;
            }
        }
        fileReader.close();
        return false;
    }

    //Метод поиска книги в каталоге.
    public static Catalog findBook(String string, Catalog catalog) {
        ArrayList<Book> list = new ArrayList<>();
        for(Book x: catalog.getCatalog()){
            if (x.getTitle().equals(string)){
                list.add(x);
            }
        }
        return new Catalog(list);
    }

    //Метод поиска e-mail в каталоге.
    public static String findEmail(String login) throws IOException {
        File file = Path.getAuthentication();
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(fileReader);
        while(scanner.hasNext()){
            String strLogin = scanner.next();
            String strPassword = scanner.next();
            if(login.equals(strLogin)){
                fileReader.close();
                return scanner.next();
            } else {
                scanner.nextLine();
            }
        }
        throw new IOException("Something went wrong...");
    }
}
