package aggregation.and.composition.TaskOne;

//Класс слова.
class Word {
    private String word;

    //Конструктор.
    Word(String word) {
        this.word = word;
    }

    //Набор сеттеров и геттеров.
    String getWord() {
        return word;
    }

    void setWord(String word) {
        this.word = word;
    }

    //Переопределенный toString.
    @Override
    public String toString() {
        return "" + word;
    }
}
