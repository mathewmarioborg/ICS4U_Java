import java.io.File;
import java.io.IOException;
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
    programmer: Mathew Borg
    Date: 2021-06-6
    Program Name: U3A5P2_Borg_XMLCreate
    Program Discription: This program reads an xml file changes and adds elements by the push of btns
 */
public class XmlCommands {
    private static final String xmlName = Main.fileName; //creats string for the name of the xml file
    private static final Document doc = findXml(); //creats a Document for the program to use for reading and editing
  
    /*
        Function: findXml
        Purpose:  to initalise and create a document from the xml file for the program to use
        Parameters: n/a
        Return: Document
     */
    public static Document findXml() {
        try { //try
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance(); //creats a DocumentBuilderFactory for us to use
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder(); //creats a DocumentBuilder for us to use
            Document doc = docBuilder.parse(xmlName); //creats a Document for us to get and wright data too
            return doc; //returns the doc to the method 

        } catch (ParserConfigurationException pce) { //catches error ParserConfigurationException
            pce.printStackTrace(); //prints the Stack Trace
            return null; //return null 
        } catch (IOException ioe) { //catches error IOException
            ioe.printStackTrace(); //prints the Stack Trace
            return null; //return null 
        } catch (SAXException sae) { //catches error SAXException
            sae.printStackTrace(); //prints the Stack Trace 
            return null; //return null 
        }
    }
    
    /*
        Function: updateXml
        Purpose:  to update all new changes to the xml file
        Parameters: n/a
        Return: void
     */
    public static void updateXml() {
        try { //try
            TransformerFactory transformerFactory = TransformerFactory.newInstance(); //creats a TransformerFactory for us to use
            Transformer transformer = transformerFactory.newTransformer(); //creats a Transformer for us to use
            DOMSource source = new DOMSource(doc); //creats DOMSourse of out doc we created
            StreamResult result = new StreamResult(new File(xmlName)); //creats StreamResult for us to get edits 
            transformer.transform(source, result);//is used to update the xml with all new pending data
        } catch (TransformerException tfe) { //catch error TransformerException

        }
    }
    
    /*
        Function: addXmlElement
        Purpose:  to add new elements to xml files
        Parameters: int position is the position of the item in the xml file
                    String mainElement is the main element we are adding too
                    String newElement is the new element we are creating
                    String newElementInfo is the info we are adding to the new element
        Return: void
     */
    public static void addXmlElement(int position, String mainElement, String newElement, String newElementInfo) {
        Node element = doc.getElementsByTagName(mainElement).item(position); //creats node of doc at mainElement positon at int position
        Element addElement = doc.createElement(newElement); //creats an element in our doc and gives it the name of String newElement
        addElement.appendChild(doc.createTextNode(newElementInfo)); //adds the newElementInfo to the newElement 
        element.appendChild(addElement); //adds the new child element to the element we created 
    }
    
    /*
        Function: removeXmlElement
        Purpose:  to remove elements to xml files
        Parameters: int position is the position of the item in the xml file
                    String mainElement is the main element we are removing from
                    String removeElement is the new element we are removing
        Return: void
     */
    public static void removeXmlElement(int position, String removeElement) {
        try { //try
            Element element = (Element) doc.getElementsByTagName(removeElement).item(position);
            Node parent = element.getParentNode();
            parent.removeChild(element);
            parent.normalize();
        } catch (Exception e) { //catch expetopn e if there is nothing to remove 
            
        }
    }

    /*
        Function: updateXmlElement
        Purpose:  to update the context of elements in xml files
        Parameters: int position is the position of the item in the xml file
                    String elementName is the name of the element we are editing
                    String updatedElementInfo is the new info we are adding to the element
        Return: void
     */
    public static void updateXmlElement(int position, String elementName, String updatedElementInfo) {
        Node element = doc.getElementsByTagName(elementName).item(position); //creats node element of our doc at elementName positon at int position
        element.setTextContent(updatedElementInfo); //updates the node element context to String updatedElementInfo

    }
    
    /*
        Function: printXml
        Purpose:  to add the info from the xml file to string arrays.
        Parameters: String elementName is the name of the main element we are getting the data form
                    String subElementName the sub element we are reading
        Return: String[]
     */
    public static String[] printXml(String elementName, String subElementName) {
        NodeList listOfElements = doc.getElementsByTagName(elementName); //creats a NodeList of all the elements at String elementName
        String[] sTemp = new String[listOfElements.getLength()]; // creats a string array with the dimentions of listOfElements.getLength()

        for (int s = 0; s < listOfElements.getLength(); s++) { //creats for loop that counts up to listOfElements.getLength()
            Node firstElementNode = listOfElements.item(s); //creats node first element node at the position of s 

            Element theElement = (Element) firstElementNode; //creats element 
            NodeList theElementList = theElement.getElementsByTagName(subElementName); //creats nodeList at the element tag name at String subElementName
            Element theFirstElement = (Element) theElementList.item(0); //creats element at element position 0 
            NodeList textList = theFirstElement.getChildNodes(); // creats node list of the first element and all child elements 
            sTemp[s] = (((Node) textList.item(0)).getNodeValue().trim() + "\n"); //sets sTemp array list to the text List at positon 0 and adds a new line 
       }
        return sTemp; //return sTemp to method 
    }
}
