import java.io.File;
import java.io.IOException;
import javax.swing.JTextArea;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mborg
 */
public class XmlCommands {
    private static final String xmlName = Main.fileName;
    private static final Document doc = findXml();
    
    public static Document findXml() {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(xmlName);
            return doc;

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
            return null;
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return null;
        } catch (SAXException sae) {
            sae.printStackTrace();
            return null;
        }
    }

    public static void updateXml() {
        try {
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(xmlName));
            transformer.transform(source, result);
        } catch (TransformerException tfe) {

        }
    }

    public static void addXmlElement(int position, String mainElement, String newElement, String newElementInfo) {
        Node element = doc.getElementsByTagName(mainElement).item(position);
        Element addElement = doc.createElement(newElement);
        addElement.appendChild(doc.createTextNode(newElementInfo));
        element.appendChild(addElement);
    }

    public static void removeXmlElement(int position, String mainElement, String removeElement) {
        Element element = (Element) doc.getElementsByTagName(removeElement).item(position);
        element.getParentNode().removeChild(element);
        doc.normalize();
    }

    public static void updateXmlElement(int position, String elementName, String updatedElementInfo) {
        Node element = doc.getElementsByTagName(elementName).item(position);
        element.setTextContent(updatedElementInfo);

    }

    public static String[] printXml(String elementName, String subElementName, JTextArea printArea) {
        NodeList listOfElements = doc.getElementsByTagName(elementName);
        String[] sTemp = new String[listOfElements.getLength()];

        for (int s = 0; s < listOfElements.getLength(); s++) {
            Node firstElementNode = listOfElements.item(s);

            Element theElement = (Element) firstElementNode;
            NodeList theElementList = theElement.getElementsByTagName(subElementName);
            Element theFirstElement = (Element) theElementList.item(0);
            NodeList textList = theFirstElement.getChildNodes();
            sTemp[s] = (((Node) textList.item(0)).getNodeValue().trim() + "\n");
        }
        return sTemp;
    }
}
