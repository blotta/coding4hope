package model;

/**
 * Solicitação de renovação do período de empréstimo de um empréstimo
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
