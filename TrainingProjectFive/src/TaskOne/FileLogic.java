package TaskOne;

import java.io.FileOutputStream;
import java.io.IOException;

//Класс реализующий логику работы с файлом.
class FileLogic {

    //Метод удаления файла.
    static void deleteFile(File file){
        try{
            java.io.File fileIO = new java.io.File(file.getDirectory().getDirectory());
            fileIO.delete();
        } catch (StackOverflowError e){
            System.out.println(e.getMessage());
        }
    }

    //Метод вставки информации в файл.
    static void inputFile(File file, byte[] buffer){
        try{
            FileOutputStream fos = new FileOutputStream(file.getDirectory().getDirectory(), true);
            fos.write(buffer,0,buffer.length);
            fos.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
