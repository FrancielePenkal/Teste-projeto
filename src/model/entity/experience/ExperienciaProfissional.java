package model.entity.experience;

public class ExperienciaProfissional {

	private String empresasAnteriores; // nome das 3 últimas empresas
	private String cargosAnteriores;
	private String conclusaoDeContrato; // data de conclusão
	private String motivoDeDesligamento;
	
	
	public ExperienciaProfissional(String empresasAnteriores , String cargosAnteriores , String conclusaoDeContrato , String movitoDeDesligamento) {
		setEmpresasAnteriores(empresasAnteriores);
		setCargosAnteriores(cargosAnteriores);
		setConclusaoDeContrato(conclusaoDeContrato);
		setMotivoDeDesligamento(movitoDeDesligamento);
		
		
	}
	

	public String getConclusaoDeContrato() {
		return conclusaoDeContrato;
	}

	public void setConclusaoDeContrato(String conclusaoDeContrato) {
		this.conclusaoDeContrato = conclusaoDeContrato;
	}

	public String getMotivoDeDesligamento() {
		return motivoDeDesligamento;
	}

	public void setMotivoDeDesligamento(String motivoDeDesligamento) {
		this.motivoDeDesligamento = motivoDeDesligamento;
	}

	public String getEmpresasAnteriores() {

		return empresasAnteriores;

	}

	public void setEmpresasAnteriores(String empresasAnteriores) {

		this.empresasAnteriores = empresasAnteriores;

	}

	public String getCargosAnteriores() {
		return cargosAnteriores;
	}

	public void setCargosAnteriores(String cargosAnteriores) {
		this.cargosAnteriores = cargosAnteriores;
	}

}
