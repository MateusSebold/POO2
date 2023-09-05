package Project;


public class Contato  {
	
	private String nome;
	private String telefone;
	private String email;
	private String data;
	
	public Contato() {}
	
	public Contato(String nome,String telefone, String email,String data){
		setNome(nome);
		setTelefone(telefone);
		setEmail(email);
		setData(data);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Contato [Nome=" + getNome() + ", Telefone=" + getTelefone() + ", Email=" + getEmail()
				+ ", Data=" + getData() + "]";
	}

	
	
	
	
}
