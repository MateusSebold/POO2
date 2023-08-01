package Program;

public class Professor extends Pessoa {
	
	
	private int idProfessor;

	public int getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Professor [idProfessor=");
		builder.append(idProfessor);
		builder.append("]");
		return builder.toString();
	}
}
