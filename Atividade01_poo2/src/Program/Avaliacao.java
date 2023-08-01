package Program;
import java.util.ArrayList; 
import java.util.List;


public class Avaliacao {
	
	protected Professor professor;
	
	private int idAvaliacao;
	private float nota;
	
	
	List<Professor> listaProfessores = new ArrayList<Professor>();
	

	public int getIdAvaliacao() {
		return idAvaliacao;
	}

	public void setIdAvaliacao(int idAvaliacao) {
		this.idAvaliacao = idAvaliacao;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Avaliacao [idAvaliacao=");
		builder.append(idAvaliacao);
		builder.append(", nota=");
		builder.append(nota);
		builder.append("]");
		return builder.toString();
	}

	
	

	
	
	
	
}
