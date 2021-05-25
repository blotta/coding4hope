package model;

/**
 * Entidade que representa um equipamento
 */
public class Equipamento {
	private Integer id;
	private EquipamentoStatus status;
	private String nome;
	private EquipamentoClassificacao classificacao;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public EquipamentoStatus getStatus() {
		return status;
	}
	public void setStatus(EquipamentoStatus status) {
		this.status = status;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public EquipamentoClassificacao getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(EquipamentoClassificacao classificacao) {
		this.classificacao = classificacao;
	}
	
	

}
