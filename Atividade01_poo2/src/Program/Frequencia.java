package Program;

import java.util.ArrayList;
import java.util.List;

public class Frequencia {
	
	public Frequencia(int idFrequencia, Professor professor) {
		this.idFrequencia = idFrequencia;
		this.professor =  professor;
	}
	
	public Frequencia() {}
	
	protected Professor professor;
	
	private int idFrequencia;
	

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
