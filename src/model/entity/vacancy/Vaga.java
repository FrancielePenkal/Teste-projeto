package model.entity.vacancy;

public class Vaga {

	private String vagaCargo;
	private int vagaCodigo; // mudar para random e constante (não repetir).
	private String vagaEscolaridade;
	private String vagaDescricao; 
	private String vagaCidade;
	private float vagaSalario;
	private String vagaRequisitos;

	public Vaga(String vagaCargo, int vagaCodigo, String vagaEscolaridade, String vagaDescricao, String vagaCidade,
			float vagaSalario , String vagaRequisitos) {

		setVagaCargo(vagaCargo);
		setVagaCodigo(vagaCodigo);
		setVagaEscolaridade(vagaEscolaridade);
		setVagaDescricao(vagaDescricao);
		setVagaCidade(vagaCidade);
		setVagaSalario(vagaSalario);
		setVagaRequisitos(vagaRequisitos);
	}

	public String getVagaCargo() {
		return vagaCargo;
	}

	public void setVagaCargo(String vagaCargo) {
		this.vagaCargo = vagaCargo;
	}

	public int getVagaCodigo() {
		return vagaCodigo;
	}

	public void setVagaCodigo(int vagaCodigo) {
		this.vagaCodigo = vagaCodigo;
	}

	public String getVagaEscolaridade() {
		return vagaEscolaridade;
	}

	public void setVagaEscolaridade(String vagaEscolaridade) {
		this.vagaEscolaridade = vagaEscolaridade;
	}

	public String getVagaDescricao() {
		return vagaDescricao;
	}

	public void setVagaDescricao(String vagaDescricao) {
		this.vagaDescricao = vagaDescricao;
	}

	public String getVagaCidade() {
		return vagaCidade;
	}

	public void setVagaCidade(String vagaCidade) {
		this.vagaCidade = vagaCidade;

	}

	public float getVagaSalario() {
		return vagaSalario;
	}

	public void setVagaSalario(float vagaSalario) {
		this.vagaSalario = vagaSalario;
	}
	
	
	public String getVagaRequisitos() {
		return vagaRequisitos;
	}

	public void setVagaRequisitos(String vagaRequisitos) {
		this.vagaRequisitos = vagaRequisitos;
	}

	public void cadastrarVaga() {
		// escrever método para cadastrar vaga
	}

	public void alterarVaga() {
		// escrever método para alterar vaga
	}

}