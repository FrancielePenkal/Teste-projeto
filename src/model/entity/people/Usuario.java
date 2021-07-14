package model.entity.people;

import model.entity.address.Endereco;
import model.entity.contact.Contato;

public class Usuario {

	private Contato contato;
	private Endereco endereco;
	//private 
	
	
	
	public Contato getContato() {
		return contato;
	}
	public void setContato(Contato contato) {
		this.contato = contato;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	

}