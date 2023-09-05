package Service;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
public class SaveJson {
	
	public SaveJson(Project.Contato contato) {
		
		SalvaJson(contato);
		
	}
	public void SalvaJson(Project.Contato contato)  {
		
		try {
			//faz a leitura dos dados antigos
			String conteudo = new String(Files.readAllBytes(Paths.get("dados.json")));
			JSONParser parser = new JSONParser();
			
			JSONArray contatosJSON = (JSONArray) parser.parse(conteudo);
				
			//insere os novos dados 
	        JSONObject novoContatoJSON = new JSONObject();
	        novoContatoJSON.put("Nome", contato.getNome());
	        novoContatoJSON.put("Telefone", contato.getTelefone());
	        novoContatoJSON.put("Email", contato.getEmail());
	        novoContatoJSON.put("Data", contato.getData());
	        
	        contatosJSON.add(novoContatoJSON);

	        salvarJSONNoArquivo(contatosJSON, "dados.json");
	        
		} catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
	}
	private void salvarJSONNoArquivo(JSONArray jsonArray, String nomeArquivo) {
		try (FileWriter fileWriter = new FileWriter(nomeArquivo)) {
			fileWriter.write(jsonArray.toJSONString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}