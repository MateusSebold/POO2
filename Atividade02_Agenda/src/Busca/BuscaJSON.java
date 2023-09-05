package Busca;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BuscaJSON extends Busca{

	@Override
	public String BuscaDados() {
		
		try {
			String conteudo = new String(Files.readAllBytes(Paths.get("dados.json")));
			return conteudo;
		} catch (IOException e) {
			e.printStackTrace();
			return " ";
		}
	}
}
