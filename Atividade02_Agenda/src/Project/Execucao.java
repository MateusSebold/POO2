package Project;

import org.json.simple.parser.ParseException;

import Busca.*;
import Service.*;

public class Execucao {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		
		Project.Contato contato = new Project.Contato("Din Djarin","900 524252-7704","dindj@gmail.com","14-07-1800");
		
		SaveJson json = new SaveJson(contato);
		
		SaveXML xml = new SaveXML();
		xml.SalvarXML(contato);
		
		SaveCSV csv = new SaveCSV();
		csv.SalvaCSV(contato);
		
		Busca busca =  new BuscaCSV();
		
		
		System.out.println(busca.BuscaDados());
	}

}
