package Program;

public class Professor extends Pessoa {
	
	public Professor(int idProfessor,Pessoa pessoa) {
		super(pessoa.getNome(),pessoa.getSobrenome(),pessoa.getCpf());
		this.idProfessor = idProfessor;
	}
	
	public Professor() {
		
	}
	
	
	private int idProfessor;

	public int getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}
	
	
}
