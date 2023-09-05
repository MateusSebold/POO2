package Program;

import java.util.List;
import java.util.ArrayList;

public class Fase {
	
	public Fase(int idFase) {
		this.idFase = idFase;
	}

	
	private int idFase;

	List<Disciplina> disciplinas = new ArrayList<Disciplina>(); 

	public int getIdFase() {
		return idFase;
	}

	public void setIdFase(int idFase) {
		this.idFase = idFase;
	}
	
	public void AdiconaDisciplina(Disciplina disciplina) {
		disciplinas.add(disciplina);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fase [idFase=");
		builder.append(idFase);
		builder.append(", disciplinas=");
		builder.append(disciplinas);
		builder.append("]");
		return builder.toString();
	}

	
	

	
	
}
