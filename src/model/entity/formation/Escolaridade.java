package model.entity.formation;

public class Escolaridade {

	private String escolaridadeNomeEscola;
	private String escolaridadeStatus;
	private String escolaridadeFormato;
	
	public Escolaridade(String escolaridadeNomeEscola , String escolaridadeStatus , String escolaridadeFormato) {
		
		setEscolaridadeNomeEscola(escolaridadeNomeEscola);
		setEscolaridadeStatus(escolaridadeStatus);
		setEscolaridadeFormato(escolaridadeFormato);
		
	}
	

	public String getEscolaridadeNomeEscola() {
		return escolaridadeNomeEscola;
	}

	public void setEscolaridadeNomeEscola(String escolaridadeNomeEscola) {
		this.escolaridadeNomeEscola = escolaridadeNomeEscola;
	}

	public String getEscolaridadeStatus() {
		return escolaridadeStatus;
	}

	public void setEscolaridadeStatus(String escolaridadeStatus) {
		this.escolaridadeStatus = escolaridadeStatus;
	}

	public String getEscolaridadeFormato() {
		return escolaridadeFormato;
	}

	public void setEscolaridadeFormato(String escolaridadeFormato) {
		this.escolaridadeFormato = escolaridadeFormato;
	}

}
