package model.entity.people;

public class PessoaJuridica extends Usuario {
	
	private Usuario usuario;
	private String cnpj;
	private String nomeFantasia;
	private String razaoSocial;
	

	public PessoaJuridica(String cnpj, String nomeFantasia, String razaoSocial ) {
		setUsuario(usuario);
		setCnpj(cnpj);
		setNomeFantasia(nomeFantasia);
		setRazaoSocial(razaoSocial);
		
		
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getNomeFantasia() {
		return nomeFantasia;
	}


	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}


	public String getRazaoSocial() {
		return razaoSocial;
	}


	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}


	
	
}
