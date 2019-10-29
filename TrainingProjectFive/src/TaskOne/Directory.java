package TaskOne;

//Класс для задания директории файла.
class Directory {
    private String directory;

    //Контструктор и набор сеттеров и геттеров.
    Directory(String directory) {
        this.directory = directory;
    }

    String getDirectory() {
        return directory;
    }

    void setDirectory(String directory) {
        this.directory = directory;
    }
}
