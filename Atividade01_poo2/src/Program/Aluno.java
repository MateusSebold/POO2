package Program;
import java.util.List;
import java.util.ArrayList;


public class Aluno extends Pessoa {
	
	protected Frequencia frequencia;
	protected Avaliacao avaliacao;
	
	private int idAluno;
	private String matricula;
	
	List<Frequencia> Frequencias = new ArrayList<Frequencia>();
	List<Avaliacao> Avaliacoes = new ArrayList<Avaliacao>();
	
	public int getIdAluno() {
		return idAluno;
	}
	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [idAluno=");
		builder.append(idAluno);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
}
