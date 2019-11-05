/*
   В этом проекте представлено второе приложение из шестого модуля. Классы приложения расположены в своих пакетах,
   согласно логике. Код сопровожден минимальными комментариями. Основная информация по работе приложения представлена
   в файле README.md
 */

import logic.MyReader;
import logic.MyWriter;
import logic.Run;
import note.NotePad;
import output.Output;

import java.io.IOException;

/*
    Задание 2. Блокнот. Разработать консольное приложение, работающее с Заметками
    в Блокноте. Каждая Заметка это: Заметка (тема, дата создания, e-mail, сообщение).
    Общие пояснения к практическому заданию.
    • В начале работы приложения данные должны считываться из файла, в конце
    работы – сохраняться в файл.
    • У пользователя должна быть возможность найти запись по любому параметру
    или по группе параметров (группу параметров можно определить
    самостоятельно), получить требуемые записи в отсортированном виде, найти
    записи, текстовое поле которой содержит определенное слово, а также
    добавить новую запись.
    • Особое условие: поиск, сравнение и валидацию вводимой информации
    осуществлять с использованием регулярных выражений.
    • Особое условие: проверку введенной информации на валидность должен
    осуществлять код, непосредственно добавляющий информацию.
 */
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Output.printYellow("Вас приветствует приложение по работе с заметками. Выберите необходимое действие:");
        NotePad notePad = new NotePad(MyReader.getNotePad());
        Run.run(notePad);
        MyWriter.writeNotePad(notePad);
    }
}
