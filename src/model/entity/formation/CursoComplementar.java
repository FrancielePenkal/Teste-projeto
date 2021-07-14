package model.entity.formation;

public class CursoComplementar {

	private String complementarNomeCurso;
	private String complementarInstituicao;
	private String complementarStatus;
	private String complementarCargaHoraria;
	
	public CursoComplementar(String complementarNomeCurso , String complementarInstituicao , String complementarStatus , String complementarCargaHoraria) {
		
		setComplementarNomeCurso(complementarNomeCurso);
		setComplementarInstituicao(complementarInstituicao);
		setComplementarStatus(complementarStatus);
		setComplementarCargaHoraria(complementarCargaHoraria);
		
	}
	
	
	public String getComplementarNomeCurso() {

		return complementarNomeCurso;

	}

	public void setComplementarNomeCurso(String complementarNomeCurso) {

		this.complementarNomeCurso = complementarNomeCurso;

	}

	public String getComplementarInstitcao() {

		return complementarInstituicao;

	}

	public void setComplementarInstituicao(String complementarInstituicao) {

		this.complementarInstituicao = complementarInstituicao;

	}

	public String getComplementarStatus() {

		return complementarStatus;

	}

	public void setComplementarStatus(String complementarStatus) {

		this.complementarStatus = complementarStatus;
}
	
	public String getComplementarCargaHoraria() {
		
		return complementarCargaHoraria;
	}
	
	public void setComplementarCargaHoraria(String complementarCargaHoraria) {
		
		this.complementarCargaHoraria = complementarCargaHoraria;
		
	}
}