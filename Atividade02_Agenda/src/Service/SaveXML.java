package Service;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;
import java.io.File;

import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import Project.*;

public class SaveXML {
	
	public SaveXML() {}

	
	
	public void SalvarXML(Contato contato ) {
		try {
            // Carregue o arquivo XML existente
            File arquivoXML = new File("dados.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(arquivoXML);

            // Obtenha o elemento raiz
            Element raiz = document.getDocumentElement();

            // Crie e adicione um novo elemento de pessoa
            Element novaPessoa = criarElementoContato(document, contato);
            raiz.appendChild(novaPessoa);

            // Crie um objeto Transformer para gravar os dados atualizados no arquivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes"); // Para formatar o XML

            // Grave os dados atualizados no arquivo XML
            DOMSource source = new DOMSource(document);
            StreamResult result = new StreamResult(arquivoXML);
            transformer.transform(source, result);

        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	private static Element criarElementoContato(Document document, Contato contato) {
		Element contatos = document.createElement("contatos");
		Element nomeElement = document.createElement("nome");
        Element telefoneElement = document.createElement("telefone");
        Element emailElement = document.createElement("email");
        Element dataElement = document.createElement("data");
        
        Text nomeText = document.createTextNode(contato.getNome());
        Text telefoneText = document.createTextNode(contato.getTelefone());
        Text emailText = document.createTextNode(contato.getEmail());
        Text dataText = document.createTextNode(contato.getData());


        nomeElement.appendChild(nomeText);
        telefoneElement.appendChild(telefoneText);
        emailElement.appendChild(emailText);
        dataElement.appendChild(dataText);
        
        contatos.appendChild(nomeElement);
        contatos.appendChild(telefoneElement);
        contatos.appendChild(emailElement);
        contatos.appendChild(dataElement);
        
        return contatos;
        
    }
}