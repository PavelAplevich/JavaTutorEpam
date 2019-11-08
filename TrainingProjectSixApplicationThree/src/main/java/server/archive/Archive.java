package server.archive;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Archive {
    private ArrayList<Document> documents = new ArrayList<>();

    public Archive(ArrayList<Document> documents) {
        this.documents = documents;
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }

    public static Archive createArchive() throws IOException, SAXException, ParserConfigurationException {
        //// TODO: 08.11.2019 и тут прикрутить путь, если будет время.
        File folder = new File("/home/pavlik/Documents/JavaTutorEpam/TrainingProjectSixApplicationThree/src/main/java/server/base");
        ArrayList<Document> documents = new ArrayList<>();
        File[] files = reverse(folder.listFiles());
        for(File file:files){
            documents.add(createDocument(file));
        }
        return new Archive(documents);
    }

    private static File[] reverse(File[] files){
        for (int i = 0; i < files.length / 2; i++) {
            File tmp = files[i];
            files[i] = files[files.length - i - 1];
            files[files.length - i - 1] = tmp;
        }
        return files;
    }

    private static Document createDocument(File file) throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = dbfactory.newDocumentBuilder();
        org.w3c.dom.Document doc = documentBuilder.parse(file);
        doc.getDocumentElement().normalize();
        Node node = doc.getElementsByTagName("portfolio").item(0);
        Element element = (Element) node;
        int id = Integer.parseInt(element.getAttribute("id"));
        String firstName = element.getElementsByTagName("first_name").item(0).getTextContent().trim();
        String secondName = element.getElementsByTagName("second_name").item(0).getTextContent().trim();
        String patronymic = element.getElementsByTagName("patronymic").item(0).getTextContent().trim();
        int age = Integer.parseInt(element.getElementsByTagName("age").item(0).getTextContent().trim());
        String characteristic = element.getElementsByTagName("characteristic").item(0).getTextContent().trim();
        int averageMark = Integer.parseInt(element.getElementsByTagName("average_mark").item(0).getTextContent().trim());
        String otherMarks = element.getElementsByTagName("other_marks").item(0).getTextContent().trim();
        return new Document(id, firstName, secondName, patronymic, age, characteristic, averageMark, otherMarks);
    }

    @Override
    public String toString() {
        return documents.toString();
    }
}
