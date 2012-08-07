package bpel2java.uni;

public class Author {
	private String nome;
	private String cognome;

	public Author(String newNome, String newCognome) {
		nome = newNome;
		cognome = newCognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public String getAutograph() {
		return this.getNome()+" "+this.getCognome();
	}
}
