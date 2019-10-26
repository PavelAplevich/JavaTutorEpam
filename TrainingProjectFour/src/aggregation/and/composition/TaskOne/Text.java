package aggregation.and.composition.TaskOne;

//Класс текста. Состоит из заголовка и самого текста.
class Text {
    private Sentence header;
    private Sentence[] text;

    //Конструктор.
    Text(Sentence header, Sentence[] text) {
        this.header = header;
        this.text = text;
    }

    //Метод вывода заголовка.
    void printHeader(){
        TextLogic.printHeader(this);
    }

    //Метод вывода всего текста.
    void printText(){
        TextLogic.printText(this);
    }

    //Метод добавления к тексту неопределенного количества предложений.
    void append(Sentence ... sentences){
        TextLogic.append(this, sentences);
    }

    //Переопределенный toString.
    @Override
    public String toString() {
        String result = "";
        for(Sentence i: text){
            result = result.concat(i.toString());
        }
        return "\u001B[36mYour text:\n" + "\u001B[0m\t\t\t\t\t" + header + "\n" + result ;
    }

    //Набор геттеров и сеттеров.
    Sentence[] getText() {
        return text;
    }

    void setText(Sentence[] text) {
        this.text = text;
    }

    Sentence getHeader() {
        return header;
    }

    void setHeader(Sentence header) {
        this.header = header;
    }
}
