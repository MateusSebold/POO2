package Busca;

import java.io.File;
import java.io.StringWriter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;

public class BuscaXML extends Busca {
	
	
	@Override public String BuscaDados() {
		
		 try {
	            // Carregue o arquivo XML
	            File arquivoXML = new File("dados.xml");
	            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	            DocumentBuilder builder = factory.newDocumentBuilder();
	            Document document = builder.parse(arquivoXML);

	            // Transforme o documento em uma string XML
	            TransformerFactory transformerFactory = TransformerFactory.newInstance();
	            Transformer transformer = transformerFactory.newTransformer();
	            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes"); // Omita a declaração XML
	            StringWriter writer = new StringWriter();
	            transformer.transform(new DOMSource(document), new StreamResult(writer));
	            String xmlString = writer.toString();

	            // Imprima a string XML
	            return xmlString;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	}
	
}
