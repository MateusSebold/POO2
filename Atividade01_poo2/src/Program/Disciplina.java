package Program;

public class Disciplina {
	
	public Disciplina(int idDisciplina, String nome) {
		this.idDisciplina = idDisciplina;
		this.nome = nome;
	}
	
	public Disciplina() {
		
	}

	private int idDisciplina;
	
	private String nome;
	
	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Disciplina [idDisciplina=");
		builder.append(idDisciplina);
		builder.append(", nome=");
		builder.append(nome);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
