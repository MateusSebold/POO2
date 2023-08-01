package Program;

import java.util.ArrayList;
import java.util.List;

public class Frequencia {
	
	protected Professor professor;
	
	private int idFrequencia;
	
	List<Professor> listaProfessores = new ArrayList<Professor>();

	public int getIdFrequencia() {
		return idFrequencia;
	}

	public void setIdFrequencia(int idFrequencia) {
		this.idFrequencia = idFrequencia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Frequencia [idFrequencia=");
		builder.append(idFrequencia);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
