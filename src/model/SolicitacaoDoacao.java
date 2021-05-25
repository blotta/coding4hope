package model;

/**
 * Solicitação de avaliação de um novo equipamento a ser doado
 * @author l_blo
 *
 */
public class SolicitacaoDoacao extends Solicitacao {
	private Equipamento equipamento;
	private UsuarioDoador doador;

	public Equipamento getEquipamento() {
		return equipamento;
	}
	public void setEquipamento(Equipamento equipamento) {
		this.equipamento = equipamento;
	}
	public UsuarioDoador getDoador() {
		return doador;
	}
	public void setDoador(UsuarioDoador doador) {
		this.doador = doador;
	}


}
