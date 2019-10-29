package TaskOne;

import java.io.FileInputStream;
import java.io.IOException;

//Класс вывода информации из файла.
class FileOutput {

    //Метод вывода в консоль.
    static void fileOut(File file){
        try{
            FileInputStream fis = new FileInputStream((file.getDirectory().getDirectory()));
            int i = -1;
            while((i = fis.read()) != -1){
                System.out.print((char)i);
            }
            fis.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
