package model;

import java.time.LocalDateTime;

/**
 * Entidade que representa o pedido de uma ação a ser avaliada por um colaborador
 */
public class Solicitacao {
	protected Integer id;
	protected LocalDateTime data;
	protected SolicitacaoStatus status;
	protected Usuario solicitante;
	protected UsuarioColaborador colaborador;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public SolicitacaoStatus getStatus() {
		return status;
	}
	public void setStatus(SolicitacaoStatus status) {
		this.status = status;
	}
	public Usuario getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(Usuario solicitante) {
		this.solicitante = solicitante;
	}
	public UsuarioColaborador getColaborador() {
		return colaborador;
	}
	public void setColaborador(UsuarioColaborador colaborador) {
		this.colaborador = colaborador;
	}
	
	
	/**
	 * Aprovar solicitacao pendente
	 */
	public void aprovar() {
		if (status != SolicitacaoStatus.Solicitado)
			return;
		status = SolicitacaoStatus.Aprovado;
	}
	
	/**
	 * Rejeitar solicitacao pendente
	 */
	public void rejeitar() {
		if (status != SolicitacaoStatus.Solicitado)
			return;
		status = SolicitacaoStatus.Rejeitado;
	}
}
