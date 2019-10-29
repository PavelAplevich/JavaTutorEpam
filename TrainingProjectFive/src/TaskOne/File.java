package TaskOne;

//Суперкласс Файл, реализующий базовые функции работы с файлом.
class File {
    private Directory directory;
    private String name;

    //Конструктор.
    File(String name) {
        this.name = name;
    }

    //Метод создания файла. Создает пустой файл.
    void create(Directory directory){
        directory.setDirectory(directory.getDirectory()+name);
        this.directory = directory;
        byte[] buf = "".getBytes();
        addInfo(buf);
    }

    //Метод вывода из файла.
    void fileOut(){
        FileOutput.fileOut(this);
    }

    //Метод удаления файла.
    void deleteFile(){
        FileLogic.deleteFile(this);
    }

    //Метод добавления информации в файл. В общем случае байтов.
    void addInfo(byte[] buffer){
        FileLogic.inputFile(this, buffer);
    }

    //Набор сеттеров и геттеров.
    Directory getDirectory() {
        return directory;
    }

    void setDirectory(Directory directory) {
        this.directory = directory;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }
}
