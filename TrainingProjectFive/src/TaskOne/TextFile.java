package TaskOne;

//Класс Текстовый файл, наследуется от суперкласса Файл.
class TextFile extends File{
    TextFile(String name) {
        super(name);
    }

    //Перегруженный метод для добавления строк в текстовый файл.
    void addInfo(String string){
        FileLogic.inputFile(this, string.getBytes());
    }
}
