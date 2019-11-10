package server.authentication;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import server.persons.Administrator;
import server.persons.Person;
import server.persons.User;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

//Класс, реализующий аутентификацию пользователя.
public class Authentication {

    //Основной метод проверки.
    public static Person check(String login, String password) throws IOException, ParserConfigurationException, SAXException {
        //// TODO: 08.11.2019 прикрутить нормальный путь а не эту заглушку, если будет время.
        File file = new File("/Users/dariaapril/IDEA projects/TrainingProjectSixApplicationThree/src/main/java/server/authentication/UserList.xml");
        DocumentBuilderFactory dbfactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = dbfactory.newDocumentBuilder();
        Document doc = documentBuilder.parse(file);
        doc.getDocumentElement().normalize();
        NodeList nodeList = doc.getElementsByTagName("administrator");
        for(int i = 0; i < nodeList.getLength(); i++){
            Node node = nodeList.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                if(validation(login,password,element)){
                    return new Administrator(login,password);
                }
            }
        }
        nodeList = doc.getElementsByTagName("user");
        for(int temp = 0; temp < nodeList.getLength(); temp++){
            Node node = nodeList.item(temp);
            if(node.getNodeType() == Node.ELEMENT_NODE){
                Element element = (Element) node;
                if(validation(login,password,element)){
                    return new User(login, password);
                }
            }
        }
        throw  new NoSuchElementException("Authentication error");
    }

    //Метод-помощник для удобства.
    private static boolean validation(String login, String password, Element element){
        return element.getElementsByTagName("login").item(0).getTextContent().trim().equals(login) &&
                element.getElementsByTagName("password").item(0).getTextContent().trim().equals(password);
    }
}
