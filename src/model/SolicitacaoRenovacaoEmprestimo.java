package model;

/**
 * Solicita��o de renova��o do per�odo de empr�stimo de um empr�stimo
 */
public class SolicitacaoRenovacaoEmprestimo extends Solicitacao {
	private Emprestimo emprestimo;

	public Emprestimo getEmprestimo() {
		return emprestimo;
	}

	public void setEmprestimo(Emprestimo emprestimo) {
		this.emprestimo = emprestimo;
	}
}
