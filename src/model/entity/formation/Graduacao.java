package model.entity.formation;

public class Graduacao {

	private String graduacaoNomeCurso;
	private String graduacaoNomeInstituicao;
	private String graduacaoStatus;

	public Graduacao(String graduacaoNomeCurso , String graduacaoNomeInstituicao , String graduacaoStatus) {
		
		setGraduacaoNomeCurso(graduacaoNomeCurso);
		setGraduacaoNomeInstituicao(graduacaoNomeInstituicao);
		setGraduacaoStatus(graduacaoStatus);
	}
	
	public String getGraduacaoNomeCurso() {

		return graduacaoNomeCurso;

	}

	public void setGraduacaoNomeCurso(String graduacaoNomeCurso) {

		this.graduacaoNomeCurso = graduacaoNomeCurso;

	}

	public String getGraduacaoNomeInstituicao() {

		return graduacaoNomeInstituicao;

	}

	public void setGraduacaoNomeInstituicao(String graduacaoNomeInstituicao) {

		this.graduacaoNomeInstituicao = graduacaoNomeInstituicao;

	}

	public String getGraduacaoStatus() {

		return graduacaoStatus;

	}

	public void setGraduacaoStatus(String graduacaoStatus) {

		this.graduacaoStatus = graduacaoStatus;

	}
}
