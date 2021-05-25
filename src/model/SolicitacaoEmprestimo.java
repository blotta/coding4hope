package model;

import java.util.ArrayList;

import util.DateRange;

/**
 * Solicitação de empréstimo de um equipamento
 */
public class SolicitacaoEmprestimo extends Solicitacao {
	private ArrayList<EquipamentoClassificacao> equipamentos;
	private Beneficiario beneficiario;
	private DateRange duracao;
	private String motivo;
	private String observacoes;

	public ArrayList<EquipamentoClassificacao> getEquipamentos() {
		return equipamentos;
	}
	public void setEquipamentos(ArrayList<EquipamentoClassificacao> equipamentos) {
		this.equipamentos = equipamentos;
	}
	public Beneficiario getBeneficiario() {
		return beneficiario;
	}
	public void setBeneficiario(Beneficiario beneficiario) {
		this.beneficiario = beneficiario;
	}
	public DateRange getDuracao() {
		return duracao;
	}
	public void setDuracao(DateRange duracao) {
		this.duracao = duracao;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
