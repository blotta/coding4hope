package model;

import java.time.LocalDateTime;

public class Solicitacao {
	private Integer id;
	private LocalDateTime data;
	private SolicitacaoStatus status;
	private Usuario solicitante;
	private UsuarioColaborador colaborador;
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
	
	
	public void aprovar() {
		if (status != SolicitacaoStatus.Solicitado)
			return;
		status = SolicitacaoStatus.Aprovado;
	}
	
	public void rejeitar() {
		if (status != SolicitacaoStatus.Solicitado)
			return;
		status = SolicitacaoStatus.Rejeitado;
	}
}
