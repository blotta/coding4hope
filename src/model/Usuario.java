package model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Entidade que identifica uma pessoa interagindo com o sistema
 */
public class Usuario {
	protected Integer id;
	protected String nome;
	protected String whatsapp;
	protected Date dataNascimento;
	protected ArrayList<Permissao> permissoes;
	protected ArrayList<Endereco> enderecos;
	protected ArrayList<Beneficiario> beneficiarios;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getWhatsapp() {
		return whatsapp;
	}
	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public ArrayList<Permissao> getPermissoes() {
		return permissoes;
	}
	public void setPermissoes(ArrayList<Permissao> permissoes) {
		this.permissoes = permissoes;
	}
	public ArrayList<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(ArrayList<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	public ArrayList<Beneficiario> getBeneficiarios() {
		return beneficiarios;
	}
	public void setBeneficiarios(ArrayList<Beneficiario> beneficiarios) {
		this.beneficiarios = beneficiarios;
	}
	
	/**
	 * Cria uma SolicitacaoEmprestimo vinculada com esse usuario
	 */
	public void solicitarEmprestimo() {
		
	}
	
	/**
	 * Cria uma SolicitacaoRenovacaoEmprestimo caso o usuario tenha um Emprestimo existente
	 */
	public void solicitarRenovacaoDeEmprestimo() {
		
	}
	
	/**
	 * Cadastrar endereco para o usuario
	 * @param endereco a adicionar
	 */
	public void cadastrarEndereco(Endereco endereco) {
		
	}
	
	/**
	 * Cadastra um novo beneficiario para o usuario
	 * @param beneficiario a adicionar
	 */
	public void cadastrarBeneficiario(Beneficiario beneficiario) {
		
	}
	
	/**
	 * Considera esse usuario como um beneficiario
	 */
	public void tornarBeneficiario() {
		
	}
}
