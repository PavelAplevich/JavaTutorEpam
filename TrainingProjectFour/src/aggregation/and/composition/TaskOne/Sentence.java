package aggregation.and.composition.TaskOne;

//Класс предложения.
class Sentence {
    private Word[] words;

    //Конструктор.
    Sentence(Word[] words) {
        this.words = words;
    }

    //Набор сеттеров и геттеров.
    Word[] getWords() {
        return words;
    }

    void setWords(Word[] words) {
        this.words = words;
    }

    //Переопределения toString.
    @Override
    public String toString() {
        String result = "";
        for(Word i: words){
            result = result.concat(i.toString());
        }
        return "" + result;
    }
}
