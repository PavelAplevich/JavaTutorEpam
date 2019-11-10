package server.myWriter;

import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Класс реализует процедуры записи в базу данных.
public class MyWriter {
    //Запись в файл при создании дела.
    public static void writeFile(File file, String[] buf, int id) throws IOException {
        FileWriter fileWriter = new FileWriter(file, true);
        fileWriter.write("<portfolio id = \"" + id + "\">\n");
        fileWriter.write("    <first_name>\n" +
                "        " + buf[1] + "\n" +
                "    </first_name>\n");
        fileWriter.write("    <second_name>\n" +
                "        " + buf[0] + "\n" +
                "    </second_name>\n");
        fileWriter.write("    <patronymic>\n" +
                "        " + buf[2] + "\n" +
                "    </patronymic>\n");
        fileWriter.write("    <age>\n" +
                "        " + buf[3] + "\n" +
                "    </age>\n");
        fileWriter.write("    <characteristic>\n" +
                "        empty\n" +
                "    </characteristic>\n");
        fileWriter.write("    <average_mark>\n" +
                "        " + buf[4] + "\n" +
                "    </average_mark>\n");
        fileWriter.write("    <other_marks>\n" +
                "        empty\n" +
                "    </other_marks>\n" +
                "</portfolio>");
        fileWriter.close();
    }

    //Перезапись файла при изменении дела.
    public static void change(int id, String string, String choice) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        string = "\n" + "        " + string + "\n    ";
        File file = new File("/Users/dariaapril/IDEA projects/TrainingProjectSixApplicationThree/src/main/java/server/base/student" + id + ".xml");
        DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = dbfactory.newDocumentBuilder();
        org.w3c.dom.Document doc = documentBuilder.parse(file);
        doc.getDocumentElement().normalize();
        doc.getElementsByTagName(choice.toLowerCase()).item(0).setTextContent(string);
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(file);
        transformer.transform(source, result);
    }
}
