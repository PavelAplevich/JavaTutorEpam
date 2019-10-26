package aggregation.and.composition.TaskOne;

class TextLogic {

    static void printHeader(Text text){
        TextOutput.printSentence(text.getHeader());
    }

    static void printText(Text text){
        TextOutput.printText(text);
    }

    static void append(Text text, Sentence[] sentences){
        Sentence[] array = text.getText();
        Sentence[] resultArray = new Sentence[array.length + sentences.length];
        for(int i = 0; i < array.length; i++){
            resultArray[i] = array[i];
        }
        for(int i = 0; i < sentences.length;i++ ){
            resultArray[i+array.length] = sentences[i];
        }
        text.setText(resultArray);
    }
}
