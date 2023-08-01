package Program;

public class Fase {
	
	protected Curso curso;
	
	private int idFase;

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public int getIdFase() {
		return idFase;
	}

	public void setIdFase(int idFase) {
		this.idFase = idFase;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fase [curso=");
		builder.append(curso);
		builder.append(", idFase=");
		builder.append(idFase);
		builder.append("]");
		return builder.toString();
	}
}
