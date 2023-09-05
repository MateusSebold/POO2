package Busca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class BuscaCSV extends Busca{
	
	@Override public String BuscaDados() {
		List<String[]> dados = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("dados.csv"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] valores = linha.split(",");
                dados.add(valores);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

		StringBuilder csvBuilder = new StringBuilder();

        for (String[] linha : dados) {
            for (int i = 0; i < linha.length; i++) {
                csvBuilder.append(linha[i]);
                if (i < linha.length - 1) {
                    csvBuilder.append(",");
                }
            }
            csvBuilder.append("\n");
        }
        return csvBuilder.toString();
	}
}
