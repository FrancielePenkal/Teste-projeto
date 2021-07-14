package model.entity.address;
public class Endereco {

	private String cep;
	private String rua;
	private int numero;
	private String enderecoComplemento;
	private String enderecoBairro;
	private String enderecoCidade;
	private String enderecoEstado;
	private String enderecoPais;

	public Endereco(String enderecoCep, String enderecoRua, int enderecoNumero, String enderecoComplemento,
			String enderecoBairro, String enderecoCidade, String enderecoEstado, String enderecoPais) {

		setEnderecoCep(enderecoCep);
		setEnderecoRua(enderecoRua);
		setEnderecoNumero(enderecoNumero);
		setEnderecoComplemento(enderecoComplemento);
		setEnderecoBairro(enderecoBairro);
		setEnderecoCidade(enderecoCidade);
		setEnderecoEstado(enderecoEstado);
		setEnderecoPais(enderecoPais);
	}

	public String getEnderecoCep() {
		return cep;
	}

	public void setEnderecoCep(String enderecoCep) {
		this.cep = enderecoCep;
	}

	public String getEnderecoRua() {
		return rua;
	}

	public void setEnderecoRua(String enderecoRua) {
		this.rua = enderecoRua;
	}

	public int getEnderecoNumero() {
		return numero;
	}

	public void setEnderecoNumero(int enderecoNumero) {
		this.numero = enderecoNumero;
	}

	public String getEnderecoComplemento() {
		return enderecoComplemento;
	}

	public void setEnderecoComplemento(String enderecoComplemento) {
		this.enderecoComplemento = enderecoComplemento;
	}

	public String getEnderecoBairro() {
		return enderecoBairro;
	}

	public void setEnderecoBairro(String enderecoBairro) {
		this.enderecoBairro = enderecoBairro;
	}

	public String getEnderecoCidade() {
		return enderecoCidade;
	}

	public void setEnderecoCidade(String enderecoCidade) {
		this.enderecoCidade = enderecoCidade;
	}

	public String getEnderecoEstado() {
		return enderecoEstado;
	}

	public void setEnderecoEstado(String enderecoEstado) {
		this.enderecoEstado = enderecoEstado;
	}

	public String getEnderecoPais() {
		return enderecoPais;
	}

	public void setEnderecoPais(String enderecoPais) {
		this.enderecoPais = enderecoPais;
	}

	public void cadastrarEndereco() {
		// escrever método para cadastrar endereço
	}

	public void alterarEndereco() {
		// escrever método para alterar endereço
	}
}