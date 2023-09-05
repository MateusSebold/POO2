package Program;

import java.util.List;
import java.util.ArrayList;

public class Curso {
	
	public Curso(int idCurso, String nome) {
		super();
		this.idCurso = idCurso;
		this.nome = nome;
	}
	
	public Curso() {}

	private int idCurso;
	private String nome;
	
	List<Fase> fases = new ArrayList<Fase>();
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	public int getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void AdiconaAlunos(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void AdiconaFases(Fase fase) {
		fases.add(fase);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Curso [idCurso=");
		builder.append(idCurso);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", fases=");
		builder.append(fases);
		builder.append(", alunos=");
		builder.append(alunos);
		builder.append("]");
		return builder.toString();
	}
	
	
}
