package Program;
import java.util.List;
import java.util.ArrayList;


public class Aluno extends Pessoa {
	
	
	
	private int idAluno;
	private String matricula;
	
	public Aluno() {
		
	}
	
	public Aluno(Pessoa pessoa, int idAluno, String matricula ) {
		super(pessoa.getNome(), pessoa.getSobrenome(), pessoa.getCpf());
		setIdAluno(idAluno);
		setMatricula(matricula);
		
	}
	
	
	
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
	
	
	public List<Frequencia> getFrequencias() {
		return Frequencias;
	}
	public void setFrequencias(List<Frequencia> frequencias) {
		Frequencias = frequencias;
	}
	public List<Avaliacao> getAvaliacoes() {
		return Avaliacoes;
	}
	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		Avaliacoes = avaliacoes;
	}
	
	public void AdicionaFrequencia(Frequencia frequencia) {
		Frequencias.add(frequencia);
	}
	public void AdicionaAvalicao(Avaliacao avaliacao) {
		Avaliacoes.add(avaliacao);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Aluno [idAluno=");
		builder.append(idAluno);
		builder.append(", matricula=");
		builder.append(matricula);
		builder.append(", Frequencias=");
		builder.append(Frequencias);
		builder.append(", Avaliacoes=");
		builder.append(Avaliacoes);
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append(", getCpf()=");
		builder.append(getCpf());
		builder.append(", getSobrenome()=");
		builder.append(getSobrenome());
		builder.append("]");
		return builder.toString();
	}

	
	
	
	
	
	
	
	
}
