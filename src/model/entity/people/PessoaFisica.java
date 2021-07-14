package model.entity.people;

import model.entity.experience.ExperienciaProfissional;
import model.entity.formation.CursoComplementar;
import model.entity.formation.Escolaridade;
import model.entity.formation.Graduacao;

public class PessoaFisica extends Usuario {

	private Usuario usuario;
	private String Nome;
	private String fisicaCpf;
	private byte fisicaIdade;
	private String DataNascimento;
	private String fisicaRg;
	private String fisicaPis;
	private Escolaridade escolaridade;
	private Graduacao graduacao;
	private CursoComplementar cursoComplementar;
	private ExperienciaProfissional experienciaProfissional;

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		this.Nome = nome;
	}

	public String getFisicaCpf() {
		return fisicaCpf;
	}

	public void setFisicaCpf(String fisicaCpf) {
		this.fisicaCpf = fisicaCpf;
	}

	public byte getFisicaIdade() {
		return fisicaIdade;
	}

	public void setFisicaIdade(byte fisicaIdade) {
		this.fisicaIdade = fisicaIdade;
	}

	public String getDataNascimento() {
		return DataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.DataNascimento = dataNascimento;
	}

	public String getFisicaRg() {
		return fisicaRg;
	}

	public void setFisicaRg(String fisicaRg) {
		this.fisicaRg = fisicaRg;
	}

	public String getFisicaPis() {
		return fisicaPis;
	}

	public void setFisicaPis(String fisicaPis) {
		this.fisicaPis = fisicaPis;
	}

	public Escolaridade getEscolaridade() {
		return escolaridade;
	}

	public void setEscolaridade(Escolaridade escolaridade) {
		this.escolaridade = escolaridade;
	}

	public Graduacao getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(Graduacao graduacao) {
		this.graduacao = graduacao;
	}

	public CursoComplementar getCursoComplementar() {
		return cursoComplementar;
	}

	public void setCursoComplementar(CursoComplementar cursoComplementar) {
		this.cursoComplementar = cursoComplementar;
	}

	public ExperienciaProfissional getExperienciaProfissional() {
		return experienciaProfissional;
	}

	public void setExperienciaProfissional(ExperienciaProfissional experienciaProfissional) {
		this.experienciaProfissional = experienciaProfissional;
	}

}
