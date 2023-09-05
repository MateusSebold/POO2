package Program;

import java.util.ArrayList;
import java.util.List;

public class DisciplinaOfertada extends Disciplina {
	
	public DisciplinaOfertada(Disciplina disciplina) {
		super(disciplina.getIdDisciplina(), disciplina.getNome());
		this.listaFrequencias = listaFrequencias;
		this.listaAvaliacoes = listaAvaliacoes;
		this.listaProfessores = listaProfessores;
		this.listaAlunos = listaAlunos;
	}
	protected Aluno aluno;
	protected Avaliacao avaliacao;
	protected Frequencia frequencia;
	protected Professor professor;
	
	public DisciplinaOfertada() {}
	
	List<Frequencia> listaFrequencias = new ArrayList<Frequencia>();
	List<Avaliacao> listaAvaliacoes = new ArrayList<Avaliacao>();
	List<Professor> listaProfessores = new ArrayList<Professor>();
	List<Aluno> listaAlunos = new ArrayList<Aluno>();
	
	public void AdicionaFrequencia(Frequencia frequencia) {
		listaFrequencias.add(frequencia);
	}
	public void AdicionaAvalicao(Avaliacao avaliacao) {
		listaAvaliacoes.add(avaliacao);
	}
	public void AdiconaAlunos(Aluno aluno) {
		listaAlunos.add(aluno);
	}
	
	public void AdiconaProfessores(Professor professor) {
		listaProfessores.add(professor);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DisciplinaOfertada [listaFrequencias=");
		builder.append(listaFrequencias);
		builder.append(", listaAvaliacoes=");
		builder.append(listaAvaliacoes);
		builder.append(", listaProfessores=");
		builder.append(listaProfessores);
		builder.append(", listaAlunos=");
		builder.append(listaAlunos);
		builder.append(", getIdDisciplina()=");
		builder.append(getIdDisciplina());
		builder.append(", getNome()=");
		builder.append(getNome());
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
