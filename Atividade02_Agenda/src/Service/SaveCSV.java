package Service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Project.*;

public class SaveCSV {
	
	public void SalvaCSV(Contato contato) {
		
		String arquivoCSV = "dados.csv";
		
        // Le os dados existentes noCSV
        List<String[]> dadosAntigos = lerDadosCSV(arquivoCSV);

        // adiciona novos dados
        String[] novaLinha = {contato.getNome(), contato.getTelefone(), contato.getEmail(), contato.getData()};
        dadosAntigos.add(novaLinha);

        // Sobrescrever o arquivo original
        salvarDadosCSV(arquivoCSV, dadosAntigos);
		
	}
	
	private static List<String[]> lerDadosCSV(String arquivoCSV) {
        List<String[]> dados = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoCSV))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] valores = linha.split(",");
                dados.add(valores);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dados;
    }
	
	private static void salvarDadosCSV(String arquivoCSV, List<String[]> dados) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoCSV))) {
            for (String[] linha : dados) {
                writer.write(String.join(",", linha));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
