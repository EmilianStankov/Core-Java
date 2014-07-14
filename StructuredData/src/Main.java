import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLStreamException;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.codehaus.jettison.mapped.MappedNamespaceConvention;
import org.codehaus.jettison.mapped.MappedXMLStreamReader;
import org.codehaus.jettison.mapped.MappedXMLStreamWriter;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Main {
    public static void main(String[] args) throws JAXBException, IOException, JSONException, XMLStreamException,
            SAXException, ParserConfigurationException {
        // XML
        CoreJavaCourse coreJava = new CoreJavaCourse();
        JAXBContext jaxbContext = JAXBContext.newInstance(CoreJavaCourse.class, Student.class);
        Marshaller m = jaxbContext.createMarshaller();
        m.setProperty(m.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(coreJava, System.out);
        m.marshal(coreJava, new File("./CoreJava"));

        Unmarshaller unm = jaxbContext.createUnmarshaller();
        CoreJavaCourse coreJava2 = (CoreJavaCourse) unm.unmarshal(new FileReader("./CoreJava"));
        System.out.println(coreJava2.toString());

        // JSON
        MappedNamespaceConvention mappedNamespaceConvention = new MappedNamespaceConvention();
        MappedXMLStreamWriter mappedXMLStreamWriter = new MappedXMLStreamWriter(mappedNamespaceConvention,
                new FileWriter(new File("./CoreJava.json")));
        m.marshal(coreJava, mappedXMLStreamWriter);

        JSONObject json = new JSONObject(
                "{\"coreJavaCourse\":{\"enrolledStudents\":[{\"studentId\":8,\"name\":\"Pesho\"},{\"studentId\":8,\"name\":\"Pesho\"}],\"courseId\":1,\"courseName\":\"Core Java\"}}");
        CoreJavaCourse coreJava3 = (CoreJavaCourse) unm.unmarshal(new MappedXMLStreamReader(json));
        System.out.println(coreJava3.toString());

        // Parsing XML
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        DefaultHandler handler = new DefaultHandler();
        saxParser.parse("/home/emilian/Downloads/metawiki-latest-stub-articles.xml", handler);
    }
}
