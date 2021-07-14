package model.entity.contact;

public class Contato {

	private String contatoEmail;
	private String contatoNumeroDeCelular;

	public Contato(String contatoEmail, String contatoNumeroDeCelular) {

		setContatoEmail(contatoEmail);
		setContatoNumeroDeCelular(contatoNumeroDeCelular);

	}

	public String getContatoEmail() {

		return contatoEmail;

	}

	public void setContatoEmail(String contatoEmail) {

		this.contatoEmail = contatoEmail;

	}

	public String getContatoNumeroDeCelular() {

		return contatoNumeroDeCelular;

	}

	public void setContatoNumeroDeCelular(String contatoNumeroDeCelular) {

		this.contatoNumeroDeCelular = contatoNumeroDeCelular;

	}

}
