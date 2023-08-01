package Program;

public class Disciplina {
	
	protected Fase fase;
	
	private int idDisciplina;

	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina [fase=");
		builder.append(fase);
		builder.append(", idDisciplina=");
		builder.append(idDisciplina);
		builder.append("]");
		return builder.toString();
	}
}
